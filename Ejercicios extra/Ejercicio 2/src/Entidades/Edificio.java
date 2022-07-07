
package Entidades;

import java.util.Scanner;


public abstract class Edificio {
    protected final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected double ancho;
    protected double alto;
    protected double largo;

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public Edificio() {
    }
    

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Edificio: ";
    }
    
    //SERVICIOS
    
    public abstract void calcularSuperficie();
    public abstract void calcularVolumen();
    
    public void crearEdificio(){
        System.out.println("Indique el ancho");
        setAncho(leer.nextDouble());
        System.out.println("Indique el alto");
        setAlto(leer.nextDouble());
        System.out.println("Indique el largo");
        setLargo(leer.nextDouble());
    }
    
}
