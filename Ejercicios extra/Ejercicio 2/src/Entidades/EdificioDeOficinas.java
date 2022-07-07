package Entidades;

public final class EdificioDeOficinas extends Edificio {

    private int numOficinas;
    private int personasPorOficina;
    private int numeroPisos;

    public EdificioDeOficinas(int numOficinas, int personasPorOficina, int numeroPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numeroPisos = numeroPisos;
    }

    public EdificioDeOficinas() {
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas " + " Oficinas: " + numOficinas + ". Personas por oficina: " + personasPorOficina + ". Pisos: " + numeroPisos;
    }

    //SERVICIOS
    public void crearEdificioDeOficinas() {
        crearEdificio();
        System.out.println("Indique la cantidad de oficinas");
        setNumOficinas(leer.nextInt());
        System.out.println("Indique la cantidad de personas por oficina");
        setPersonasPorOficina(leer.nextInt());
        System.out.println("¿Cuantos pisos tiene?");
        setNumeroPisos(leer.nextInt());

    }

    public void cantPersonas() {
        
        int cantidadPersonaOficina = getPersonasPorOficina();

        setNumOficinas(getNumeroPisos());//Segun la guia, es una oficina por piso
        int cantidadPersonaEdificio = getPersonasPorOficina() * getNumOficinas();
        
        System.out.println("La cantidad de personas por oficina es " + cantidadPersonaOficina);
        
        System.out.println("La cantidad de personas que trabajan en el edificio es " + cantidadPersonaEdificio);
        
    }

    @Override
    public void calcularSuperficie() {
        double superficie;
        superficie = getAncho() * getLargo();
        System.out.println("La superficie es " + superficie);
    }

    @Override
    public void calcularVolumen() {
        double volumen;
        volumen = getAncho() * getLargo() * getAlto();

        System.out.println("El volumen es " + volumen);
    }

}
