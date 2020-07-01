# Auto-Generated by cargo-bitbake 0.3.13
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get carbleurator could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/carbleurator/0.1.0"
SRC_URI += "git://git@github.com/compenguy/carbleurator.git;protocol=ssh;nobranch=1"
SRCREV = "cbfbf7153c8d2cf5159be4fcd786c886ba6be3de"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV_append = ".AUTOINC+cbfbf7153c"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/addr2line/0.12.2 \
    crate://crates.io/adler32/1.1.0 \
    crate://crates.io/anyhow/1.0.31 \
    crate://crates.io/async-std/1.6.2 \
    crate://crates.io/async-task/3.0.0 \
    crate://crates.io/autocfg/1.0.0 \
    crate://crates.io/backtrace/0.3.49 \
    crate://crates.io/base-x/0.2.6 \
    crate://crates.io/bitflags/1.2.1 \
    crate://crates.io/block/0.1.6 \
    crate://crates.io/blocking/0.4.6 \
    crate://crates.io/btleplug/0.4.3 \
    crate://crates.io/bumpalo/3.4.0 \
    crate://crates.io/bytes/0.5.5 \
    crate://crates.io/cache-padded/1.1.0 \
    crate://crates.io/cc/1.0.56 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/cocoa/0.20.2 \
    crate://crates.io/concurrent-queue/1.1.1 \
    crate://crates.io/core-foundation-sys/0.6.2 \
    crate://crates.io/core-foundation-sys/0.7.0 \
    crate://crates.io/core-foundation/0.6.4 \
    crate://crates.io/core-foundation/0.7.0 \
    crate://crates.io/core-graphics/0.19.2 \
    crate://crates.io/crossbeam-utils/0.7.2 \
    crate://crates.io/discard/1.0.4 \
    crate://crates.io/enum_primitive/0.1.1 \
    crate://crates.io/failure/0.1.8 \
    crate://crates.io/failure_derive/0.1.8 \
    crate://crates.io/fastrand/1.3.2 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/futures-channel/0.3.5 \
    crate://crates.io/futures-core/0.3.5 \
    crate://crates.io/futures-io/0.3.5 \
    crate://crates.io/futures-sink/0.3.5 \
    crate://crates.io/futures-task/0.3.5 \
    crate://crates.io/futures-timer/3.0.2 \
    crate://crates.io/futures-util/0.3.5 \
    crate://crates.io/generator/0.6.21 \
    crate://crates.io/gilrs-core/0.2.6 \
    crate://crates.io/gilrs/0.7.4 \
    crate://crates.io/gimli/0.21.0 \
    crate://crates.io/gloo-timers/0.2.1 \
    crate://crates.io/hermit-abi/0.1.14 \
    crate://crates.io/io-kit-sys/0.1.0 \
    crate://crates.io/itoa/0.4.6 \
    crate://crates.io/js-sys/0.3.41 \
    crate://crates.io/kv-log-macro/1.0.6 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.71 \
    crate://crates.io/libudev-sys/0.1.4 \
    crate://crates.io/log/0.4.8 \
    crate://crates.io/loom/0.3.4 \
    crate://crates.io/mach/0.2.3 \
    crate://crates.io/malloc_buf/0.0.6 \
    crate://crates.io/memchr/2.3.3 \
    crate://crates.io/miniz_oxide/0.3.7 \
    crate://crates.io/nix/0.15.0 \
    crate://crates.io/nix/0.17.0 \
    crate://crates.io/nom/4.2.3 \
    crate://crates.io/num-bigint/0.2.6 \
    crate://crates.io/num-complex/0.2.4 \
    crate://crates.io/num-integer/0.1.43 \
    crate://crates.io/num-iter/0.1.41 \
    crate://crates.io/num-rational/0.2.4 \
    crate://crates.io/num-traits/0.1.43 \
    crate://crates.io/num-traits/0.2.12 \
    crate://crates.io/num/0.2.1 \
    crate://crates.io/num_cpus/1.13.0 \
    crate://crates.io/objc/0.2.7 \
    crate://crates.io/object/0.20.0 \
    crate://crates.io/once_cell/1.4.0 \
    crate://crates.io/parking/1.0.3 \
    crate://crates.io/pin-project-internal/0.4.22 \
    crate://crates.io/pin-project-lite/0.1.7 \
    crate://crates.io/pin-project/0.4.22 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.17 \
    crate://crates.io/proc-macro2/1.0.18 \
    crate://crates.io/quote/1.0.7 \
    crate://crates.io/redox_syscall/0.1.56 \
    crate://crates.io/rustc-demangle/0.1.16 \
    crate://crates.io/rustc_version/0.2.3 \
    crate://crates.io/rusty-xinput/1.2.0 \
    crate://crates.io/ryu/1.0.5 \
    crate://crates.io/scoped-tls/0.1.2 \
    crate://crates.io/scoped-tls/1.0.0 \
    crate://crates.io/semver-parser/0.7.0 \
    crate://crates.io/semver/0.9.0 \
    crate://crates.io/send_wrapper/0.4.0 \
    crate://crates.io/serde/1.0.114 \
    crate://crates.io/serde_derive/1.0.114 \
    crate://crates.io/serde_json/1.0.56 \
    crate://crates.io/sha1/0.6.0 \
    crate://crates.io/slab/0.4.2 \
    crate://crates.io/smol/0.1.18 \
    crate://crates.io/socket2/0.3.12 \
    crate://crates.io/stdweb-derive/0.5.3 \
    crate://crates.io/stdweb-internal-macros/0.2.9 \
    crate://crates.io/stdweb-internal-runtime/0.1.5 \
    crate://crates.io/stdweb/0.4.20 \
    crate://crates.io/syn/1.0.33 \
    crate://crates.io/synstructure/0.12.4 \
    crate://crates.io/thiserror-impl/1.0.20 \
    crate://crates.io/thiserror/1.0.20 \
    crate://crates.io/unicode-xid/0.2.1 \
    crate://crates.io/uuid/0.8.1 \
    crate://crates.io/vec_map/0.8.2 \
    crate://crates.io/version_check/0.1.5 \
    crate://crates.io/void/1.0.2 \
    crate://crates.io/waker-fn/1.0.0 \
    crate://crates.io/wasm-bindgen-backend/0.2.64 \
    crate://crates.io/wasm-bindgen-futures/0.4.14 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.64 \
    crate://crates.io/wasm-bindgen-macro/0.2.64 \
    crate://crates.io/wasm-bindgen-shared/0.2.64 \
    crate://crates.io/wasm-bindgen/0.2.64 \
    crate://crates.io/web-sys/0.3.41 \
    crate://crates.io/wepoll-sys-stjepang/1.0.6 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/winrt/0.6.0 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=2275f06e3aa54055ecedfb59b495e6c1 \
"

SUMMARY = "An application to control a BLE-enabled RC car with a USB gamepad"
HOMEPAGE = "https://github.com/compenguy/carbleurator"
LICENSE = "MIT"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include carbleurator-${PV}.inc
include carbleurator.inc
