SUMMARY = "Project-app"
DESCRIPTION = "Compiles and installs the accelerometer program"
LICENSE = "CLOSED"

SRC_URI = "file://accelerometer_app.c \
           file://Makefile"

S = "${WORKDIR}"

do_compile(){
    oe_runmake -C ${S}/files
}

do_install() {
        install -d ${D}${bindir}
        install -m 0755 accelerometer_app ${D}${bindir}
}

inherit autotools