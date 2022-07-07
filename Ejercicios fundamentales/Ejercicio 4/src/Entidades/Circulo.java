
package Entidades;

import Interfaces.calculosFormas;


public final class Circulo implements calculosFormas{
    
    private double radio;
    private double diametro;

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Circulo() {
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }

    

    @Override
    public void calcularArea() {
        double area;
        
        area = calculosFormas.pi * (getRadio() * getRadio());
        System.out.println("El area del circulo es : " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro;
        perimetro = calculosFormas.pi * getDiametro();
        System.out.println("El perimetro del circulo es : " + perimetro);
    }
    
    
}
