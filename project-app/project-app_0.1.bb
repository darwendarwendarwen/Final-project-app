DESCRIPTION = "Project app"
AUTHOR = "Darwin Luk"
LICENSE = "CLOSED"


SRC_URI = "git://github.com/darwendarwendarwen/Final-project-app.git;branch=working-branch;protocol=https"
SRCREV = "8a2d1f928b1317fdb75f6208dd1b2cfa6f96c035"

S = "${WORKDIR}/git/files"

DEPENDS += ""

do_install(){
    install -d ${D}/usr/bin
    install -m 0700 projectapp ${D}/usr/bin
}

inherit autotools