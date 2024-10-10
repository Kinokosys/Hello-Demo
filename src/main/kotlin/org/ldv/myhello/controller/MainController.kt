package org.ldv.myhello.controller

import jakarta.servlet.http.HttpServletRequest
import org.intellij.lang.annotations.Language
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

//Import pour la gestion de la Vue :
import org.springframework.ui.Model
import org.springframework.ui.set

@Controller
class MainController {
    /*@GetMapping("/")
    @ResponseBody
    fun myResponseBody (): String {
        return "Hello World du Contrôleur !"
    }*/
    @GetMapping("/hello")
    @ResponseBody
    fun querryString (@RequestParam querry: Map<String, String>): String {
        val nom = querry["nom"] ?: ""
        val prenom = querry["prenom"] ?: ""
        return "Hello ${prenom} ${nom}!"
    }
    @GetMapping("/hello-{language}")
    @ResponseBody
    fun findLanguage(@PathVariable("language") language: String, request: HttpServletRequest): String {
        return "Vous connaissez le language ${language}"
    }

    @GetMapping("/")
    fun index(model: Model): String {
        model["monTitre"] = "Exemple d'une Vue"
        model["monParagraphe"] = "Ce paragraphe a été généré dynamiquement avec Thymeleaf."
        return "index"
    }
}