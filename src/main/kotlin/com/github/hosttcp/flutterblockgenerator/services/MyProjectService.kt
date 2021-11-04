package com.github.hosttcp.flutterblockgenerator.services

import com.intellij.openapi.project.Project
import com.github.hosttcp.flutterblockgenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
