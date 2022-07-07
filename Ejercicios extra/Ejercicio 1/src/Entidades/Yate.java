package Entidades;

import Interfaces.calcularAlquiler;

public final class Yate extends BarcoMotor implements calcularAlquiler{

    private int camarotes;

    public Yate(int camarotes, int potenciaCV, String matricula, double eslora, int aniofabricacion) {
        super(potenciaCV, matricula, eslora, aniofabricacion);
        this.camarotes = camarotes;
    }

    public Yate() {

    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    @Override
    public String toString() {
        return "Yate";
    }
    
    //SERVICIOS
    
    public void crearYate(){
        crearBarcoMotor();
        System.out.println("Indique la cantidad de camarotes");
        setCamarotes(leer.nextInt());
        
    }
    

    @Override
    public void calcularAlquiler(int difDias) {
        double costo;
        
        costo = (difDias*(getEslora()*10)) + getPotenciaCV() + getCamarotes() ;
        
        System.out.println("El costo del alquiler es " + costo);
    }

}
