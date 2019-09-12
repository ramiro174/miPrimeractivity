package com.example.miprimeractivity.modelos;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private  Integer  edad;
    private  String  nombre;
    private List<String> telefono;
    public Persona() {

        this.telefono=new ArrayList<>();
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
