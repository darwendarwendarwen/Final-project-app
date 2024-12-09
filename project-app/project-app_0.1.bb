DESCRIPTION = "Project app"
AUTHOR = "Darwin Luk"
LICENSE = "CLOSED"


SRC_URI = "file://accelerometer-app.c \
           file://Makefile"

SRC_URI[md5sum] = "ea436106f31ab1f43213690074ccabce d41d8cd98f00b204e9800998ecf8427e"

S = "${WORKDIR}"

do_compile() {
    oe_runmake
}

do_install() {
    oe_runmake install DESTDIR=${D}
}


DEPENDS = "virtual/libc"


inherit autotools