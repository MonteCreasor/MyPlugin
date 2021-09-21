package com.github.montecreasor.myplugin.services

import com.intellij.openapi.project.Project
import com.github.montecreasor.myplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
