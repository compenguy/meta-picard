# Copyright 2020 Will Page <compenguy@gmail.com>
# SPDX-License-Identifier: MIT

DESCRIPTION = "An image for raspberry pi systems"
LICENSE = "MIT"

require licenses.inc
require picard.inc
IMAGE_INSTALL += "packagegroup-core-full-cmdline-initscripts"
IMAGE_INSTALL += "packagegroup-core-full-cmdline-multiuser"
IMAGE_INSTALL += "carbleurator"
BAD_RECOMMENDATIONS += "udev-hwdb"

# Configure some of the pi's hardware resources
# See meta-raspberrypi/docs/extra-build-config.md
GPU_MEM = "16"
RPI_EXTRA_CONFIG = '\n\
  # Disable triggers for LEDs\n\
  dtparam=act_led_trigger=none\n\
  dtparam_pwd_led_trigger=none\n\
  \n\
  # Some boot speed enhancements\n\
  disable_splash=1\n\
  boot_delay=0\n\
  dtoverlay=pi3-disable-wifi\n\
  # Overclock the SD card from 50 to 100MHz\n\
  # this can only be done with at least a UHS Class 1 card
  dtoverlay=sdtweak,overclock_50=100\n\
  '

IMAGE_ROOTFS_SIZE = "16384"
