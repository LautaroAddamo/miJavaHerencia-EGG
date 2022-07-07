package Utils;

import Entidades.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Orquestador {

    final static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void crearOrquestador() {
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        //crearEmpleado(listaPersonas);
        crearEstudiante(listaPersonas);

        menu();
        int opc;

        do {
            System.out.println("Ingrese una opcion. Ingrese 7 para ver el menu nuevamente");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    cambiarEstadoCivil(listaPersonas);
                    break;
                case 2:
                    reasignarDespacho(listaPersonas);
                    break;
                case 3:
                    cambiarDeCurso(listaPersonas);
                    break;
                case 4:
                    reasignarCurso(listaPersonas);
                    break;
                case 5:
                    reasignarPersonalDeServicio(listaPersonas);
                    break;
                case 6:
                    mostrarPersonas(listaPersonas);
                    break;
                case 7:
                    menu();
                    break;
                case 8:
                    System.out.println("HA SALIDO");
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }

        } while (opc != 8);

    }

    public static void menu() {
        System.out.println("MENU"
                + "\nELIJA UNA OPCION"
                + "\n1.CAMBIAR ESTADO CIVIL"
                + "\n2.REASIGNAR DESPACHO"
                + "\n3.CAMBIARSE DE CURSO(ESTUDIANTE)"
                + "\n4.REASIGNAR PROFESOR A OTRO CURSO"
                + "\n5.REASIGNAR PERSONAL DE SERVICIO A OTRA SECCION"
                + "\n6.MOSTRAR PERSONAS DEL ESTABLECIMIENTO"
                + "\n7.MOSTRAR EL MENU"
                + "\n8.SALIR");

    }

    public static void crearEmpleado(ArrayList<Persona> listaPersonas) {
        for (int i = 0; i < 1; i++) {
            Profesor newProfesor = new Profesor();
            newProfesor.crearProfesor();
            listaPersonas.add(newProfesor);
            PersonalDeServicio newPersonalDeServicio = new PersonalDeServicio();
            newPersonalDeServicio.crearPersonalDeServicio();
            listaPersonas.add(newPersonalDeServicio);

        }

    }

    public static void crearEstudiante(ArrayList<Persona> listaPersonas) {
        for (int i = 0; i < 1; i++) {

            Estudiante newEstudiante = new Estudiante();
            newEstudiante.crearEstudiante();
            listaPersonas.add(newEstudiante);
        }
    }

    public static void cambiarEstadoCivil(ArrayList<Persona> listaPersonas) {

        for (Persona aux : listaPersonas) {
            if (validarDNI(listaPersonas)) {
                System.out.println("Indique su nuevo estado civil");
                String newEstadoCivil = leer.next();
                aux.setEstadoCivil(newEstadoCivil);
                break;

            } else {
                System.out.println("El DNI ingresado es incorrecto");
                break;
            }

        }

    }

    public static void reasignarDespacho(ArrayList<Persona> listaPersonas) {

        for (Persona aux : listaPersonas) {
            if (aux instanceof Profesor) {
                if (validarDNI(listaPersonas)) {
                    System.out.println("Indique su nuevo despacho");
                    String newDespacho = leer.next();
                    ((PersonalDeServicio) aux).setNumDespacho(newDespacho);
                    break;

                } else {
                    System.out.println("El DNI ingresado es incorrecto");
                    break;
                }

            }
            if (aux instanceof PersonalDeServicio) {
                if (validarDNI(listaPersonas)) {
                    System.out.println("Indique su nuevo despacho");
                    String newDespacho = leer.next();
                    ((PersonalDeServicio) aux).setNumDespacho(newDespacho);
                    break;

                } else {
                    System.out.println("El DNI ingresado es incorrecto");
                    break;
                }

            }

        }

    }

    public static void cambiarDeCurso(ArrayList<Persona> listaPersonas) {

        String newCurso;
        for (Persona aux : listaPersonas) {
            if (aux instanceof Estudiante) {
                if (validarDNI(listaPersonas)) {
                    do {
                        System.out.println("Indique a que curso va a cambiarse. Matematica/Lengua/Arquitectura/Ingenieria");
                        newCurso = leer.next();
                    } while (!newCurso.equalsIgnoreCase("Matematica") && !newCurso.equalsIgnoreCase("Lengua") && !newCurso.equalsIgnoreCase("Arquitectura") && !newCurso.equalsIgnoreCase("Ingenieria"));
                    ((Estudiante) aux).setCurso(newCurso);
                    break;

                } else {
                    System.out.println("El DNI ingresado es incorrecto");
                    break;
                }

            }

        }
    }

    public static void reasignarCurso(ArrayList<Persona> listaPersonas) {

        String newCurso;
        for (Persona aux : listaPersonas) {
            if (aux instanceof Profesor) {
                if (validarDNI(listaPersonas)) {

                    do {
                        System.out.println("Indique a que curso se va a cambiar el profesor. Matematica/Lengua/Arquitectura/Ingenieria");
                        newCurso = leer.next();
                    } while (!newCurso.equalsIgnoreCase("Matematica") && !newCurso.equalsIgnoreCase("Lengua") && !newCurso.equalsIgnoreCase("Arquitectura") && !newCurso.equalsIgnoreCase("Ingenieria"));
                    ((Profesor) aux).setDepartamento(newCurso);
                    break;
                } else {
                    System.out.println("El DNI ingresado es incorrecto");
                    break;
                }

            }
        }
    }

    public static void reasignarPersonalDeServicio(ArrayList<Persona> listaPersonas) {

        String newSeccion;
        for (Persona aux : listaPersonas) {
            if (aux instanceof PersonalDeServicio) {
                if (validarDNI(listaPersonas)) {
                    do {
                        System.out.println("Indique a que seccion pertenece. Biblioteca/Decanato/Secretaria");
                        newSeccion = leer.next();
                    } while (!newSeccion.equalsIgnoreCase("Biblioteca") && !newSeccion.equalsIgnoreCase("Decanato") && !newSeccion.equalsIgnoreCase("Secretaria"));
                    ((PersonalDeServicio) aux).setSeccion(newSeccion);
                    break;

                } else {
                    System.out.println("El DNI ingresado es incorrecto");
                    break;
                }

            }
        }

    }

    public static void mostrarPersonas(ArrayList<Persona> listaPersonas) {
        for (Persona listaPersona : listaPersonas) {
            System.out.println(listaPersona);
        }
    }

    public static boolean validarDNI(ArrayList<Persona> listaPersonas) {
        System.out.println("Ingrese el DNI");
        String auxDocu = leer.next();

        for (Persona aux : listaPersonas) {
            if (aux.getDocumento().equalsIgnoreCase(auxDocu)) {
                return true;
            }
        }
        return false;
    }
}
