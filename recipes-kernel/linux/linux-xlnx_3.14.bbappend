FILESEXTRAPATHS_prepend_er300 := "${THISDIR}/er300-3.14:"

SRC_URI_append_er300 = "\
                  file://axi-fpga.scc \
                  file://axi-fpga.cfg \
                  file://er300.scc \
                  file://er300.cfg \
                  file://usb-audio.cfg \
                  file://usb-wifi.cfg \
                  file://usb-serial.cfg \
                  file://usb-cam.cfg \
                  file://bluetooth.cfg \
		"

COMPATIBLE_MACHINE_er300 = "er300"

