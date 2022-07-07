
package Entidades;


public final class Estudiante extends Persona {
    private String curso;

    public Estudiante(String curso, String nombreCompleto, String documento, String estadoCivil) {
        super(nombreCompleto, documento, estadoCivil);
        this.curso = curso;
    }

    public Estudiante() {
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEstudiante" 
                + "\nCurso: " + curso;
    }
    
    //SERVICIOS
    
    public void crearEstudiante(){
        System.out.println("CREO UN ESTUDIANTE");
        crearPersona();
        String curso;
        do {
        System.out.println("Indique a que curso pertenece. Matematica/Lengua/Arquitectura/Ingenieria");
        curso = leer.next();
        } while (!curso.equalsIgnoreCase("Matematica")&&!curso.equalsIgnoreCase("Lengua")&&!curso.equalsIgnoreCase("Arquitectura")&&!curso.equalsIgnoreCase("Ingenieria"));
        
        setCurso(curso);
    }
    
}
