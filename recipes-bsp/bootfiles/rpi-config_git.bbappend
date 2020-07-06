FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Configure some of the pi's hardware resources
# See meta-raspberrypi/docs/extra-build-config.md
GPU_MEM = "16"

# override the existing one, because there's no other way to have the last word
# on whether audio is off or on
do_deploy_append_raspberrypi3-64() {
    echo "# have a properly sized image" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "disable_overscan=1" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt

    echo "# Enable audio (loads snd_bcm2835)" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "dtparam=audio=off" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt

    echo "# Disable triggers for LEDs" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "dtparam=act_led_trigger=none" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "dtparam=pwr_led_trigger=none" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "# Some boot speed enhancements" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "disable_splash=1" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "boot_delay=0" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "dtoverlay=pi3-disable-wifi" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "# Overclock the SD card from 50 to 100MHz" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "# this can only be done with at least a UHS Class 1 card" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "dtoverlay=sdtweak,overclock_50=100" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}

