
package Entidades;

import Interfaces.calcularAlquiler;


public final class Velero extends Barco implements calcularAlquiler{
    private int numMastiles;

    public Velero(int numMastiles, String matricula, double eslora, int aniofabricacion) {
        super(matricula, eslora, aniofabricacion);
        this.numMastiles = numMastiles;
    }

    public Velero() {
        
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public String toString() {
        return "Velero";
    }
    

    //SERVICIOS
    
    public void crearVelero(){
        
        crearBarco();
        System.out.println("Indique el numero de mastiles");
        setNumMastiles(leer.nextInt());
        
    }

    

    @Override
    public void calcularAlquiler(int difDias) {
        int costo;
        
        costo = (int)(difDias*(getEslora()*10)) + getNumMastiles();
        
        System.out.println("El costo del alquiler es " + costo);
        
    }
    
}
