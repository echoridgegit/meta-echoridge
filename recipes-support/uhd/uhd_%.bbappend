FILESEXTRAPATHS_prepend_er300 := "${THISDIR}/${BPN}:"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI_append_er300 = "file://0001-e300_eeprom_manager.cpp-Quick-hack-to-trick-uhd-into.patch;striplevel=2"
