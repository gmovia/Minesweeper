package Modelo.ModoDeJuego;

import Modelo.Celda.Celda;
import Modelo.Contenido.Contenido;
import Modelo.Estado.Visible;
import Modelo.Logica.Logica;
import Modelo.ObjetoMapa.ObjetoMapa;

public class Derrota implements Regla {

    @Override
    public Contenido seleccionarSegun(Celda celda, Logica logica){
        return celda.seleccionarme(this);
    }

    @Override
    public void cambiarVisibilidad(Celda celda){
    }

    @Override
    public boolean perdioLaPartida(){
        return true;
    }

    @Override
    public boolean ganoLaPartida(){
        return false;
    }
}
