package com.actv6.actv6.controller;

import com.actv6.actv6.model.Formulario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class FormularioController {
    Map<String, String> usuarios =  new HashMap<>();
    @GetMapping("/formulario")
    public String mostrarFormulario(){
        return "formulario";
    }

    @PostMapping("/procesar")
    @ResponseBody
    public String procesarFormulario(
            @ModelAttribute Formulario formulario) {
            usuarios.put(formulario.getCorreo(), formulario.getPassword());
            if(formulario.getPasswordGenerado() == true){
                return "El usuario " + formulario.getNombre() + ", correo: " + formulario.getCorreo() + ", con contraseña autogenerada: " +  formulario.getPassword() + " ha sido guardado!";

            }
            return "El usuario " + formulario.getNombre() + ", correo: " + formulario.getCorreo() + " ha sido guardado!";
    }

    @GetMapping("/login")
    public String mostrarLogin(){
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestParam String correo, @RequestParam String password){
        if(!usuarios.containsKey(correo)){
            return "El usuario " + correo + " no existe";
        }
        if(!usuarios.get(correo).equals(password)){
            return "La contraseña es incorrecta";
        }
        return "Bienvenida! " + correo;
    }
}
