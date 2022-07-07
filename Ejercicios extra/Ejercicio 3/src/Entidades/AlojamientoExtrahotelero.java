package Entidades;

public class AlojamientoExtrahotelero extends Alojamiento {

    protected boolean privado;
    protected int metrosCuadrados;

    public AlojamientoExtrahotelero(boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public AlojamientoExtrahotelero() {
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAlojamientoExtrahotelero"
                + "\nPrivado: " + privado
                + "\nMetros Cuadrados: " + metrosCuadrados;
    }

    //SERVICIOS
    public void crearAlojamientoExtraH() {
        crearAlojamiento();
        String opc;
        do {
            System.out.println("El alojamiento es privado?S/N");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N"));
        if (opc.equalsIgnoreCase("S")) {
            setPrivado(true);
        }
        if (opc.equalsIgnoreCase("N")) {
            setPrivado(false);
        }
        System.out.println("Indique los metros cuadrados del alojamiento");
        setMetrosCuadrados(leer.nextInt());
    }
}
