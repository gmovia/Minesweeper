package Modelo.Vecinos;

import Modelo.Celda.Celda;

import java.util.ArrayList;

public class Vecinos {

    private ArrayList<Celda> vecinos;

    public Vecinos(){
        vecinos = new ArrayList<Celda>();
    }

    public void agregar(Celda celda){
        vecinos.add(celda);
    }

    public int tamaño(){
        return vecinos.size();
    }

    public int cantidadDeBombas(){
        int cantidadDeBombas = 0;
        for(Celda celda: vecinos){
            cantidadDeBombas += celda.obtenerValor();
        }
        return cantidadDeBombas;
    }
}
