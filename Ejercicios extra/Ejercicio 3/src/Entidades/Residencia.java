package Entidades;

public final class Residencia extends AlojamientoExtrahotelero {

    private int cantidadHabitaciones;
    private boolean descuentoGremios;
    private boolean campoDeportivo;

    public Residencia(int cantidadHabitaciones, boolean descuentoGremios, boolean campoDeportivo, boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencia() {
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDescuentoGremios() {
        return descuentoGremios;
    }

    public void setDescuentoGremios(boolean descuentoGremios) {
        this.descuentoGremios = descuentoGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nResidencia"
                + "\nCantidad de Habitaciones: " + cantidadHabitaciones
                + "\nDescuento para Gremios: " + descuentoGremios
                + "\nCampo Deportivo: " + campoDeportivo;
    }
    //SERVICIOS

    public void crearResidencia() {
        System.out.println("CREAMOS UNA RESIDENCIA");
        crearAlojamientoExtraH();
        System.out.println("Indique la cantidad de habitaciones");
        setCantidadHabitaciones(leer.nextInt());
        String gremio;
        do {
            System.out.println("Se hacen descuentos a gremios?S/N");
            gremio = leer.next();
        } while (!gremio.equalsIgnoreCase("S") && !gremio.equalsIgnoreCase("N"));
        if (gremio.equalsIgnoreCase("S")) {
            setDescuentoGremios(true);

        }
        if (gremio.equalsIgnoreCase("N")) {
            setDescuentoGremios(false);
        }
        String depor;
        do {
            System.out.println("Tiene campo deportivo?S/N");
            depor = leer.next();
        } while (!depor.equalsIgnoreCase("S") && !depor.equalsIgnoreCase("N"));
        if (depor.equalsIgnoreCase("S")) {
            setCampoDeportivo(true);

        }
        if (depor.equalsIgnoreCase("N")) {
            setCampoDeportivo(false);

        }

    }
}
