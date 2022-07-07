package Utils;

import Entidades.*;
import java.util.ArrayList;

public class Orquestador {

    static ArrayList<Edificio> listaEdificio = new ArrayList();

    public static void crearOrquestador() {
        for (int i = 0; i < 2; i++) {
            System.out.println("NUEVO POLI");
            Polideportivo newPolideportivo = new Polideportivo();
            newPolideportivo.crearPolideportivo();
            listaEdificio.add(newPolideportivo);
            System.out.println("NUEVO EDIFICIO DE OFICINAS");
            EdificioDeOficinas newEdificioDeOficinas = new EdificioDeOficinas();
            newEdificioDeOficinas.crearEdificioDeOficinas();
            listaEdificio.add(newEdificioDeOficinas);
        }
        int techado = 0;
        int abierto = 0;
        for (Edificio aux : listaEdificio) {
            System.out.println(aux);
            aux.calcularSuperficie();
            aux.calcularVolumen();
            
            if (aux instanceof Polideportivo) {
                if (((Polideportivo) aux).isTecho()) {
                    techado++;
                }else{
                    abierto++;
                }
                
            }
            if (aux instanceof EdificioDeOficinas) {
                ((EdificioDeOficinas) aux).cantPersonas();
                
            }
            
        }
        
        System.out.println("Hay " + techado + " polideportivos cubiertos");
        
        System.out.println("Hay " + abierto + " polideportivos abiertos");
    }
   

}
