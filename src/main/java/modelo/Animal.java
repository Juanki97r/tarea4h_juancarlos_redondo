package modelo;

import java.time.LocalDate;
import java.time.Month;

public class Animal {
    
    private LocalDate fechaNacimiento;
    private String nombre;
    public static final String[] TIPO = {"gato","perro","cobaya", "lagarto", "periquito" };
    private String tipo;
    private int peso;
    public static String[] ESTADO = {"comiendo","durmiento","reposando","jugando"};
    private String estado;

    //constructor por defecto
    public Animal (){
    }

    //comprobar si el tipo es valido

    public static boolean recorrerTipos(String tipo){
        for(int i=0; i< TIPO.length; i++){
            if(tipo.equals(TIPO[i])){
                return true;
            }

        }
        return false;
    }

    //comprobar si el estado es valido

    public static boolean recorrerEstado(String estado){
        for(int i=0; i< ESTADO.length; i++){
            if(estado.equals(ESTADO[i])){
                return true;
            }

        }
        return false;
    }


    public Animal (LocalDate fechaNac,String nombre,int peso, String tipo ){
         if(!(fechaNac!=null && fechaNac.isAfter(LocalDate.of(2000, Month.JANUARY, 1)) && fechaNac.isBefore(LocalDate.now())) || !(peso>0 && peso<1000) || !recorrerTipos(tipo)) {
            throw new IllegalArgumentException("Has introducido un valor erroneo");
        }
        this.fechaNacimiento=fechaNac;
        this.nombre=nombre;
        this.peso=peso;
        this.tipo=tipo;
        this.estado="reposo";

    }

    //copia
    public Animal(Animal animalOriginal){

        if(animalOriginal!=null){
            this.fechaNacimiento=animalOriginal.fechaNacimiento;
            this.nombre=animalOriginal.nombre;
            this.tipo=animalOriginal.tipo;
            this.peso=animalOriginal.peso;
            this.estado=animalOriginal.estado;
        }

    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
    
    
}