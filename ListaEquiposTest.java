/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package clases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author migue
 */
public class ListaEquiposTest {
    
    public ListaEquiposTest() {
    }

    @Test
    public void testGetNombreEquipoSeleccionado() {
        System.out.println("getNombreEquipoSeleccionado");
        ListaEquipos instance = new ListaEquipos();
        String expResult = "";
        String result = instance.getNombreEquipoSeleccionado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombreEquipoSeleccionado() {
        System.out.println("setNombreEquipoSeleccionado");
        String nombreEquipoSeleccionado = "";
        ListaEquipos instance = new ListaEquipos();
        instance.setNombreEquipoSeleccionado(nombreEquipoSeleccionado);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        ListaEquipos instance = new ListaEquipos();
        int expResult = 0;
        int result = instance.getPosition();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        int position = 0;
        ListaEquipos instance = new ListaEquipos();
        instance.setPosition(position);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAgregarEquiposLista() {//DONE
        System.out.println("agregarEquiposLista");
        ListaEquipos e1 = new ListaEquipos();
        int expResult = 8;
        int result = e1.agregarEquiposLista();
        assertEquals(expResult, result);
        System.out.println(result);
    }

    @Test
    public void testEscogerEquipo() {//DONE
        System.out.println("escogerEquipo");
        ListaEquipos e1 = new ListaEquipos();
        e1.agregarEquiposLista();
        boolean result = e1.escogerEquipo(e1);
        assertTrue(result);
        System.out.println(result);
    }

    @Test
    public void testMostrarEquipoSeleccionado() {//DONE
        System.out.println("mostrarEquipoSeleccionado");
        ListaEquipos e1 = new ListaEquipos();
        e1.agregarEquiposLista();
        e1.setNombreEquipoSeleccionado("Liverpool");
        String expResult = e1.getNombreEquipoSeleccionado();
        String result = e1.mostrarEquipoSeleccionado(e1);
        assertEquals(expResult, result);
    }

    @Test
    public void testGuardarEquipo() {//DONE
        System.out.println("guardarEquipo");
        ListaEquipos e1 = new ListaEquipos();
        e1.setNombreEquipoSeleccionado("Manchester United");
        String expResult = "Manchester United";
        String result = e1.guardarEquipo(e1);
        System.out.println(e1.guardarEquipo(e1));
        assertEquals(expResult, result);
    }
    
}
