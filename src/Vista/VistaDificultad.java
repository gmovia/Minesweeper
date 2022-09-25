package Vista;

import Controlador.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class VistaDificultad {

    private Stage stage;

    public VistaDificultad(Stage stage){
        this.stage = stage;
    }

    public Scene getScene(){
        VBox root = new VBox();

        Button botonFacil = new Button();
        botonFacil.setPrefSize(125, 50);
        botonFacil.setOnAction(new BotonDificultadFacil(stage));
        botonFacil.setText("Facil");

        Button botonMedia = new Button();
        botonMedia.setPrefSize(125, 50);
        botonMedia.setOnAction(new BotonDificultadMedia(stage));
        botonMedia.setText("Media");

        Button botonDificil = new Button();
        botonDificil.setPrefSize(125, 50);
        botonDificil.setOnAction(new BotonDificultadDificil(stage));
        botonDificil.setText("Dificil");

        root.getChildren().addAll(botonFacil, botonMedia, botonDificil);
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
