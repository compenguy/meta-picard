# Copyright 2020 Will Page <compenguy@gmail.com>
# SPDX-License-Identifier: MIT

inherit cargo

SRC_URI = "git://github.com/compenguy/carbleurator.git;protocol=https"
SRCREV="cbfbf7153c8d2cf5159be4fcd786c886ba6be3de"
LIC_FILES_CHKSUM="file://LICENSE;md5=2275f06e3aa54055ecedfb59b495e6c1"

SUMMARY = "An application to control a BLE-enabled RC car with a USB gamepad"
HOMEPAGE = "https://github.com/compenguy/carbleurator"
LICENSE = "MIT"

S = "${WORKDIR}/git"

BBCLASSEXTEND = "native"

