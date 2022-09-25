package Controlador;

import Vista.VistaDificultad;
import Vista.VistaMapa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonDificultadFacil implements EventHandler<ActionEvent> {

    private Stage stage;

    public BotonDificultadFacil(Stage stage){
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        VistaMapa vistaMapa = new VistaMapa(8, 8, 50, 50);
        stage.setScene(vistaMapa.getScene());
    }
}
