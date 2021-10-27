
package com.mc;

import com.mc.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller //Controlador de tipo MVC
@Slf4j //Enviar informacion al log con la libreria lombok
public class ControladorInicio {
    
    //Para ver el mensaje desde application.properties
    @Value("${index.saludo}") //Accceder a traves de una llave
    private String saludo; //Inyectar el valor
    
    //Indicarle al navegador que este metodo es el que se debe ejecutar
    @GetMapping("/") 
    public String inicio(Model model){ //En lugar de recibir el objeto Request
        String mensaje = "Hola con Thymeleaf";
        
        //Estamos trayendo el objeto persona desde la Entidad Persona
        Persona persona = new Persona();
        persona.setNombre("Marisa");
        persona.setApellido("Caponetto");
        persona.setEmail("marisascaponetto@yahoo.com.ar");
        persona.setTelefono("261111111");
        
        //Creamos otro objeto de tipo persona
        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setApellido("Perez");
        persona1.setEmail("juanperez@yahoo.com.ar");
        persona1.setTelefono("251111111");
        
        //List<Persona> personas = new ArrayList();
        //personas.add(persona);
        //personas.add(persona1);
        
        List<Persona> personas = Arrays.asList(persona, persona1);
        //List<Persona> personas = Arrays.asList();
             
        
        log.info("Ejecutando el controlador de tipo Spring MVC");
        model.addAttribute("mensaje", mensaje);
        //Compartir desde application.properties
        model.addAttribute("saludo", saludo);
        //Compartimos el objeto Persona
        //model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index"; //Nombre de la pagina que va a desplegar
    }
    
    
}
