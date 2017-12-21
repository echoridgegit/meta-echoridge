SUMMARY = "A console-only image with a development/debug \
environment suitable for building GNURadio installed."

IMAGE_FEATURES += "ssh-server-openssh \
                   debug-tweaks \
                  "

EXTRA_IMAGE_FEATURES += "package-management"

LICENSE = "MIT"

require recipes-images/images/native-sdk.inc

TOOLCHAIN_TARGET_TASK_append = " kernel-devsrc"

CORE_IMAGE_EXTRA_INSTALL = "\
    i2c-tools \
    screen \
    vim \
    vim-vimrc \
    git \
    wget \
    python \
    python-cheetah \
    python-modules \
    python-argparse \
    python-distutils \
    python-pyserial \
    python-numpy \
    packagegroup-sdr-python-extended \
    htop \
    sshfs-fuse \
    openssh-sftp \
    openssh-sftp-server \
    fftwf \
    ntpdate \
    uhd \
    uhd-examples \
    python-twisted \
    python-txws \
    python-pyephem \
    gnuradio \
    gr-osmosdr \
    "

inherit core-image image-buildinfo
