package ejercicio.pkg1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class Main {

    public static void main(String[] args) {

        Animal perro = new Perro("Tano", "alimento para perros", 5, "Callejero");

        System.out.println(perro.getNombre() + " se alimenta de " + perro.alimentarse());

        Animal perro1 = new Perro("Nina", "carne", 2, "Callejero");
        System.out.println(perro1.getNombre() + " se alimenta de " + perro1.alimentarse());
        
        Animal gato = new Gato("Tobias", "atun", 5, "Siames");
        System.out.println(gato.getNombre() + " se alimenta de " + gato.alimentarse());
        
        Animal caballo = new Caballo("Tornado" , "pasto" , 6 , "X");
        System.out.println(caballo.getNombre() + " se alimenta de " + caballo.alimentarse());
    }

}
