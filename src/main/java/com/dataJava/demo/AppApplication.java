/*APP TIPO DESDE UNA CONSOLA
PARA TRABAJAR LA APP EN CONSOLA, EL METODO MAIN TIENE QUE IMPLEMENTAR LA INTERFZA
** COMMANDLINERUNNER**

***** EJEMPLOS1 ***
AL IMPLEMENTAR UNAS CLASES E INTERFACEZ DENTRO DEL PROYECTO DE APP
** PASAMOS **
DE LA CLASE QUE EJECUTA EL PROGRAMA QUE ES APP: CONTIENE EL METODO MAIN
AL PACKAGE DE SERVICE Y POR ULTIMO PASAMOS AL PACKAGE DE REPOSITORY.

   SE CREA UNA VARIABLE DE TIPO ** LOG ** donde sea de la clase ** Logger**
	 para mostrar en consola la informcaion que desee, esta funcino reemplaza al print
 */

package com.dataJava.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Este es el main Principal de la app

@SpringBootApplication
public class AppApplication  {// INTERFAZ PARA CORRER EN EL METODO MAIN

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);

	}


}
