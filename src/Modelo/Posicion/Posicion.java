package Modelo.Posicion;

public class Posicion {

    private int posicionX;
    private int posicionY;

    public Posicion(int x, int y){
        this.posicionX = x;
        this.posicionY = y;
    }

    public int obtenerPosicionX(){
        return this.posicionX;
    }

    public int obtenerPosicionY(){
        return this.posicionY;
    }

    public boolean esIgualEnEjeXA(Posicion otraPosicion){
        return this.posicionX == otraPosicion.obtenerPosicionX();
    }

    public boolean esIgualEnEjeYA(Posicion otraPosicion){
        return this.posicionY == otraPosicion.obtenerPosicionY();
    }

    public boolean esIgualA(Posicion otraPosicion){
        return this.esIgualEnEjeXA(otraPosicion) && this.esIgualEnEjeYA(otraPosicion);
    }
}
