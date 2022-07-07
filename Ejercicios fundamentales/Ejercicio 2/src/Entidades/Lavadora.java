/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Lautaro
 */
public final class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora() {

    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora: " + "carga=" + carga + ',' + super.toString();
    }

   
    

    public void crearLavadora() {
        crearElectrodomestico();

        System.out.println("Indique la carga que desea en su lavadora");
        setCarga(leer.nextInt());

        precioFinal();
    }

    public void precioFinal() {
        super.precioFinal();
        
        if (getCarga() > 30) {
            setPrecio(getPrecio() + 500);
        }
        System.out.println("El precio final de la lavadora es de $ " + getPrecio());
    }

    public void mostrar() {
        System.out.println("Caracteristicas de su lavadora: "
                + "\nColor: " + getColor()
                + "\nConsumo: " + getConsumoEnergetico()
                + "\nPeso: " + getPeso()
                + "\nCarga: " + getCarga()
                + "\nPrecio: " + getPrecio());

      
    }

}
