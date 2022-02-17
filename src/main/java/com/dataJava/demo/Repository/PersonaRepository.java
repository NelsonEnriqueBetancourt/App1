/*
REPOSITORY**
CREAMOS LAS INTERFACEZ

**HEREDAMOS**
**Jparepository**
en el cual es una interfaz que ya tiene por defecto unos metodos.

 **<Persona, Integer>**
le indicamos que esos metodos los implemente en la entidad o modelo y los utilice,
en este caso; Llamamos al modelo o entidad creado "Persona, Integer ", el Integer es para indicarle
que tipo de dato es la llave primaria de dicha entidad
 */
package com.dataJava.demo.Repository;

import com.dataJava.demo.Models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>  {


}
