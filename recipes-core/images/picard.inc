# Copyright 2020 Will Page <compenguy@gmail.com>. All rights reserved.
# SPDX-License-Identifier: MIT

inherit core-image

inherit distro_features_check

IMAGE_FEATURES += "read-only-rootfs"

IMAGE_FEATURES += "ssh-server-openssh"

# If ptest feature is enabled, then install ptests on target
IMAGE_FEATURES += "${@bb.utils.contains('DISTRO_FEATURES', 'ptest', 'ptest-pkgs', '', d)}"
IMAGE_INSTALL += "${@bb.utils.contains('DISTRO_FEATURES', 'ptest', 'ptest-runner', '', d)}"

IMAGE_INSTALL += "packagegroup-base"
IMAGE_INSTALL += "packagegroup-core-boot"
IMAGE_INSTALL += "${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = "en-us"
KERNELDEPMODDEPEND = ""

# This is an opkg-based distro
IMAGE_INSTALL_append += "opkg"

# Sets the appropriate network configuration and tools
IMAGE_INSTALL_append += "iproute2"
# If systemd enabled, add init-ifupdown for the /etc/network/interfaces file
# If systemd disabled, depend on dhcp-client
IMAGE_INSTALL_append += "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'init-ifupdown', 'dhcp-client', d)}"

# Add some debugging tools to the image
IMAGE_INSTALL_append += "tcpdump strace ldd"

