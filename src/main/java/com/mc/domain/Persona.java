
package com.mc.domain;


import lombok.Data;

//Desde lombok no hace falta agregar getters y setters, constructores, ToString
@Data
public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
}
