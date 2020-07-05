DEPENDS += " udev "
DEPENDS += " bluez5 "

CARGO_BUILD_FLAGS += " --features rpi "

inherit systemd

SRC_URI += "file://carbleurator.service"

SYSTEMD_SERVICE_${PN} = "carbleurator.service"

do_install_append() {
    # Systemd script
    install -d ${D}${systemd_system_unitdir}
    install -m 0755 ${WORKDIR}/carbleurator.service ${D}${systemd_system_unitdir}
}
