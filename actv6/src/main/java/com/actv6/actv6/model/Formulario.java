package com.actv6.actv6.model;

public class Formulario {
    String nombre;
    String apellidos;
    String correo;
    String password;
    Boolean passwordGenerado;

     public Formulario(){}

    public Formulario(String password, String correo, String apellidos, String nombre, Boolean passwordGenerado) {
        this.password = password;
        this.correo = correo;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.passwordGenerado = passwordGenerado;
    }

    public String getNombre() {
         if(nombre == null || nombre.isEmpty()){
             return "Tienes que ingresar un nombre";
         }
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
         if(correo == null){
             return "Tienes que ingresar un correo!";
         }
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        if (password == null || password.isBlank()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb.append((int) (Math.random() * 10));
            }
            password = sb.toString();
            passwordGenerado = true;
        }
        return password;
    }

    public void setPassword(String password) {
         this.password = password;
    }

    public Boolean getPasswordGenerado() {
         return passwordGenerado;
    }
    public void setPasswordGenerado(Boolean passwordGenerado) { this.passwordGenerado = passwordGenerado; }
}

