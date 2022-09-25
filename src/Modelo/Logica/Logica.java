package Modelo.Logica;

import Modelo.Celda.Celda;
import Modelo.Contenido.Contenido;
import Modelo.Mapa.Mapa;
import Modelo.ModoDeJuego.Desarrollo;
import Modelo.ModoDeJuego.Regla;
import Modelo.ObjetoMapa.ObjetoMapa;

public class Logica {

    Mapa mapa;
    Regla regla;
    int celdasVacias = 0;

    public Logica(Mapa mapa){
        this.mapa = mapa;
        regla = new Desarrollo();
    }

    public boolean adivineTodasLasCeldasVacias(){
        celdasVacias++;
        return mapa.laCantidadDeCeldasVaciasEsIgualA(celdasVacias);
    }

    public Contenido seleccionar(Celda celda){
        return regla.seleccionarSegun(celda, this);
    }

    public void cambiar(Regla regla){
        this.regla = regla;
    }

    public boolean elJugadorGanoLaPartida(){
        return regla.ganoLaPartida();
    }

    public boolean elJugadorPerdioLaPartida(){
        return regla.perdioLaPartida();
    }
}
