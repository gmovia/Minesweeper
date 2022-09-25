package Modelo.Mapa;

import Modelo.Asignador.Asignador;
import Modelo.Celda.Celda;
import Modelo.Fabricador.Fabricador;
import Modelo.Posicion.Posicion;

public class Mapa {

    private int dimensionX;
    private int dimensionY;
    private Celda[][] celdas;
    private Fabricador fabricador = new Fabricador();
    private Asignador asignador = new Asignador();

    public Mapa(int dimensionX, int dimensionY){
        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
        this.celdas = fabricador.fabricarCuadricula(dimensionX, dimensionY);
        this.asignador.asignarVecinos(this);
    }

    public void agregar(Celda celda, Posicion posicion){
        celdas[posicion.obtenerPosicionX()][posicion.obtenerPosicionY()] = celda;
    }

    public int getX(){ return this.dimensionX;}

    public int getY(){ return this.dimensionY;}

    public Celda seleccionarCelda(Posicion posicion){
        return celdas[posicion.obtenerPosicionX()][posicion.obtenerPosicionY()];
    }

    public boolean laCantidadDeCeldasVaciasEsIgualA(int cantidad){
        int cantidadDeBombas = 0;
        for(int i=0; i<dimensionX; i++){
            for(int j=0; j<dimensionY; j++){
                cantidadDeBombas += celdas[i][j].obtenerValor();
            }
        }
        return cantidad == (dimensionX*dimensionY - cantidadDeBombas);
    }
}
