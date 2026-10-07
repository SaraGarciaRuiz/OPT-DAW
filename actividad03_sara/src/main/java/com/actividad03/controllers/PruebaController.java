package com.actividad03.actividad03.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PruebaController {
    @GetMapping("/elegir")
    public String elegir(@RequestParam(name="idioma", required = false)String idioma){

        switch(idioma){
            case "spanish":
                return "redirect:/spanish.html";
            case "french":
                return "redirect:/french.html";
            case "english":
                return "redirect:/english.html";
            case "german":
                return "redirect:/german.html";
            default:
                return "redirect:/english.html";
        }
    }
}
