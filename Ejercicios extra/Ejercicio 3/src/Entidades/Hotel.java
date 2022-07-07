package Entidades;

public class Hotel extends Alojamiento {

    protected int cantidadhabitaciones;
    protected int numeroCamas;//por habitacion
    protected int numeroPisos;
    protected int precioHabitacion;

    public Hotel(int cantidadhabitaciones, int numeroCamas, int numeroPisos, int precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadhabitaciones = cantidadhabitaciones;
        this.numeroCamas = numeroCamas;
        this.numeroPisos = numeroPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public Hotel() {
    }

    public int getCantidadhabitaciones() {
        return cantidadhabitaciones;
    }

    public void setCantidadhabitaciones(int cantidadhabitaciones) {
        this.cantidadhabitaciones = cantidadhabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public int getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(int precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHotel"
                + "\nCantidad de Habitaciones: " + cantidadhabitaciones
                + "\nNumero de Camas: " + numeroCamas
                + "\nNumero de Pisos: " + numeroPisos
                + "\nPrecio de habitacion: " + precioHabitacion;
    }

    //SERVICIOS
    public void crearHotel() {
        crearAlojamiento();
        System.out.println("Indique la cantidad de habitaciones de su hotel");
        setCantidadhabitaciones(leer.nextInt());
        System.out.println("Indique el numero de camas por habitacion");
        setNumeroCamas(leer.nextInt());
        System.out.println("Cuantos pisos tiene el hotel?");
        setNumeroPisos(leer.nextInt());

    }

}
