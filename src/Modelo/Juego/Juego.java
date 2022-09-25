package Modelo.Juego;

import Modelo.Celda.Celda;
import Modelo.Contenido.Contenido;
import Modelo.Logica.Logica;
import Modelo.Mapa.Mapa;
import Modelo.Posicion.Posicion;
import Modelo.ObjetoMapa.ObjetoMapa;

public class Juego {

    private Mapa mapa;
    private Logica logica;

    public Juego(int dimensionX, int dimensionY){
        this.mapa = new Mapa(dimensionX, dimensionY);
        this.logica = new Logica(this.mapa);
    }

    public Contenido seleccionarCelda(Posicion posicion){
        Celda celda = mapa.seleccionarCelda(posicion);
        return logica.seleccionar(celda);
    }

    public void agregar(Celda celda, Posicion posicion){
        mapa.agregar(celda, posicion);
    }

    public boolean elJugadorPerdioLaPartida(){
        return logica.elJugadorPerdioLaPartida();
    }

    public boolean elJugadorGanoLaPartida(){
        return logica.elJugadorGanoLaPartida();
    }
}
