package Modelo.Logica;

import Modelo.Celda.Celda;
import Modelo.Contenido.Bomba;
import Modelo.Contenido.Contenido;
import Modelo.Contenido.Vacio;
import Modelo.Mapa.Mapa;
import Modelo.ModoDeJuego.Derrota;
import Modelo.ModoDeJuego.Desarrollo;
import Modelo.ModoDeJuego.Victoria;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogicaTest {

    Mapa mapa = new Mapa(2, 2);

    @Test
    public void test01alInicioLaLogicaEstableceQueElJugadorNoPierdeLaPartida(){
        Logica logica = new Logica(mapa);
        assertEquals(logica.elJugadorPerdioLaPartida(), false);
    }

    @Test
    public void test02alInicioLaLogicaEstableceQueElJugadorNoGanaLaPartida(){
        Logica logica = new Logica(mapa);
        assertEquals(logica.elJugadorGanoLaPartida(), false);
    }

    @Test
    public void test03siElContenidoEsUnaBombaLaLogicaEstableceQueElJugadorPierdeLaPartida(){
        Logica logica = new Logica(mapa);
        Celda celda = new Celda(new Bomba());

        logica.seleccionar(celda);
        assertEquals(logica.elJugadorPerdioLaPartida(), true);
    }

    @Test
    public void test04siElContenidoEsVacioaLaLogicaEstableceQueElJugadorNoPierdeLaPartida(){
        Logica logica = new Logica(mapa);
        Celda celda = new Celda();

        logica.seleccionar(celda);
        assertEquals(logica.elJugadorPerdioLaPartida(), false);
    }

    @Test
    public void test05siElContenidoEsUnaBombaLaLogicaEstableceQueElJugadorNoGanaLaPartida(){
        Logica logica = new Logica(mapa);
        Celda celda = new Celda(new Bomba());

        logica.seleccionar(celda);
        assertEquals(logica.elJugadorGanoLaPartida(), false);
    }

    @Test
    public void test06siElContenidoEsVacioyEsLaUltimaCeldaVaciaQueElJugadorAdivinaEntoncesElJugadorGanaLaPartida(){
        Logica logica = new Logica(mapa);
        Celda celda = new Celda();

        for(int i=0; i<4; i++) {
            logica.seleccionar(celda);
        }

        assertEquals(logica.elJugadorGanoLaPartida(), true);
    }

    @Test
    public void test07siElContenidoEsUnaBombaYElJugadorYaGanoLaPartidaLaLogicaEstableceQueElJugadorGanaLaPartida(){
        Logica logica = new Logica(mapa);
        Celda celda = new Celda(new Bomba());
        logica.cambiar(new Victoria());

        logica.seleccionar(celda);
        assertEquals(logica.elJugadorGanoLaPartida(), true);
    }

    @Test
    public void test07siElContenidoEsVacioYElJugadorYaPerdioLaPartidaLaLogicaEstableceQueElJugadorPerdioLaPartida(){
        Logica logica = new Logica(mapa);
        Celda celda = new Celda();
        logica.cambiar(new Derrota());

        logica.seleccionar(celda);
        assertEquals(logica.elJugadorPerdioLaPartida(), true);
    }
}