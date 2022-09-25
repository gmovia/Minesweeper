package Modelo.Celda;

import Modelo.Celda.Celda;
import Modelo.Contenido.Bomba;
import Modelo.Contenido.Nulo;
import Modelo.Contenido.Vacio;
import Modelo.ModoDeJuego.Derrota;
import Modelo.ModoDeJuego.Desarrollo;
import Modelo.ModoDeJuego.Victoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CeldaTest {

    @Test
    public void test01dadoQueTengoUnaCeldaVaciaCuandoConsultoSuContenidoObtengoVacio(){
        Celda celda = new Celda();
        assertEquals(celda.obtenerContenido().getClass(), new Vacio().getClass());
    }
    @Test
    public void test02dadoQueTengoUnaCeldaQueContieneUnaBombaCuandoConsultoSuContenidoObtengoUnaBomba(){
        Celda celda = new Celda(new Bomba());
        assertEquals(celda.obtenerContenido().getClass(), new Bomba().getClass());
    }

    @Test
    public void test03dadoQueTengoUnaCeldaVaciaCuandoSeleccionoLaCeldaEnModoDesarrolloObtengoVacio(){
        Celda celda = new Celda();
        assertEquals(celda.seleccionarme(new Desarrollo()).getClass(), new Vacio().getClass());
    }

    @Test
    public void test04dadoQueTengoUnaCeldaConBombaCuandoSeleccionoLaCeldaEnModoDesarrolloObtengoBomba(){
        Celda celda = new Celda(new Bomba());
        assertEquals(celda.seleccionarme(new Desarrollo()).getClass(), new Bomba().getClass());
    }

    @Test
    public void test05dadoQueTengoUnaCeldaVaciaCuandoSeleccionoLaCeldaEnModoVictoriaObtengoNulo(){
        Celda celda = new Celda();
        assertEquals(celda.seleccionarme(new Victoria()).getClass(), new Nulo().getClass());
    }

    @Test
    public void test06dadoQueTengoUnaCeldaVaciaCuandoSeleccionoLaCeldaEnModoDerrotaObtengoNulo(){
        Celda celda = new Celda();
        assertEquals(celda.seleccionarme(new Derrota()).getClass(), new Nulo().getClass());
    }

    @Test
    public void test07dadoQueTengoUnaCeldaVaciaQueYaFueSeleccionadaEnModoDesarrolloCuandoSeleccionoLaCeldaEnModoVictoriaObtengoVacio(){
        Celda celda = new Celda();
        celda.seleccionarme(new Desarrollo());
        assertEquals(celda.seleccionarme(new Victoria()).getClass(), new Vacio().getClass());
    }

    @Test
    public void test08dadoQueTengoUnaCeldaConBombaQueYaFueSeleccionadaEnModoDesarrolloCuandoSeleccionoLaCeldaEnModoDerrotaObtengoBomba(){
        Celda celda = new Celda(new Bomba());
        celda.seleccionarme(new Desarrollo());
        assertEquals(celda.seleccionarme(new Derrota()).getClass(), new Bomba().getClass());
    }
}