/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package clases;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author migue
 */
public class UtilidadesTest {
    
    public UtilidadesTest() {
    }

    @Test
    public void testRecogerDatosEquipo() {//DONE
        System.out.println("recogerDatosEquipo");
        Equipos e1 = new Equipos();
        Equipos expResult = e1;
        Equipos result = Utilidades.recogerDatosEquipo(e1);
        assertEquals(expResult, result);
        System.out.println(result);
    }

    @Test
    public void testEvaluacionDatos() {//DONE
        System.out.println("evaluacionDatos");
        Equipos e1 = new Equipos();
        e1.setPartidosJugados(50);
        e1.setPartidosGanados(30);
        e1.setPartidosEmpatados(10);
        e1.setPartidosPerdidos(10);
        boolean expResult = true;
        boolean result = Utilidades.evaluacionDatos(e1);
        assertEquals(expResult, result);
        System.out.println(result);
    }

    @Test
    public void testCalculoPuntos() {//DONE
        System.out.println("calculoPuntos");
        Equipos e1 = new Equipos();
        e1.setPartidosGanados(10);
        e1.setPartidosEmpatados(5);
        int expResult = 35;
        int result = Utilidades.calculoPuntos(e1);
        assertEquals(expResult, result);
        System.out.println(result);
    }

    @Test
    public void testCalcularDiferenciGol() {//DONE
        System.out.println("calcularDiferenciGol");
        Equipos e1 = new Equipos();
        e1.setGolesFavor(50);
        e1.setGolesContra(30);
        int expResult = 20;
        int result = Utilidades.calcularDiferenciGol(e1);
        assertEquals(expResult, result);
        System.out.println(result);
    }

    @Test
    public void testMostrarResultados() {//DONE
        System.out.println("mostrarResultados");
        Equipos e1 = new Equipos();
        String expResult = "mostro el resultado";
        String result = Utilidades.mostrarResultados(e1);
        assertEquals(expResult, result);
        System.out.println(result);
    }

    @Test
    public void testNuevoEquipo() {//DONE
        System.out.println("nuevoEquipo");
        boolean expResult = false;
        boolean result = Utilidades.nuevoEquipo();
        assertEquals(expResult, result);
        System.out.println(result);
    }

    @Test
    public void testMostrarPosicionesFinales() {//DONE
        System.out.println("mostrarPosicionesFinales");
        ArrayList<Equipos> listaFinal = new ArrayList();
        boolean result = Utilidades.mostrarPosicionesFinales(listaFinal);
        assertTrue(result);
        System.out.println(result);
    }
    
}
