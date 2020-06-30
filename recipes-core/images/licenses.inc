# Copyright 2020 Will Page <compenguy@gmail.com>
# SPDX-License-Identifier: MIT

# Include licenses in the image, and tar-xz compress all the licenses
COPY_LIC_MANIFEST = "1"
COPY_LIC_DIRS = "1"
LICENSE_TAR = "${IMAGE_ROOTFS}/usr/share/common-licenses.tar.xz"

IMAGE_INSTALL += " xz"

tar_licenses() {
    tar -Jcf "${LICENSE_TAR}" -C "${IMAGE_ROOTFS}"/usr/share common-licenses
    rm -fR "${IMAGE_ROOTFS}"/usr/share/common-licenses
    [ ! -e "${IMAGE_ROOTFS}"/usr/share/common-licenses ]
}

ROOTFS_POSTPROCESS_COMMAND += "tar_licenses; "
