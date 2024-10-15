package org.ldv.myhello.controller

import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

class exo_01 {
    @GetMapping("/wonderfast")
    @ResponseBody
    fun mycommand(model: Model, @RequestParam querry: Map<String, String>): String {
        val name = querry["name"] ?: ""
        val surname = querry["surname"] ?: ""
        val starter = querry["starter"] ?: ""
        val maincourse = querry["maincourse"] ?: ""
        val desert = querry["desert"] ?: ""
        val drink = querry["drink"] ?: ""
    }

    @GetMapping("/")
    fun index (model: Model): String {
        model["monTitre"] = "Commande de ${name} ${surname}"
        model["commande"] = "{$starter}, {$maincourse}, {$desert}, {$drink}"
        return "index"
    }


}