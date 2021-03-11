package com.github.jlk191603.unittestsgenerator.services

import com.github.jlk191603.unittestsgenerator.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
