package Controlador;

import Modelo.Contenido.Contenido;
import Modelo.Posicion.Posicion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonSalirHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        System.exit(0);
    }
}

