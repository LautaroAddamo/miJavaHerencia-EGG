package Utils;

import java.util.Scanner;
import Entidades.*;
import java.util.ArrayList;

public class Orquestador {

    private final static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    static ArrayList<Alquiler> listaAlquileres = new ArrayList();

    public static void crearOrquestador() {

        int opc;

        menu();
        do {
            Alquiler newAlquiler = new Alquiler();
            System.out.println("Que barco quiere alquilar"
                    + "\n Indique una opcion:"
                    + "\n Ingrese 4 para ver nuevamente el menu.");
            System.out.println("-------");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("VELERO");
                    Velero newVelero = new Velero();
                    newVelero.crearVelero();
                    newAlquiler.crearAlquiler();
                    newAlquiler.setBarco(newVelero);
                    listaAlquileres.add(newAlquiler);
                    System.out.println("Cantidad de dias alquilado : " + newAlquiler.calcularDiasAlquilado(newAlquiler.getFechaAlquiler(), newAlquiler.getFechaDevolucion()));
                    newVelero.calcularAlquiler(newAlquiler.calcularDiasAlquilado(newAlquiler.getFechaAlquiler(), newAlquiler.getFechaDevolucion()));
                    System.out.println("----------");
                    mostrar(listaAlquileres);
                    System.out.println("----------");
                    break;
                case 2:
                    System.out.println("BARCO A MOTOR");
                    BarcoMotor newBarcoMotor = new BarcoMotor();
                    newBarcoMotor.crearBarcoMotor();
                    newAlquiler.crearAlquiler();
                    newAlquiler.setBarco(newBarcoMotor);
                    listaAlquileres.add(newAlquiler);
                    System.out.println("Cantidad de dias alquilado : " + newAlquiler.calcularDiasAlquilado(newAlquiler.getFechaAlquiler(), newAlquiler.getFechaDevolucion()));
                    newBarcoMotor.calcularAlquiler(newAlquiler.calcularDiasAlquilado(newAlquiler.getFechaAlquiler(), newAlquiler.getFechaDevolucion()));

                    System.out.println("----------");
                    mostrar(listaAlquileres);
                    System.out.println("----------");
                    break;
                case 3:
                    System.out.println("YATE");
                    Yate newYate = new Yate();
                    newYate.crearYate();
                    newAlquiler.crearAlquiler();
                    newAlquiler.setBarco(newYate);
                    listaAlquileres.add(newAlquiler);
                    System.out.println("Cantidad de dias alquilado : " + newAlquiler.calcularDiasAlquilado(newAlquiler.getFechaAlquiler(), newAlquiler.getFechaDevolucion()));
                    newYate.calcularAlquiler(newAlquiler.calcularDiasAlquilado(newAlquiler.getFechaAlquiler(), newAlquiler.getFechaDevolucion()));
                    System.out.println("----------");
                    mostrar(listaAlquileres);
                    System.out.println("----------");

                    break;
                case 4:
                    menu();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opc != 5);

    }

    public static void mostrar(ArrayList<Alquiler> listaAlquileres) {
        for (Alquiler aux : listaAlquileres) {
            System.out.println(aux);
        }
    }

    public static void menu() {
        System.out.println("MENU"
                + "\n1. VELERO"
                + "\n2. BARCO A MOTOR"
                + "\n3. YATE"
                + "\n4. MOSTRAR MENU"
                + "\n5. SALIR");
    }

}
