
package Entidades;

import Interfaces.calcularAlquiler;


public class BarcoMotor extends Barco implements calcularAlquiler {
    protected int potenciaCV;

    public BarcoMotor(int potenciaCV, String matricula, double eslora, int aniofabricacion) {
        super(matricula, eslora, aniofabricacion);
        this.potenciaCV = potenciaCV;
    }

    public BarcoMotor() {
        
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    @Override
    public String toString() {
        return "Barco a motor";
    }
    
    //SERVICIOS
    
    public void crearBarcoMotor(){
        crearBarco();
        System.out.println("Indique la potencia en CV");
        setPotenciaCV(leer.nextInt());
    }

   

    @Override
    public void calcularAlquiler(int difDias) {
        double costo;
        
        costo = (difDias*(getEslora()*10)) + getPotenciaCV() ;
        
        System.out.println("El costo del alquiler es " + costo);
    }
    
    
    
}
