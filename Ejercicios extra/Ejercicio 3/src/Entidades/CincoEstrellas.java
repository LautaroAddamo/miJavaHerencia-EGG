package Entidades;

public final class CincoEstrellas extends CuatroEstrellas {

    private int cantidadSalonesConferencia;
    private int cantidadSuites;
    private int cantidadLimosinas;

    public CincoEstrellas(int cantidadSalonesConferencia, int cantidadSuites, int cantidadLimosinas, String tipoGimnaso, String nombreRestaurante, int capacidadrestaurante, int cantidadhabitaciones, int numeroCamas, int numeroPisos, int precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(tipoGimnaso, nombreRestaurante, capacidadrestaurante, cantidadhabitaciones, numeroCamas, numeroPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public CincoEstrellas() {
    }

    public int getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public void setCantidadSalonesConferencia(int cantidadSalonesConferencia) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCincoEstrellas"
                + "\nCantidad de Salones de Conferencia: " + cantidadSalonesConferencia
                + "\nCantidad Suites: " + cantidadSuites
                + "\nCantidad de Limosinas: " + cantidadLimosinas;
    }

    //SERVICIOS
    public void crear5Estrellas() {
        crear4Estrellas();
        System.out.println("Indique la cantidad de salas de conferencia");
        setCantidadSalonesConferencia(leer.nextInt());
        System.out.println("Indique la cantidad de suites");
        setCantidadSuites(leer.nextInt());
        System.out.println("Indique la cantidad de limusinas");
        setCantidadLimosinas(leer.nextInt());
    }

    @Override
    public void calcularPrecio() {
        super.calcularPrecio();

        setPrecioHabitacion((int) getPrecioHabitacion() + (15 * getCantidadLimosinas()));

    }

}
