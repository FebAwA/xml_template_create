package com.github.febawa.xmltemplatecreate.listeners

import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import com.github.febawa.xmltemplatecreate.services.MyProjectService

internal class MyProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        project.service<MyProjectService>()
    }
}
