package Modelo.Contenido;

import Modelo.Celda.Celda;
import Modelo.Logica.Logica;
import Modelo.ModoDeJuego.Victoria;
import Modelo.Vecinos.Vecinos;

import java.util.HashMap;
import java.util.Map;

public class Vacio implements Contenido{

    private Vecinos vecinos;
    private Map<Integer, String> imagenes;

    public Vacio(){
        this.vecinos = new Vecinos();
        this.imagenes = new HashMap<Integer, String>();
        this.imagenes.put(0, "./Imagenes/celdaVacia.png");
        this.imagenes.put(1, "./Imagenes/1.png");
        this.imagenes.put(2, "./Imagenes/2.png");
        this.imagenes.put(3, "./Imagenes/3.png");
        this.imagenes.put(4, "./Imagenes/4.png");
        this.imagenes.put(5, "./Imagenes/5.png");
        this.imagenes.put(6, "./Imagenes/6.png" );
        this.imagenes.put(7, "./Imagenes/7.png");
        this.imagenes.put(8, "./Imagenes/8.png" );
    }

    public void agregar(Celda celda){
        this.vecinos.agregar(celda);
    }

    @Override
    public void cambiar(Logica logica) {
        if (logica.adivineTodasLasCeldasVacias()) {
            logica.cambiar(new Victoria());
        }
    }

    public int obtenerValor(){
        return 0;
    }

    public String obtenerImagen(){
        return this.imagenes.get(vecinos.cantidadDeBombas());
    }
}
