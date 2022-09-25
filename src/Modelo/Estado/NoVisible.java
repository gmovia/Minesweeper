package Modelo.Estado;

import Modelo.Celda.Celda;
import Modelo.Contenido.Contenido;
import Modelo.Contenido.Nulo;
import Modelo.ObjetoMapa.ObjetoMapa;

public class NoVisible implements Visibilidad{

    @Override
    public Contenido ver(Contenido contenido){
        return new Nulo();
    }
}
