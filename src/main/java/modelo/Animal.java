package modelo;

import java.time.LocalDate;

public class Animal {
    
    private LocalDate fechaNacimiento;
    private String nombre;
    private final String[] TIPO = {"gato","perro","cobaya", "lagarto", "periquito" };
    private String tipo;
    private int peso;
    private String[] ESTADO = {"comiendo","durmiento","reposando","jugando"};
    private String estado;

    //constructor por defecto
    public Animal (){
    }

    public Animal (LocalDate fechaNac,String nombre,int peso, String tipo ){
        if((fechaNac==null && fechaNac.isBefore(LocalDate.of(2000, 1, 1)) && fechaNac.isAfter(LocalDate.now())) )

        this.tipo="reposo";
    }

    
}