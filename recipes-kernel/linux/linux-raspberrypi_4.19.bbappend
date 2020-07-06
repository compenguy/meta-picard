FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

CMDLINE_append += " quiet "

SRC_URI += "file://filesystems.cfg"
SRC_URI += "file://media.cfg"
SRC_URI += "file://misc.cfg"
SRC_URI += "file://networking.cfg"

