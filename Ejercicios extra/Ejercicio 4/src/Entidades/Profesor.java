
package Entidades;


public final class Profesor extends Empleado {
    private String departamento;

    public Profesor(String departamento, int anioDeIncorporacion, String numDespacho, String nombreCompleto, String documento, String estadoCivil) {
        super(anioDeIncorporacion, numDespacho, nombreCompleto, documento, estadoCivil);
        this.departamento = departamento;
    }

    public Profesor() {
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProfesor" 
                + "\nAsignatura: " + departamento;
    }
    //SERVICIOS
    
    public void crearProfesor(){
        System.out.println("CREO UN PROFESOR");
        crearEmpleado();
        String asignatura;
        do {
        System.out.println("Indique a que departamento pertenece. Matematica/Lengua/Arquitectura/Ingenieria");
        asignatura = leer.next();
        } while (!asignatura.equalsIgnoreCase("Matematica")&&!asignatura.equalsIgnoreCase("Lengua")&&!asignatura.equalsIgnoreCase("Arquitectura")&&!asignatura.equalsIgnoreCase("Ingenieria"));
        
        setDepartamento(asignatura);
        
    }
}
