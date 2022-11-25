/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ListaEquipos {
    //ATRIBUTOS
    private String nombreEquipoSeleccionado;
    private int position;
    private ArrayList<String> equipos = new ArrayList();
   
    //METODOS SETTERS AND GETTERS

    public String getNombreEquipoSeleccionado() {
        return nombreEquipoSeleccionado;
    }

    public void setNombreEquipoSeleccionado(String nombreEquipoSeleccionado) {
        this.nombreEquipoSeleccionado = nombreEquipoSeleccionado;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
    //METODOS 
    
    public int agregarEquiposLista() {//CREACION DE LISTA DE EQUIPOS
        equipos.add("Liverpool");
        equipos.add("Chelsea");
        equipos.add("Manchester United");
        equipos.add("Manchester City");
        equipos.add("Everton");
        equipos.add("Arsenal");
        equipos.add("Tottenham");
        equipos.add("West Ham");
        return equipos.size();
    }

    public boolean escogerEquipo(ListaEquipos e1) {//ESCOGER EQUIPO POR PARTE DEL USUARIO
        do {
            String contenidoImput="";
            
            for (int i = equipos.size()-1; i>=0; i--) {
                contenidoImput = ("\n" + equipos.get(i) + " = " + i + "\n")+contenidoImput;
            }
            JOptionPane.showMessageDialog(null,contenidoImput);
            e1.setPosition(Integer.parseInt(JOptionPane.showInputDialog("Cual es su equipo?:")));
            if(e1.getPosition()>=8){
                JOptionPane.showMessageDialog(null, "El equipo no se encuentra en la lista","ERROR",0);
            }
        } while (e1.getPosition()>=equipos.size());
        mostrarEquipoSeleccionado(e1);
        return true;
    }

    public String mostrarEquipoSeleccionado(ListaEquipos e1) {//MOSTRAR EQUIPO SELECCIONADO POR EL USUARIO   
        e1.setNombreEquipoSeleccionado(equipos.get(position));
        JOptionPane.showMessageDialog(null, "El equipo es:  " + e1.getNombreEquipoSeleccionado());
        return e1.getNombreEquipoSeleccionado();
    }

    public String guardarEquipo(ListaEquipos e1) {//GUARDAR EQUIPO 
        return e1.getNombreEquipoSeleccionado();
    }
    
    
}
