
package Entidades;

import java.util.Scanner;


public class Persona {
    protected final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String nombreCompleto;
    protected String documento;
    protected String estadoCivil;

    public Persona(String nombreCompleto, String documento, String estadoCivil) {
        this.nombreCompleto = nombreCompleto;
        this.documento = documento;
        this.estadoCivil = estadoCivil;
    }

    public Persona() {
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona"
                + "\nNombre: " + nombreCompleto
                + "\nDocumento: " + documento
                + "\nEstado civil: " + estadoCivil;
    }
    
    //SERVICIOS 
    
    public void crearPersona(){
        System.out.println("Indique su nombre completo");
        setNombreCompleto(leer.next());
        System.out.println("Ingrese su documento");
        setDocumento(leer.next());
        System.out.println("Indique su estado civil");
        setEstadoCivil(leer.next());
        
    }
}
