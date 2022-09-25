package Modelo.ModoDeJuego;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DesarrolloTest {

    @Test
    public void test01enModoDesarrolloElJugadorNoPierdeLaPartida(){
        Regla desarrollo = new Desarrollo();
        assertEquals(desarrollo.perdioLaPartida(), false);
    }

    @Test
    public void test02enModoDesarrolloElJugadorNoGanaLaPartida(){
        Regla desarrollo = new Desarrollo();
        assertEquals(desarrollo.ganoLaPartida(), false);
    }
}