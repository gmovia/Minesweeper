package Modelo.Juego;

import Modelo.Celda.Celda;
import Modelo.Contenido.Bomba;
import Modelo.Posicion.Posicion;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JuegoTest {

    @Test
    public void test01dadoQueNoHayUnaBombaEnLaPosicion2x3DeUnMapaDe8x8CuandoElJugadorSeleccionaLaCelda2x3NoPierdeLaPartida(){
        Juego juego = new Juego(8, 8);
        Posicion posicion = new Posicion(2, 3);

        juego.agregar(new Celda(), posicion);
        juego.seleccionarCelda(posicion);

        assertEquals(false, juego.elJugadorPerdioLaPartida());
    }

    @Test
    public void test02dadoQueHayUnaBombaEnLaPosicion1x7DeUnMapaDe8x8CuandoElJugadorSeleccionaLaCelda1x7PierdeLaPartida(){
        Juego juego = new Juego(8, 8);
        Posicion posicion = new Posicion(1, 7);
        Celda celda = new Celda(new Bomba());

        juego.agregar(celda, posicion);
        juego.seleccionarCelda(posicion);

        assertEquals(true, juego.elJugadorPerdioLaPartida());
    }

    @Test
    public void test03dadoQueQuedaUnaUltimaCeldaVaciaYEnLaPosicion1x1DeUnMapaDe2x2CuandoElJugadorSeleccionaLaCelda1x1GanaLaPartida(){
        Juego juego = new Juego(2, 2);

        Posicion posicion00 = new Posicion(0, 0);
        juego.agregar(new Celda(), posicion00);
        juego.seleccionarCelda(posicion00);

        Posicion posicion01 = new Posicion(0, 1);
        juego.agregar(new Celda(), posicion01);
        juego.seleccionarCelda(posicion01);

        Posicion posicion10 = new Posicion(1, 0);
        juego.agregar(new Celda(), posicion10);
        juego.seleccionarCelda(posicion10);

        Posicion posicion = new Posicion(1, 1);
        juego.agregar(new Celda(), posicion);
        juego.seleccionarCelda(posicion);

        assertEquals(true, juego.elJugadorGanoLaPartida());
    }

}