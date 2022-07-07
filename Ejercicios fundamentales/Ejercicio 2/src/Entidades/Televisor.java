package Entidades;

public final class Televisor extends Electrodomestico {

    private int pulgadas;
    private boolean sintonizadorTDT;

    public Televisor(int pulgadas, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor() {
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "Televisor{" + "pulgadas=" + pulgadas + ", sintonizadorTDT=" + sintonizadorTDT + '}' + super.toString();
    }

    
    

    //SERVICIOS
    public void crearTelevisor() {
        crearElectrodomestico();

        System.out.println("Cuantas pulgadas tiene?");
        setPulgadas(leer.nextInt());
        System.out.println("Tiene sintonizador? s/n");
        String opc = leer.next();
        if (opc.equalsIgnoreCase("s")) {
            setSintonizadorTDT(true);
        }
        if (opc.equalsIgnoreCase("n")) {
            setSintonizadorTDT(false);
        }

        precioFinal();
    }

    public void precioFinal() {
        super.precioFinal();

        if (getPulgadas() > 40) {
            setPrecio(getPrecio() + (getPrecio() * 0.3));
        }
        if (isSintonizadorTDT()) {
            setPrecio(getPrecio() + 500);
        }
        System.out.println("El precio final del televisor es de $ " + getPrecio());
    }

    public void mostrar() {
        System.out.println("Caracteristicas de su lavadora: "
                + "\nColor: " + getColor()
                + "\nConsumo: " + getConsumoEnergetico()
                + "\nPeso: " + getPeso()
                + "\nPulgadas: " + getPulgadas()
                + "\nSintonizador: " + isSintonizadorTDT()
                + "\nPrecio: " + getPrecio());
    }

}
