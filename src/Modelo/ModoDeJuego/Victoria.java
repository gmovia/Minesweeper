package Modelo.ModoDeJuego;

import Modelo.Celda.Celda;
import Modelo.Contenido.Contenido;
import Modelo.Logica.Logica;
import Modelo.ObjetoMapa.ObjetoMapa;

public class Victoria implements Regla {

    @Override
    public Contenido seleccionarSegun(Celda celda, Logica logica){
        return celda.seleccionarme(this);
    }

    @Override
    public void cambiarVisibilidad(Celda celda){}

    @Override
    public boolean perdioLaPartida(){ return false; }

    @Override
    public boolean ganoLaPartida(){ return true; }
}
