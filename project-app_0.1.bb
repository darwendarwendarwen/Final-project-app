SUMMARY = "Input App"
DESCRIPTION = "Compiles and installs a c program"
LICENSE = "CLOSED"

SRC_URI = "git://github.com/darwendarwendarwen/Final-project-app.git;protocol=https;branch=working"

SRCREV = "b3edf1544ac1dd435571f2fa60be1a1ba169651c"

S = "${WORKDIR}/git"

do_compile() {
        oe_runmake
}

do_install() {
        install -d ${D}${bindir}
        install -m 0755 accelerometer_app ${D}${bindir}
}

FILES_${PN} = "${bindir}/accelerometer_app"