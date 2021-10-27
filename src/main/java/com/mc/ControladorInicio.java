
package com.mc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller //Controlador de tipo MVC
@Slf4j //Enviar informacion al log con la libreria lombok
public class ControladorInicio {
    @GetMapping("/") //Indicarle al navegador que este metodo es el que se debe ejecutar
    public String inicio(){
        log.info("Ejecutando el controlador de tipo Spring MVC");
        return "index"; //Nombre de la pagina que va a desplegar
    }
    
    
}
