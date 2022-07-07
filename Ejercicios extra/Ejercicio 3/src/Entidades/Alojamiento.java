package Entidades;

import java.util.Scanner;

public class Alojamiento {

    protected final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public Alojamiento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Alojamiento:"
                + "\nNombre del establecimiento: " + nombre
                + "\nDireccion: " + direccion
                + "\nLocalidad: " + localidad
                + "\nGerente: " + gerente;

    }

    //SERVICIOS
    public void crearAlojamiento() {
        System.out.println("Indique el nombre del alojamiento");
        setNombre(leer.next());
        System.out.println("Indique la direccion");
        setDireccion(leer.next());
        System.out.println("Indique la localidad");
        setLocalidad(leer.next());
        System.out.println("Nombre del gerente");
        setGerente(leer.next());
    }
}
