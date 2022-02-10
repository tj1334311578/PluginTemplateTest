package com.github.tj1334311578.plugintemplatetest.services

import com.intellij.openapi.project.Project
import com.github.tj1334311578.plugintemplatetest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
