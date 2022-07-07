
package Entidades;


public class Animal {
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String razaAnimal;

    public Animal(String nombre, String alimento, int edad, String razaAnimal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.razaAnimal = razaAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public int getEdad() {
        return edad;
    }

    public String getRazaAnimal() {
        return razaAnimal;
    }
    

   //Servicios
    
    public String alimentarse(){
        
        return alimento;
    }
    
}
