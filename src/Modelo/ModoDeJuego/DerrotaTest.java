package Modelo.ModoDeJuego;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DerrotaTest {

    @Test
    public void test01enModoDerrotaElJugadorPierdeLaPartida(){
        Regla derrota = new Derrota();
        assertEquals(derrota.perdioLaPartida(), true);
    }

    @Test
    public void test02enModoDerrotaElJugadorNoGanaLaPartida(){
        Regla derrota = new Derrota();
        assertEquals(derrota.ganoLaPartida(), false);
    }
}