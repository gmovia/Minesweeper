package Modelo.ModoDeJuego;

import Modelo.Celda.Celda;
import Modelo.Estado.Visibilidad;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VictoriaTest {

    @Test
    public void test01enModoVictoriaElJugadorGanaLaPartida(){
        Regla victoria = new Victoria();
        assertEquals(victoria.ganoLaPartida(), true);
    }

    @Test
    public void test02enModoVictoriaElJugadorNoPierdeLaPartida(){
        Regla victoria = new Victoria();
        assertEquals(victoria.perdioLaPartida(), false);
    }

}