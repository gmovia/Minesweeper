package Vista;

import Vista.VistaMapa;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// Menu principal. Juego y Salir
// Menu secundario. Dificultad
// Menu terciario. El juego en si mismo.

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VistaJuego vistaJuego = new VistaJuego(stage);
        stage.setTitle("Buscaminas");
        stage.setScene(vistaJuego.getScene());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}