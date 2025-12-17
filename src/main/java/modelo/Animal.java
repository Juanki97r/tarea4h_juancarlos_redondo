package modelo;

import java.time.LocalDate;
import java.time.Month;

public class Animal {
    
    private LocalDate fechaNacimiento;
    private String nombre;
    public static final String[] TIPO = {"gato","perro","cobaya", "lagarto", "periquito" };
    private String tipo;
    private double peso;
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


    public Animal (LocalDate fechaNac,String nombre,double peso, String tipo ){
         if(!(fechaNac!=null && fechaNac.isAfter(LocalDate.of(2000, Month.JANUARY, 1)) && fechaNac.isBefore(LocalDate.now())) || !(peso>0 && peso<1000) || !recorrerTipos(tipo)) {
            throw new IllegalArgumentException("Has introducido un valor erroneo");
        }
        this.fechaNacimiento=fechaNac;
        this.nombre=nombre;
        this.peso=peso;
        this.tipo=tipo;
        this.estado="reposando";

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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
    public String toString(){
        return "Animal [FechaNac: " + this.fechaNacimiento + " Nombre: "+ this.nombre+" Peso: "+this.peso+" Tipo: "+this.tipo+"]";
    }
    
    //metodo comer
    public void comer(double cantidadGramos){
        this.peso += Math.abs(cantidadGramos);
        setEstado("comiendo");
    }
    //metodo dormir
    public void dormir(){
        setEstado("durmiendo");
    }
    //metodo despertar 
    public void despertar(){
        setEstado("reposando");
    }
    //metodo reposar
    public void reposar(){
        setEstado("reposando");

    }
    //metodo jugar
    public void jugar(int minutosJugando){
        setEstado("jugando");
    
        
        if(Math.abs(minutosJugando)<30){
           setPeso(this.peso * 0.9); //quitamos el 10% del peso
           
        }
        if(Math.abs(minutosJugando)>=30){
            int cantidadTreintaMin= minutosJugando/30;
            setPeso(this.peso*(0.8*cantidadTreintaMin));
        }
        if(Math.abs(minutosJugando)>180){
            throw new IllegalArgumentException("El animal no puede jugar tanto tiempo");
        }
    }
}