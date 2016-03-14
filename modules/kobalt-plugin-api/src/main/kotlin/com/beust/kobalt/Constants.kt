package com.beust.kobalt

import com.beust.kobalt.misc.KFiles

object Constants {
    val BUILD_FILE_NAME = "Build.kt"
    val BUILD_FILE_DIRECTORY = "kobalt/src"
    val BUILD_FILE_PATH = KFiles.joinDir(BUILD_FILE_DIRECTORY, BUILD_FILE_NAME)

    internal val DEFAULT_REPOS = listOf(
            "http://repo1.maven.org/maven2/",
            "https://maven-central.storage.googleapis.com/",
            "https://jcenter.bintray.com/"

            // The following two repos contain snapshots, never include them or default
//            "https://repository.jboss.org/nexus/content/repositories/root_repository/",
//            "http://repository.jetbrains.com/all/"
//            "https://oss.sonatype.org/content/repositories/snapshots/"
    )

}
