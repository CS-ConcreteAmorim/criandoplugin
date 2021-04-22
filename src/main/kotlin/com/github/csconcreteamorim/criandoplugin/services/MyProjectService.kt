package com.github.csconcreteamorim.criandoplugin.services

import com.github.csconcreteamorim.criandoplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
