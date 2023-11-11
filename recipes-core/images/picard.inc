# Copyright 2020 Will Page <compenguy@gmail.com>
# SPDX-License-Identifier: MIT

inherit core-image

IMAGE_FEATURES += "read-only-rootfs"

IMAGE_FEATURES += "ssh-server-openssh"

# If ptest feature is enabled, then install ptests on target
IMAGE_FEATURES += "${@bb.utils.contains('DISTRO_FEATURES', 'ptest', 'ptest-pkgs', '', d)}"
IMAGE_INSTALL += "${@bb.utils.contains('DISTRO_FEATURES', 'ptest', 'ptest-runner', '', d)}"

IMAGE_INSTALL += "packagegroup-base"
IMAGE_INSTALL += "packagegroup-core-boot"
IMAGE_INSTALL += "carbleurator"
IMAGE_INSTALL += "${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = "en-us"
KERNELDEPMODDEPEND = ""

# This is an opkg-based distro
IMAGE_INSTALL:append = " opkg"

# Add some debugging tools to the image
IMAGE_INSTALL:append = " strace ldd"
