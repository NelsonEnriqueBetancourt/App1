/*
Crecion de metodos para la entidad o modelo creado en este caso "Persona"
 */


package com.dataJava.demo.Service1;

import com.dataJava.demo.Models.Persona;

import java.util.List;

public interface IPersonaService {
    //Metodos

    public  List<Persona> listarPersona();// declaramos un metodo en el cual listamos la entidad  "persona"
    public void GuardarPersona(Persona persona); //declaramos un metodo de guardar la entidad "persona"
    public Persona EncontrarPersona(int id);
    public void EliminarPersona(int id);
}
