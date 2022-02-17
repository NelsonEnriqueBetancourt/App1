/*
  @Controller**
  NOS PERMITE HACER UNA APLICACION WEB, COMUNICARNOS CON LA INTERFAZ GRAFICA Y ENVIAR UN DATO.

  COMUNICACION DEL BACKEND CON EL HTML5, PARA SOLO MOSTRAR
  @GetMapping: metodo get

 ***CONFIGURACION DE thymeleaf PARA LA PLANTILLA HTML
   @GetMapping("/Welcome")
    public String Home(Model model){
        model.addAttribute("Saludos", "Hola bienvenidos");***CONFIGURACION DE thymeleaf PARA LA PLANTILLA HTML
        return "index";

    }
    COMUNICACION DEL BACKEND CON EL HTML5, PARA SOLO MOSTRAR
 */

package com.dataJava.demo.Controller;
import com.dataJava.demo.Models.Persona;
import com.dataJava.demo.Service1.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class PersonaController {

    @GetMapping("/Vista")
    public String VistaDocumento(){
        return "index_vista";
    }






   /* @GetMapping("/Welcome")
    public String Home(Model model){
        model.addAttribute("Saludos", "Hola bienvenidos");
        return "index";

    }*/

}
