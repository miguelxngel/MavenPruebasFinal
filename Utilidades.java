/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import javax.swing.*;
import java.util.ArrayList;

public class Utilidades {

    public static Equipos recogerDatosEquipo(Equipos e1) {//SE LE PREGUNTA AL USUARIO LOS DATOS DEL EQUIPO
        boolean evaluacion = true;
        do {
            e1.setPartidosJugados(Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de partidos jugados: ")));
            e1.setPartidosGanados(Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de partidos ganados: ")));
            e1.setPartidosEmpatados(Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de partidos empatados: ")));
            e1.setPartidosPerdidos(Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de partidos perdidos: ")));
            e1.setGolesFavor(Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de goles a favor: ")));
            e1.setGolesContra(Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de goles en contra: ")));
            evaluacion = evaluacionDatos(e1);
        } while (evaluacion==false);
        return e1;
    }

    public static boolean evaluacionDatos(Equipos e1) {//SE EVALUAN LOS DATOS QUE EL USUARIO DIGITO
        int totalPartidos = e1.getPartidosGanados() + e1.getPartidosEmpatados() + e1.getPartidosPerdidos();
        if (e1.getPartidosJugados() == totalPartidos) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Los datos no coinciden...", "ERROR", 1);
            return false;
        }
    }

    public static int calculoPuntos(Equipos e1) {//SE CALCULA EL PUNTAJE
        e1.setPuntos(e1.getPartidosGanados() * 3 + e1.getPartidosEmpatados() * 1);
        return e1.getPuntos();
    }

    public static int calcularDiferenciGol(Equipos e1) {//SE CALCULA LA DIFERENCIA DE GOL
        e1.setDiferenciaGol(e1.getGolesFavor() - e1.getGolesContra());
        return e1.getDiferenciaGol();
    }

    public static String mostrarResultados(Equipos e1) {//MOSTRAR RESULTADO DE PUNTOS Y DIFERENCIA DE GOL
        int puntos = calculoPuntos(e1);
        int diferenciaGol = calcularDiferenciGol(e1);
        JOptionPane.showMessageDialog(null, "Su equipo tiene " + puntos + " puntos y una diferencia de gol de " + diferenciaGol);
        return "mostro el resultado";
    }

    public static boolean nuevoEquipo() {//PREGUNTAR AL USUARIO SI DESEA AGREGAR UN NUEVO EQUIPO
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(null, "Desea agregar otro equipo?", "Confirmar", JOptionPane.YES_OPTION);
        if (respuesta == JOptionPane.NO_OPTION || respuesta == JOptionPane.CLOSED_OPTION) {
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean mostrarPosicionesFinales(ArrayList<Equipos> listaFinal) {//MOSTRAR TABLA DE POSICIONES FINAL
        JOptionPane.showMessageDialog(null, "TABLA DE POSICIONES FINAL", "PREMIER LEAGUE", 3);
        String contenidoImput = "";

        for (int i = 0; i < listaFinal.size(); i++) {
            contenidoImput = ("\n" + listaFinal.get(i).getNombre() + "                     " + listaFinal.get(i).getPuntos() + " Puntos"+"\n") + contenidoImput;
        }
        JOptionPane.showMessageDialog(null, contenidoImput, "PREMIER LEAGUE",3);
        return true;
    }
}
