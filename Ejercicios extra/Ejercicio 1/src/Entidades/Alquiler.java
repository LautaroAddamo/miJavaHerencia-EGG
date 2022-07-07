
package Entidades;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;


public final class Alquiler {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private String documento;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posAmarre = 0;
    private Barco barco;

    public Alquiler(String nombre, String documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posAmarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.barco = barco;
    }

    public Alquiler() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler:"
                + "\n Nombre:" + nombre +""
                + "\n Documento: " + documento + ""
                + "\n Alquilado desde: " + fechaAlquiler + ""
                + "\n Alquilado hasta: " + fechaDevolucion + ""
                + "\n Barco: " + barco;
                
    }
    
    
    //SERVICIOS
    
    public void crearAlquiler(){
        
        System.out.println("Indique su nombre");
        setNombre(leer.next());
        System.out.println("Indique su DNI");
        setDocumento(leer.next());
        
        crearFecha();
        
        calcularDiasAlquilado(getFechaAlquiler(), getFechaDevolucion());
        
        
         
    }
    public void crearFecha(){
        String fechaAlquilerAux;
        String fechaDevolucionAux;
        do {
            
        System.out.println("Indique desde que fecha quiere alquilar. Usar formato aaaa-mm-dd");
        fechaAlquilerAux = leer.next();
        } while (!fechaAlquilerAux.contains("-"));
        setFechaAlquiler(LocalDate.parse(fechaAlquilerAux));
        
        do {
            System.out.println("Indique hasta cuando quiere alquilar. Usar formato aaaa-mm-dd");
            fechaDevolucionAux = leer.next();
        } while (!fechaDevolucionAux.contains("-"));
        
        setFechaDevolucion(LocalDate.parse(fechaDevolucionAux));
        
        
        
    }
    
    public int calcularDiasAlquilado(LocalDate fechaAlq, LocalDate fechaDev){
        int diasAlquiler = 0;
        Duration dd = Duration.between(fechaAlq.atStartOfDay(), fechaDev.atStartOfDay());
        diasAlquiler = (int) dd.toDays();
        //System.out.println("Estuvo alquilado " + diasAlquiler + " dias.");
        return diasAlquiler;
    }
    
    
    
    
}
