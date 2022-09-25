package Modelo.Fabricador;

import Modelo.Celda.Celda;
import Modelo.Contenido.Bomba;

import java.util.Random;

public class Fabricador {

    public Celda[][] fabricarCuadricula(int dimensionX, int dimensionY){
        Celda[][] celdas = new Celda[dimensionX][dimensionY];
        Random generador = new Random();
        for(int i = 0; i < dimensionX; i++){
            for(int j = 0; j < dimensionY; j++){
                if(generador.nextInt(6) == 1){
                    celdas[i][j] = new Celda(new Bomba());
                }
                else{
                    celdas[i][j] = new Celda();
                }
            }
        }
        return celdas;
    }
}
