DEPENDS += " udev "
DEPENDS += " bluez5 "

CARGO_BUILD_FLAGS += " --features rpi "

inherit systemd

SRC_URI += "file://carbleurator.service"

do_install_append() {
    # Systemd script
    install -d ${D}${nonarch_base_libdir}/systemd/system
    install -m 0755 ${WORKDIR}/carbleurator.service ${D}${nonarch_base_libdir}/systemd/system
}
