package Modelo.Contenido;

import Modelo.Celda.Celda;
import Modelo.Logica.Logica;
import Modelo.ObjetoMapa.ObjetoMapa;

public interface Contenido extends ObjetoMapa {
    void cambiar(Logica logica);
    int obtenerValor();
    String obtenerImagen();
    void agregar(Celda celda);
}
