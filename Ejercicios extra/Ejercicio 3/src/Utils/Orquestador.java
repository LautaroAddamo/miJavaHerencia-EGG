package Utils;

import Entidades.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Orquestador {

    static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void crearOrquestador() {
        ArrayList<Alojamiento> listaAlojamiento = new ArrayList<>();
        ArrayList<Hotel> listaHoteles = new ArrayList<>();
        crearHoteles(listaAlojamiento, listaHoteles);
        crearAlojamientosExtraH(listaAlojamiento);

        menu();
        int opc;
        do {
            System.out.println("Ingrese una opcion. Ingrese 6 para ver el menu nuevamente");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    mostrarAlojamientos(listaAlojamiento);
                    break;
                case 2:
                    ordenarMayorPrecio(listaHoteles);
                    break;
                case 3:
                    mostrarAlojamientosExtraH(listaAlojamiento);
                    break;
                case 4:
                    campingsConRestaurante(listaAlojamiento);
                    break;
                case 5:
                    residenciasConDescuento(listaAlojamiento);
                    break;
                case 6:
                    menu();
                    break;
                case 7:
                    System.out.println("HA SALIDO");
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }

        } while (opc != 7);

    }

    public static Comparator<Hotel> compararPrecio = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel h1, Hotel h2) {
            return h2.getPrecioHabitacion() - h1.getPrecioHabitacion();
        }
    };

    public static void ordenarMayorPrecio(ArrayList<Hotel> listaHoteles) {
        listaHoteles.sort(compararPrecio);
        for (Hotel aux : listaHoteles) {
            System.out.println(aux);
        }
    }

    public static void menu() {
        System.out.println("MENU"
                + "\nELIJA UNA OPCION"
                + "\n1.MOSTRAR TODOS LOS ALOJAMIENTOS DISPONIBLES"
                + "\n2.MOSTRAR HOTELES ORDENADOS POR PRECIO"
                + "\n3.MOSTRAR LOS ALOJAMAMIENTOS EXTRAHOTELEROS"
                + "\n4.MOSTRAR CAMPINGS CON RESTAURANTE"
                + "\n5.MOSTRAR RESIDENCIAS CON DESCUENTO PARA GREMIOS"
                + "\n6.MOSTRAR MENU"
                + "\n7SALIR");

    }

    public static void crearHoteles(ArrayList<Alojamiento> listaAlojamiento, ArrayList<Hotel> listaHoteles) {
        for (int i = 0; i < 1; i++) {
            CuatroEstrellas new4Estrellas = new CuatroEstrellas();
            CincoEstrellas new5Estrellas = new CincoEstrellas();
            new4Estrellas.crear4Estrellas();
            new4Estrellas.calcularPrecio();
            new5Estrellas.crear5Estrellas();
            new5Estrellas.calcularPrecio();
            listaAlojamiento.add(new4Estrellas);
            listaAlojamiento.add(new5Estrellas);
            listaHoteles.add(new4Estrellas);
            listaHoteles.add(new5Estrellas);
        }
    }

    public static void crearAlojamientosExtraH(ArrayList<Alojamiento> listaAlojamiento) {
        for (int i = 0; i < 1; i++) {
            Camping newCamping = new Camping();
            Residencia newResidencia = new Residencia();
            newCamping.crearCamping();
            newResidencia.crearResidencia();
            listaAlojamiento.add(newCamping);
            listaAlojamiento.add(newResidencia);

        }
    }

    public static void mostrarAlojamientos(ArrayList<Alojamiento> listaAlojamiento) {
        for (Alojamiento aux : listaAlojamiento) {
            System.out.println(aux);
        }
    }

    public static void campingsConRestaurante(ArrayList<Alojamiento> listaAlojamiento) {
        for (Alojamiento aux : listaAlojamiento) {
            if (aux instanceof Camping) {
                if (((Camping) aux).isRestaurante()) {
                    System.out.println(aux);
                }

            }
        }
    }

    public static void residenciasConDescuento(ArrayList<Alojamiento> listaAlojamiento) {
        for (Alojamiento aux : listaAlojamiento) {
            if (aux instanceof Residencia) {
                if (((Residencia) aux).isDescuentoGremios()) {
                    System.out.println(aux);
                }

            }
        }
    }

    public static void mostrarAlojamientosExtraH(ArrayList<Alojamiento> listaAlojamiento) {
        for (Alojamiento aux : listaAlojamiento) {
            if (aux instanceof Camping) {
                System.out.println(aux);

            }
            if (aux instanceof Residencia) {
                System.out.println(aux);

            }
        }
    }
}
