# Copyright 2020 Will Page <compenguy@gmail.com>
# SPDX-License-Identifier: MIT

DESCRIPTION = "An image for raspberry pi systems"
LICENSE = "MIT"

require licenses.inc
inherit core-image

IMAGE_FEATURES += "read-only-rootfs"
IMAGE_INSTALL += "packagegroup-base"
IMAGE_INSTALL += "packagegroup-core-boot"
IMAGE_INSTALL += "carbleurator"
IMAGE_INSTALL += "${CORE_IMAGE_EXTRA_INSTALL}"
BAD_RECOMMENDATIONS += "udev-hwdb"

IMAGE_LINGUAS = "en-us"
KERNELDEPMODDEPEND = ""

IMAGE_ROOTFS_SIZE = "16384"
