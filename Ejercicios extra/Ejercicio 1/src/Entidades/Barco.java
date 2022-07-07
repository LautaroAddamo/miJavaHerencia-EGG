
package Entidades;

import java.util.Scanner;


public class Barco {
    protected final Scanner leer = new Scanner (System.in).useDelimiter("\n");
    protected String matricula;
    protected double eslora;
    protected int aniofabricacion;

    public Barco(String matricula, double eslora, int aniofabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.aniofabricacion = aniofabricacion;
    }

    public Barco() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAniofabricacion() {
        return aniofabricacion;
    }

    public void setAniofabricacion(int aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", aniofabricacion=" + aniofabricacion + '}';
    }
    
    //SERVICIOS
    
    public void crearBarco(){
        
        System.out.println("Indique el numero de matricula");
        setMatricula(leer.next());
        System.out.println("Indique la eslora en metros");
        setEslora(leer.nextDouble());
        System.out.println("Indique el año de fabricacion");
        setAniofabricacion(leer.nextInt());
        
        
    }
    
}
