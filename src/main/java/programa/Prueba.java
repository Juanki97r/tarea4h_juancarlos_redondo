package programa;
import java.time.LocalDate;
import java.time.Month;

import modelo.Animal;

public class Prueba {
    public static void main(String[] args) {
        
        Animal animal1 = new Animal(LocalDate.of(2005, Month.APRIL, 15), "pedro", 500, "gato");

        System.out.println(animal1.toString());
        System.out.println(animal1);
    }
}
