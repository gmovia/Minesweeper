package Modelo.Estado;

import Modelo.Contenido.Contenido;
import Modelo.ObjetoMapa.ObjetoMapa;

public class Visible implements Visibilidad{

    @Override
    public Contenido ver(Contenido contenido){
        return contenido;
    }
}
