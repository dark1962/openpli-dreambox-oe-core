KV = "3.14-1.17"
DRIVERDATE = "20200226"

require dreambox-dvb-modules-new.inc

SRC_URI[dm900.md5sum] = "ea92f82a7c4e09ef620999ca5365daf5"
SRC_URI[dm900.sha256sum] = "202685660e7d6cd6342e321639b41aa86cc7f5a178af04757716be7970542f73"

COMPATIBLE_MACHINE = "dm900"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm900.md5sum', True)}"
