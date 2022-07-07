package ejercicio.pkg2;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList<>();

        for (int i = 0; i < 2; i++) {

            Lavadora newLavadora = new Lavadora();
            newLavadora.crearLavadora();
            newLavadora.mostrar();
            listaElectrodomesticos.add(newLavadora);
        }
        for (int i = 0; i < 2; i++) {
            Televisor newTelevisor = new Televisor();
            newTelevisor.crearTelevisor();
            newTelevisor.mostrar();
            listaElectrodomesticos.add(newTelevisor);

        }

        int sumaTeles = 0;
        int sumaLavadoras = 0;
        int sumaTotal = 0;

        for (Electrodomestico aux : listaElectrodomesticos) {
            //System.out.println(aux);

            if (aux instanceof Lavadora) {
                System.out.println("La lavadora tiene un costo de " + aux.getPrecio());
                sumaLavadoras += aux.getPrecio();
            }
            if (aux instanceof Televisor) {
                System.out.println(" El televisor tiene un costo de " + aux.getPrecio());
                sumaTeles += aux.getPrecio();
            }

        }

        sumaTotal = sumaTeles + sumaLavadoras;
        System.out.println("El precio total de los televisores es " + sumaTeles);

        System.out.println("El precio total de las lavadoras es " + sumaLavadoras);
        
        System.out.println("El precio total de todos los electrodomesticos es " + sumaTotal);
    }

}
