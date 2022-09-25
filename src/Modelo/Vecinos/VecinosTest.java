package Modelo.Vecinos;

import Modelo.Celda.Celda;
import Modelo.Contenido.Bomba;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VecinosTest {

    @Test
    public void test01cuandoInicializoVecinosNoTieneCeldas(){
        Vecinos vecinos = new Vecinos();
        assertEquals(vecinos.tamaño(), 0);
    }

    @Test
    public void test02cuandoInicializoVecinosSuCantidadDeBombasEs0(){
        Vecinos vecinos = new Vecinos();
        assertEquals(vecinos.cantidadDeBombas(), 0);
    }

    @Test
    public void test03cuandoAgregoUnaCeldaLaCantidadDeVecinosEs1(){
        Vecinos vecinos = new Vecinos();
        vecinos.agregar(new Celda());
        assertEquals(vecinos.tamaño(), 1);
    }

    @Test
    public void test04cuandoAgregoUnaCeldaConBombaLaCantidadDeBombasEs1(){
        Vecinos vecinos = new Vecinos();
        vecinos.agregar(new Celda(new Bomba()));
        assertEquals(vecinos.cantidadDeBombas(), 1);
    }


    @Test
    public void test04cuandoAgregoUnaCuadriculaDeCeldasCon2BombasLaCantidadDeBombasEs2(){
        Vecinos vecinos = new Vecinos();
        for(int i=0; i<7; i++){
            vecinos.agregar(new Celda());
        }

        vecinos.agregar(new Celda(new Bomba()));
        vecinos.agregar(new Celda(new Bomba()));

        assertEquals(vecinos.tamaño(), 9);
        assertEquals(vecinos.cantidadDeBombas(), 2);
    }
}