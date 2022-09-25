package Modelo.Contenido;

import Modelo.Celda.Celda;
import Modelo.Logica.Logica;
import Modelo.ModoDeJuego.Derrota;

public class Nulo implements Contenido{

    @Override
    public void cambiar(Logica logica){
    }

    @Override
    public void agregar(Celda celda){
    }

    public int obtenerValor(){
        return 0;
    }

    public String obtenerImagen(){
        return "./Imagenes/0.png";
    }
}
