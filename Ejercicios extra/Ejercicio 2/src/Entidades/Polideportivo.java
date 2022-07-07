package Entidades;

public final class Polideportivo extends Edificio {

    private String nombre;
    private boolean techo;

    public Polideportivo(String nombre, boolean abierto, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techo = abierto;
    }

    public Polideportivo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTecho() {
        return techo;
    }

    public void setTecho(boolean abierto) {
        this.techo = abierto;
    }

    @Override
    public String toString() {
        return "Polideportivo" + " Nombre: " + nombre + ". Techo:" + techo + '}';
    }
    

    //SERVICIOS
    public void crearPolideportivo() {
        crearEdificio();
        System.out.println("Indique el nombre");
        setNombre(leer.next());

        String opc;
        do {
            
        
        System.out.println("El poli es techado? S/N");
        opc = leer.next();

        
        } while ((!opc.equalsIgnoreCase("S"))&&(!opc.equalsIgnoreCase("N")) );
        
        if (opc.equalsIgnoreCase("S")) {
            setTecho(true);
        }
        if (opc.equalsIgnoreCase("N")) {
            setTecho(false);
    }
    }

    @Override
    public void calcularSuperficie() {
        double superficie;
        superficie = getAncho()*getLargo();
        System.out.println("La superficie es " + superficie);
    }

    @Override
    public void calcularVolumen() {
        double volumen;
        volumen = getAncho() * getLargo() * getAlto();
        
        System.out.println("El volumen es " + volumen);
    }

}
