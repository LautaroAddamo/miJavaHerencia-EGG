package Entidades;

public class CuatroEstrellas extends Hotel {

    protected String tipoGimnasio;
    protected String nombreRestaurante;
    protected int capacidadrestaurante;

    public CuatroEstrellas(String tipoGimnaso, String nombreRestaurante, int capacidadrestaurante, int cantidadhabitaciones, int numeroCamas, int numeroPisos, int precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadhabitaciones, numeroCamas, numeroPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.tipoGimnasio = tipoGimnaso;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadrestaurante = capacidadrestaurante;
    }

    public CuatroEstrellas() {
    }

    public String getTipoGimnaso() {
        return tipoGimnasio;
    }

    public void setTipoGimnaso(String tipoGimnaso) {
        this.tipoGimnasio = tipoGimnaso;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadrestaurante() {
        return capacidadrestaurante;
    }

    public void setCapacidadrestaurante(int capacidadrestaurante) {
        this.capacidadrestaurante = capacidadrestaurante;
    }

    @Override
    public String toString() {
        return  super.toString() + "\nCuatroEstrellas"
                + "\nTipo de Gimnasio: " + tipoGimnasio
        + "\nNombre del Restaurante: " + nombreRestaurante 
        + "\nCapacidad del Restaurante: " + capacidadrestaurante;
    }
    //SERVICIOS

    public void crear4Estrellas() {
        System.out.println("CREAMOS UN HOTEL");
        crearHotel();
        String opc;
        do {
            System.out.println("Indique el tipo de gimnasio");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("A") && !opc.equalsIgnoreCase("B"));

        setTipoGimnaso(opc);

        System.out.println("Indique el nombre del restaurante");
        setNombreRestaurante(leer.next());
        System.out.println("Indique la capacidad del restaurante");
        setCapacidadrestaurante(leer.nextInt());

    }

    public void calcularPrecio() {

        precioHabitacion = 50 + (getNumeroCamas() * getCantidadhabitaciones());
        if (getCapacidadrestaurante() < 30) {
            precioHabitacion += 10;
        } else if (getCapacidadrestaurante() >= 30 && getCapacidadrestaurante() <= 50) {
            precioHabitacion += 30;
        } else {
            precioHabitacion += 50;
        }
        if (getTipoGimnaso().equalsIgnoreCase("A")) {
            precioHabitacion += 50;
        } else {
            precioHabitacion += 30;
        }

        setPrecioHabitacion(precioHabitacion);
    }

}
