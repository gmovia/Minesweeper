package Modelo.Asignador;

import Modelo.Celda.Celda;
import Modelo.Mapa.Mapa;
import Modelo.Posicion.Posicion;

public class Asignador{

    public void asignarVecinos(Mapa mapa){
        for(int i=0; i<mapa.getX(); i++){
            for(int j=0; j< mapa.getY(); j++){
                Posicion posicion = new Posicion(i, j);
                Celda celda = mapa.seleccionarCelda(posicion);
                this.agregarVecinosA(celda, mapa, posicion, i, j);
            }
        }
    }

    public void agregarVecinosA(Celda celda, Mapa mapa, Posicion posicion, int i, int j) {

        if(posicion.esIgualA(new Posicion(0, 0))) {
            this.agregarVecinosACeldaSuperiorIzquierda(celda, mapa, posicion, i, j);
        }

        else if(posicion.esIgualA(new Posicion(0, mapa.getY()-1))) {
            this.agregarVecinosACeldaSuperiorDerecha(celda, mapa, posicion, i, j);
        }

        else if(posicion.esIgualEnEjeXA(new Posicion(0, 0)) && posicion.obtenerPosicionY() > 0 && posicion.obtenerPosicionY() < mapa.getY()-1) {
            this.agregarVecinosACeldaDeExtremoSuperior(celda, mapa, posicion, i, j);
        }

        else if(posicion.esIgualA(new Posicion(mapa.getX()-1, 0))) {
            this.agregarVecinosACeldaInferiorIzquierda(celda, mapa, posicion, i, j);
        }

        else if(posicion.esIgualA(new Posicion(mapa.getX()-1, mapa.getY()-1))) {
            this.agregarVecinosACeldaInferiorDerecha(celda, mapa, posicion, i, j);
        }

        else if(posicion.esIgualEnEjeXA(new Posicion(mapa.getX()-1, 0)) && posicion.obtenerPosicionY() > 0 && posicion.obtenerPosicionY() < mapa.getY()-1) {
            this.agregarVecinosACeldaDeExtremoInferior(celda, mapa, posicion, i, j);
        }

        else if(posicion.esIgualEnEjeYA(new Posicion(0, 0)) && posicion.obtenerPosicionX() > 0 && posicion.obtenerPosicionX() < mapa.getX()-1){
            this.agregarVecinosACeldaDeExtremoIzquierdo(celda, mapa, posicion, i, j);
        }

        else if(posicion.esIgualEnEjeYA(new Posicion(0, mapa.getY()-1)) && posicion.obtenerPosicionX() > 0 && posicion.obtenerPosicionX() < mapa.getX()-1){
            this.agregarVecinosACeldaDeExtremoDerecho(celda, mapa, posicion, i, j);
        }

        else if (posicion.obtenerPosicionX() > 0 && posicion.obtenerPosicionX() < mapa.getX()-1 && posicion.obtenerPosicionY() > 0 && posicion.obtenerPosicionY() < mapa.getY()-1){
            this.agregarVecinosACeldaDeCuadricula(celda, mapa, posicion, i, j);
        }

    }


    public void agregarVecinosACeldaDeCuadricula(Celda celda, Mapa mapa, Posicion posicion, int i, int j){
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i+1, j)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i-1, j)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i+1, j+1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i-1, j+1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i, j+1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i+1, j-1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i-1, j-1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i, j-1)));
    }


    public void agregarVecinosACeldaInferiorIzquierda(Celda celda, Mapa mapa, Posicion posicion, int i, int j){
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i-1, 0)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i-1, 1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i, 1)));
    }

    public void agregarVecinosACeldaInferiorDerecha(Celda celda, Mapa mapa, Posicion posicion, int i, int j){
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i, j-1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i-1, j-1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i-1, j)));
    }

    public void agregarVecinosACeldaSuperiorIzquierda(Celda celda, Mapa mapa, Posicion posicion, int i, int j){
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(0, 1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(1, 0)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(1, 1)));
    }

    public void agregarVecinosACeldaSuperiorDerecha(Celda celda, Mapa mapa, Posicion posicion, int i, int j){
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(0, j-1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(1, j-1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(1, j)));
    }


    public void agregarVecinosACeldaDeExtremoSuperior(Celda celda, Mapa mapa, Posicion posicion, int i, int j){
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i+1, j)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i+1, j+1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i, j+1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i+1, j-1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i, j-1)));
    }

    public void agregarVecinosACeldaDeExtremoInferior(Celda celda, Mapa mapa, Posicion posicion, int i, int j){
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i-1, j)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i-1, j+1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i, j+1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i-1, j-1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i, j-1)));
    }

    public void agregarVecinosACeldaDeExtremoIzquierdo(Celda celda, Mapa mapa, Posicion posicion, int i, int j){
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i+1, j)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i-1, j)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i+1, j+1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i-1, j+1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i, j+1)));
    }

    public void agregarVecinosACeldaDeExtremoDerecho(Celda celda, Mapa mapa, Posicion posicion, int i, int j){
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i+1, j)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i-1, j)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i+1, j-1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i-1, j-1)));
        celda.agregarVecino(mapa.seleccionarCelda(new Posicion(i, j-1)));
    }

}
