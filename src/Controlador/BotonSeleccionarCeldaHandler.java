package Controlador;

import Modelo.Contenido.Contenido;
import Modelo.Juego.Juego;
import Modelo.Posicion.Posicion;
import Modelo.ObjetoMapa.ObjetoMapa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonSeleccionarCeldaHandler implements EventHandler<ActionEvent> {

    private Button boton;
    private Juego juego;
    private int i;
    private int j;
    private int requestWidth;
    private int requestHeight;

    public BotonSeleccionarCeldaHandler(Button boton, Juego juego, int i, int j, int requestWidth, int requestHeight){
        this.juego = juego;
        this.boton = boton;
        this.i = i;
        this.j = j;
        this.requestHeight = requestHeight;
        this.requestWidth = requestWidth;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Contenido objeto = juego.seleccionarCelda(new Posicion(i, j));
        ImageView view = new ImageView(new Image(objeto.obtenerImagen(), requestWidth, requestHeight, false, false));
        boton.setGraphic(view);
    }
}
