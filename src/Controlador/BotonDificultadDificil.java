package Controlador;

import Vista.VistaMapa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonDificultadDificil implements EventHandler<ActionEvent> {

    private Stage stage;

    public BotonDificultadDificil(Stage stage){
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        VistaMapa vistaMapa = new VistaMapa(16, 16, 30, 30);
        stage.setScene(vistaMapa.getScene());
    }
}
