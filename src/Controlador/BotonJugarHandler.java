package Controlador;

import Vista.VistaDificultad;
import Vista.VistaMapa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonJugarHandler implements EventHandler<ActionEvent> {

    private Stage stage;

    public BotonJugarHandler(Stage stage){
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        VistaDificultad vistaDificultad = new VistaDificultad(stage);
        stage.setScene(vistaDificultad.getScene());
    }
}
