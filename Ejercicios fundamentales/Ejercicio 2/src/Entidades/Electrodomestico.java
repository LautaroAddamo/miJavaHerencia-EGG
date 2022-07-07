package Entidades;

import java.util.Scanner;
import Constantes.Constantes;

public class Electrodomestico {

    protected final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomestico() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '.';
    }

    
    

    //SERVICIOS
    public void comprobarConsumoEjergetico(char letra) {
        for (int i = 0; i < Constantes.LETRAS.length; i++) {
            if (letra == Constantes.LETRAS[i]) {
                setConsumoEnergetico(letra);
                break;
            } else {
                setConsumoEnergetico('F');
            }
        }

    }

    public void comprobarColor(String color) {
        for (int i = 0; i < Constantes.COLORES.length; i++) {
            if (color.equalsIgnoreCase(Constantes.COLORES[i])) {
                setColor(color);
                break;
            } else {
                setColor("Blanco");
            }
        }

    }

    public void crearElectrodomestico() {
        System.out.println("Elija el color");
        String color = (leer.next());
        comprobarColor(color);

        System.out.println("Elija la categoria de consumo energetico");
        char consumo = leer.next().charAt(0);
        comprobarConsumoEjergetico(consumo);

        System.out.println("Elija el peso aproximado que desea para su electrodomestico");
        setPeso(leer.nextDouble());

        setPrecio(1000d);

    }

    public void precioFinal() {
        for (int i = 0; i < Constantes.LETRAS.length; i++) {
            if (getConsumoEnergetico() == Constantes.LETRAS[i]) {
                setPrecio(getPrecio() + Constantes.PRECIOS[i]);
            }
        }
        if (getPeso() >= 1 && getPeso() <= 19) {
            setPrecio(getPrecio() + 100);
        }
        if (getPeso() >= 20 && getPeso() <= 49) {
            setPrecio(getPrecio() + 500);
        }
        if (getPeso() >= 50 && getPeso() <= 79) {
            setPrecio(getPrecio() + 800);
        }
        if (getPeso() >= 80) {
            setPrecio(getPrecio() + 1000);
        }
    }
}
