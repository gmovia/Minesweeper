package Vista;

import Controlador.BotonJugarHandler;
import Controlador.BotonSalirHandler;
import com.google.common.collect.Table;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.*;

public class VistaJuego {

    private Stage stage;

    public VistaJuego(Stage stage){
        this.stage = stage;
    }


    public Scene getScene(){
        VBox root = new VBox();

        Button botonJugar = new Button();
        botonJugar.setOnAction(new BotonJugarHandler(stage));
        botonJugar.setPrefSize(125, 50);
        //botonJugar.setGraphic(new ImageView(new Image("./Imagenes/fondoBoton.jpg", 125, 50, true, true)));
        botonJugar.setText("Jugar");

        Button botonSalir = new Button();
        botonSalir.setOnAction(new BotonSalirHandler());
        botonSalir.setPrefSize(125, 50);
        botonSalir.setText("Salir");
        //botonJugar.setGraphic(new ImageView(new Image("./Imagenes/fondoBoton.jpg", 125, 50, false, false)));

        root.getChildren().addAll(botonJugar, botonSalir);
        root.setSpacing(30);
        root.setAlignment(Pos.CENTER);
        root.setBackground(new Background(new BackgroundImage(new Image("./Imagenes/fondoMenuJuego.png"),
                BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT)));

        return new Scene(root, 500, 400);
    }
}
