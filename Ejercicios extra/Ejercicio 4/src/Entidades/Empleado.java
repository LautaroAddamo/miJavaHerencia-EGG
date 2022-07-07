
package Entidades;


public class Empleado extends Persona {
    protected int anioDeIncorporacion;
    protected String numDespacho;

    public Empleado(int anioDeIncorporacion, String numDespacho, String nombreCompleto, String documento, String estadoCivil) {
        super(nombreCompleto, documento, estadoCivil);
        this.anioDeIncorporacion = anioDeIncorporacion;
        this.numDespacho = numDespacho;
    }

    public Empleado() {
    }

    public int getAnioDeIncorporacion() {
        return anioDeIncorporacion;
    }

    public void setAnioDeIncorporacion(int anioDeIncorporacion) {
        this.anioDeIncorporacion = anioDeIncorporacion;
    }

    public String getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(String numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmpleado" 
                + "\nAño de incorporacion: " + anioDeIncorporacion
                + "\nDespacho: " + numDespacho;
    }
    //SERVICIOS
    
    public void crearEmpleado(){
        crearPersona();
        System.out.println("En que año se incorporo al establecimiento?");
        setAnioDeIncorporacion(leer.nextInt());
        System.out.println("Indique a que despacho está asignado");
        setNumDespacho(leer.next());
    }
}
