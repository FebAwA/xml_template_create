package com.github.febawa.xmltemplatecreate.services

import com.intellij.openapi.project.Project
import com.github.febawa.xmltemplatecreate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
