
package Entidades;

import Interfaces.calculosFormas;


public final class Rectangulo implements calculosFormas{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

     @Override
    public void calcularArea() {
        double area;
        area = getBase()*getAltura();
        System.out.println("El area del rectangulo es: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro;
        perimetro = (getBase()+getAltura()*2);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }

  
    
}
