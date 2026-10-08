package com.ej4.ej4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tabla {
    @GetMapping("/tabla")
    public String tabla(@RequestParam(name = "filas", required = false) String filas, @RequestParam(name = "columnas", required = false) String columnas) {
        int filasInt = Integer.parseInt(filas);
        int columnasInt = Integer.parseInt(columnas);

        StringBuilder sb = new StringBuilder();
        sb.append("<table border=1>" +
                "<thead><th colspan=" + columnasInt + ">Una tabla</th></thead>");

        for (int i = 1; i <= columnasInt; i++) {
                sb.append("<th>Columna " + i + "</th>");
            }
        for(int i = 1; i <= filasInt; i++) {
            sb.append("<tr>");
            for (int j = 1; j <= columnasInt; j++) {
                sb.append("<td> Columna " + j + " Fila: " + i + "</td>");
            }
            sb.append("</tr>");
        }
        sb.append("</table>");
        return sb.toString();
    }
}

