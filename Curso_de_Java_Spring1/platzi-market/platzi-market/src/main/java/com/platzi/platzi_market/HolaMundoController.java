package com.platzi.platzi_market;

import org.springframework.web.bind.annotation.GetMapping; // Cuando se anota un método con @GetMapping, Spring lo vincula a una ruta
                                                            // específica de la URL y lo configura para que maneje las solicitudes HTTP GET a esa ruta
import org.springframework.web.bind.annotation.RequestMapping; //se usa para definir una amplia gama de configuraciones de mapeo de solicitudes. Esto incluye la especificación de la URL,
                                                                // el método HTTP, los parámetros de la solicitud, los encabezados y más.
import org.springframework.web.bind.annotation.RestController; //@Controller: Indica que la clase es un controlador en una aplicación Spring MVC.
//@ResponseBody: Indica que el valor devuelto por los métodos de la clase se serializará directamente en el cuerpo de la respuesta HTTP, en lugar de ser una vista.

@RestController
@RequestMapping("/saludar")
public class HolaMundoController {

    @GetMapping("/hola")
    public String saludar(){
        return "Hola mundo ";
    }

    @GetMapping("/adios")
    public String despedir(){
        return "Adios mundo cruel :( ";
    }
}

//http://localhost:8080/saludar/hola
