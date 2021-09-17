package test;

import Domain.Persona;

public class TestArreglosObjetos {
    
    public static void main(String[] args) {
        
        Persona personas[] = new Persona[2];
        
        personas[0] = new Persona("Wilmer");
        personas[1] = new Persona("Villamil");
        
        System.out.println("personas = " + personas[0]);
        System.out.println("personas = " + personas[1]);
        
        for (int i = 0; i<personas.length; i++) {
            
            System.out.println("indice: "+i+" Personas = " + personas[i]);
        }
                
    }
    
}
