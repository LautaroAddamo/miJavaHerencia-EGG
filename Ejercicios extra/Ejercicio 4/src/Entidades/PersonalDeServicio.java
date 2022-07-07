
package Entidades;


public final class PersonalDeServicio extends Empleado{
    private String seccion;

    public PersonalDeServicio(String seccion, int anioDeIncorporacion, String numDespacho, String nombreCompleto, String documento, String estadoCivil) {
        super(anioDeIncorporacion, numDespacho, nombreCompleto, documento, estadoCivil);
        this.seccion = seccion;
    }

    public PersonalDeServicio() {
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPersonalDeServicio"
                + "\nsSeccion: " + seccion;
    }
    //SERVICIOS
    
    public void crearPersonalDeServicio(){
        System.out.println("CREO UN PERSONAL DE SERVICIO");
        crearEmpleado();
        String sec;
        do {
        System.out.println("Indique a que seccion pertenece. Biblioteca/Decanato/Secretaria");
        sec = leer.next();
        } while (!sec.equalsIgnoreCase("Biblioteca")&&!sec.equalsIgnoreCase("Decanato")&&!sec.equalsIgnoreCase("Secretaria"));
        setSeccion(sec);
        
    }
}
