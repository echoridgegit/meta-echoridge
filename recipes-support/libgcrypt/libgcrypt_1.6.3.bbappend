# Brute force hack to diabsle building with libcap
# If grcrypt is built with libcap, vpnc fails to work

DEPENDS = "libgpg-error"
EXTRA_OECONF = "--disable-asm --without-capabilities"
