package org.ldv.myhello.controller

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

class exo_01 {
    @GetMapping("/")
    @ResponseBody
    fun querryString (@RequestParam querry: Map<String, String>): String {
        val name = querry["name"] ?: ""
        val surname = querry["surname"] ?: ""
        val starter = querry["starter"] ?: ""
        return "Hello ${name} ${surname} ${starter}!"
    }

    @GetMapping("/")
    fun index(model: Model): String {
        model["monTitre"] = "Commande de ${}"
        model[commande] = ""
        return "index"
    }
}