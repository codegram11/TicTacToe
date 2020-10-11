
package player;

import javax.swing.JOptionPane;


public class Jugador {
    private String nombre;
    private int record;
    
    public Jugador(String nombre){
        this.nombre=nombre;
        this.record=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }
    
    public void acumularRecord(){
        record+=50;
    }

    @Override
    public String toString() {
        return nombre+" con el Record de "+record;
    }
    
    
    
}
