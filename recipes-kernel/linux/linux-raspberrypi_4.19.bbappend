FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

CMDLINE_append += " quiet "

SRC_URI += "file://filesystems.cfg"
SRC_URI += "file://networking.cfg"

