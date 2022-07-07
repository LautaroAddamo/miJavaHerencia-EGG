package Entidades;

public final class Camping extends AlojamientoExtrahotelero {

    private int capacidadCarpas;
    private int cantidadBanios;
    private boolean restaurante;
    
    public Camping(int capacidadCarpas, int cantidadBanios, boolean restaurante, boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.capacidadCarpas = capacidadCarpas;
        this.cantidadBanios = cantidadBanios;
        this.restaurante = restaurante;
    }
    
    public Camping() {
    }
    
    public int getCapacidadCarpas() {
        return capacidadCarpas;
    }
    
    public void setCapacidadCarpas(int capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }
    
    public int getCantidadBanios() {
        return cantidadBanios;
    }
    
    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }
    
    public boolean isRestaurante() {
        return restaurante;
    }
    
    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCamping" 
                + "\nCapacidad de Carpas: " + capacidadCarpas
                + "\nCantidad de Baños: " + cantidadBanios
                + "\nRestaurante: " + restaurante;
    }

    //SERVICIOS
    public void crearCamping() {
        System.out.println("CREAMOS UN CAMPING");
        crearAlojamientoExtraH();
        System.out.println("Indique cuantas carpas entran en el camping");
        setCapacidadCarpas(leer.nextInt());
        System.out.println("Indique la cantidad de baños");
        setCantidadBanios(leer.nextInt());
        String opc;
        do {
            System.out.println("Tiene restaurante?S/N");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N"));
        if (opc.equalsIgnoreCase("S")) {
            setRestaurante(true);
        }
        if (opc.equalsIgnoreCase("N")) {
            setRestaurante(false);
        }
    }
}
