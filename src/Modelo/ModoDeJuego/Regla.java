package Modelo.ModoDeJuego;

import Modelo.Celda.Celda;
import Modelo.Contenido.Contenido;
import Modelo.Logica.Logica;
import Modelo.ObjetoMapa.ObjetoMapa;

public interface Regla {
    public Contenido seleccionarSegun(Celda celda, Logica logica);
    public void cambiarVisibilidad(Celda celda);
    public boolean perdioLaPartida();
    public boolean ganoLaPartida();
}
