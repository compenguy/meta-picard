DEPENDS += " udev "
DEPENDS += " dbus "
DEPENDS += " bluez5 "

CARGO_BUILD_FLAGS += " --features rpi "

inherit systemd pkgconfig

SRC_URI += "file://carbleurator.service"

SYSTEMD_SERVICE:${PN} = "carbleurator.service"
FILES:${PN} += "${systemd_system_unitdir}"

do_install:append() {
    # Systemd script
    install -d ${D}${systemd_system_unitdir}
    install -m 0755 ${WORKDIR}/carbleurator.service ${D}${systemd_system_unitdir}
}
