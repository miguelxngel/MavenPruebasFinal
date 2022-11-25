/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Main{
    
        public static void main(String[] args) {
            JOptionPane.showMessageDialog(null, "BIENVENIDO A LA LIGA", "PREMIER LEAGUE", 3);
            ArrayList<Equipos> tablaPosiciones = new ArrayList<Equipos>();
            ListaEquipos lista1 = new ListaEquipos();
            lista1.agregarEquiposLista();
            do{
                lista1.escogerEquipo(lista1);
                Equipos equipo = new Equipos();
                equipo.setNombre(lista1.guardarEquipo(lista1));
                equipo = Utilidades.recogerDatosEquipo(equipo);
                equipo.setPuntos(Utilidades.calculoPuntos(equipo));
                equipo.setDiferenciaGol(Utilidades.calcularDiferenciGol(equipo));
                Utilidades.mostrarResultados(equipo);
                tablaPosiciones.add(equipo);
            }while(Utilidades.nuevoEquipo()==true);
            Collections.sort(tablaPosiciones);
            Utilidades.mostrarPosicionesFinales(tablaPosiciones);

            
        }

    }
        


