package Modelo.Contenido;

import Modelo.Celda.Celda;
import Modelo.Logica.Logica;
import Modelo.ModoDeJuego.Derrota;

public class Bomba implements Contenido{

    @Override
    public void cambiar(Logica logica){
        logica.cambiar(new Derrota());
    }

    @Override
    public void agregar(Celda celda){
    }

    public int obtenerValor(){
        return 1;
    }

    public String obtenerImagen(){
        return "./Imagenes/minado.png";
    }
}
