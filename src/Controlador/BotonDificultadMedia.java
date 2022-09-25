package Controlador;

import Vista.VistaMapa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonDificultadMedia implements EventHandler<ActionEvent> {

    private Stage stage;

    public BotonDificultadMedia(Stage stage){
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        VistaMapa vistaMapa = new VistaMapa(12, 12, 40, 40);
        stage.setScene(vistaMapa.getScene());
    }
}
