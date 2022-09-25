package Modelo.ModoDeJuego;

import Modelo.Celda.Celda;
import Modelo.Contenido.Contenido;
import Modelo.Estado.Visible;
import Modelo.Logica.Logica;
import Modelo.ObjetoMapa.ObjetoMapa;

public class Desarrollo implements Regla {

    @Override
    public Contenido seleccionarSegun(Celda celda, Logica logica) {
        Contenido contenido = celda.seleccionarme(this);
        contenido.cambiar(logica);
        return contenido;
    }

    @Override
    public void cambiarVisibilidad(Celda celda){
        celda.cambiar(new Visible());
    }

    @Override
    public boolean perdioLaPartida(){
        return false;
    }

    @Override
    public boolean ganoLaPartida(){
        return false;
    }
}
