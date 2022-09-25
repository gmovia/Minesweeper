package Modelo.Celda;

import Modelo.Contenido.Contenido;
import Modelo.Contenido.Vacio;
import Modelo.Estado.NoVisible;
import Modelo.Estado.Visibilidad;
import Modelo.Estado.Visible;
import Modelo.Logica.Logica;
import Modelo.ModoDeJuego.Regla;
import Modelo.ObjetoMapa.ObjetoMapa;
import Modelo.Posicion.Posicion;
import Modelo.Vecinos.Vecinos;

public class Celda implements ObjetoMapa {

    private Contenido contenido;
    private Visibilidad visibilidad;

    public Celda(){
        this.visibilidad = new NoVisible();
        this.contenido = new Vacio();
    }

    public Celda(Contenido contenido){
        this.visibilidad = new NoVisible();
        this.contenido = contenido;
    }

    public void agregarVecino(Celda celda){
        contenido.agregar(celda);
    }

    public void cambiar(Visibilidad visibilidad){
        this.visibilidad = visibilidad;
    }

    public Contenido seleccionarme(Regla regla){
        regla.cambiarVisibilidad(this);
        return this.visibilidad.ver(contenido);
    }

    public Contenido obtenerContenido(){
        return this.contenido;
    }

    public int obtenerValor(){
        return this.contenido.obtenerValor();
    }
}
