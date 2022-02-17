package com.dataJava.demo.Service1;

import com.dataJava.demo.Models.Persona;
import com.dataJava.demo.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*
 @Autowired: SE LE CONOCE COMO INYECCION DE DEPENDENCIA
 */
import java.util.List;

@Service
public class PersonaServiceImplement implements IPersonaService{
    @Autowired//con esta anotacion mandamos a llamar la interfaz PersonaRepository
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> listarPersona() {
        return personaRepository.findAll();
    }

    @Override
    public void GuardarPersona(Persona persona) {
        personaRepository.save(persona);

    }

    @Override
    public Persona EncontrarPersona(int id) {
        return personaRepository.findById(id).get();//"get"mandamos a llamar al objeto que estamos consultando
    }

    @Override
    public void EliminarPersona(int id) {
        personaRepository.deleteById(id);

    }
}
