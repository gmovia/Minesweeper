package Modelo.Mapa;

import Modelo.Celda.Celda;
import Modelo.Contenido.Bomba;
import Modelo.Contenido.Contenido;
import Modelo.Fabricador.Fabricador;
import Modelo.Posicion.Posicion;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MapaTest {

    @Test
    public void test01dadoQueHayVacioEnLaPosicion2x3DeUnMapaDe8x8CuandoConsultoLaPosicion2x3ObtengoVacio(){
        Mapa mapa = new Mapa(8, 8);
        Posicion posicion = new Posicion(2, 3);
        Celda celda = new Celda();
        Contenido contenido = celda.obtenerContenido();

        mapa.agregar(celda, posicion);
        Celda celdaSeleccionada = mapa.seleccionarCelda(posicion);
        assertEquals(contenido, celdaSeleccionada.obtenerContenido());
    }

    @Test
    public void test02dadoQueHayUnaBombaEnLaPosicion5x7DeUnMapaDe8x8CuandoConsultoLaPosicion5x7ObtengoUnaBomba(){
        Mapa mapa = new Mapa(8, 8);
        Posicion posicion = new Posicion(5, 7);
        Celda celda = new Celda(new Bomba());
        Contenido contenido = celda.obtenerContenido();

        mapa.agregar(celda, posicion);
        Celda celdaSeleccionada = mapa.seleccionarCelda(posicion);
        assertEquals(contenido, celdaSeleccionada.obtenerContenido());
    }
    
}