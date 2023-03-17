/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

        
@RestController
public class ApiController {
    
    @GetMapping ("/hola/{nombre}/{edad}/{profesion}")
    public String decirHola( @PathVariable String nombre,
                             @PathVariable int edad,
                             @PathVariable String profesion){
    return "Hello World! Tu nombre es " + nombre +
            ". Tu edad es " + edad + ". Y tu profesión es " + profesion + ".";
    }
    
    @GetMapping ("/pruebaresponse")
    ResponseEntity<String> traerRespuesta() {
        return new ResponseEntity <> ("Esto es un response entity", HttpStatus.OK);
    }
    @GetMapping ("/PruebaJSP/?dni=44609324&nombre=Diego&apellido=Gomez&telefono=11+31494893")
    ResponseEntity<String> answer(){
        return new ResponseEntity <> ("Hola Creador", HttpStatus.OK);
    }
}
