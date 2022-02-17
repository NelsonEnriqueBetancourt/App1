/*
***MODELS***
* SE CREAN LAS ENTIDADES O MODELOS,Y LA REPRESENTACION DE TABLAS EN MI BASE DE DATOS

ANOTACION DE JPA:

@ENTITY: esta anotacion le indica que aca se creo una entidad.
 @Id: le indicamos que la llave primaria es **Id**
 @Column(name = "Colum_Persona")//le indicamos que esto es una columna en nuestra tabla y donde estara en la bd
 la podemos identificar como llamarse en la bd; "Col_Persona"

 length** le indicamos  el tamaño de caracteres que puede almacenar esta columna que esta en la bd.
 */

package com.dataJava.demo.Models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Personas")
public class Persona {

    @Id
    private int idpersona;
    @Column(name = "Nombre", length = 50)
    private String nombre;
    @Column(name = "Edad", length = 50)
    private int Edad;

    public Persona (){

    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public Persona(int idpersona, String nombre, int Edad) {
        this.Edad =Edad;

        this.idpersona = idpersona;
        this.nombre=nombre;
    }
}
