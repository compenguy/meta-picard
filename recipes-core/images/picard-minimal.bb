# Copyright 2020 Will Page <compenguy@gmail.com>
# SPDX-License-Identifier: MIT

DESCRIPTION = "An image for raspberry pi systems"
LICENSE = "MIT"

require licenses.inc
require picard.inc
IMAGE_INSTALL += "packagegroup-core-full-cmdline-initscripts"
IMAGE_INSTALL += "packagegroup-core-full-cmdline-multiuser"
BAD_RECOMMENDATIONS += "udev-hwdb"
BAD_RECOMMENDATIONS += "kernel-modules"

IMAGE_ROOTFS_SIZE = "16384"
