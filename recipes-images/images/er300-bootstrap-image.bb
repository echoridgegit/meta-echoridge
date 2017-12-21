SUMMARY = "An image to help bootstrap the ER300"

LICENSE = "MIT"

IMAGE_FEATURES += "ssh-server-openssh \
                   debug-tweaks \
                  "

IMAGE_FSTYPES = "cpio cpio.gz"

require recipes-images/images/native-sdk.inc

CORE_IMAGE_EXTRA_INSTALL = "\
    "

inherit core-image image-buildinfo buildhistory
