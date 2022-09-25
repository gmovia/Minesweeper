package Vista;
import Controlador.BotonSeleccionarCeldaHandler;
import Modelo.Juego.Juego;
import Modelo.Posicion.Posicion;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;

import javax.swing.*;

public class VistaMapa {

    private GridPane tablero;
    private Juego juego;
    private int celdasX;
    private int celdasY;
    private int requestWidth;
    private int requestHeight;

    public VistaMapa(int celdasX, int celdasY, int requestWidth, int requestHeight){
        this.celdasX = celdasX;
        this.celdasY = celdasY;
        this.requestWidth = requestWidth;
        this.requestHeight = requestHeight;

        tablero = new GridPane();
        juego = new Juego(celdasX, celdasY);
        tablero.setHgap(0);
        tablero.setVgap(0);
    }

    public Scene getScene(){
        for(int i=0; i<celdasX; i++){
            for(int j=0; j<celdasY; j++){
                Button boton = new Button();
                boton.setPrefSize(requestWidth, requestHeight);
                boton.setOnAction(new BotonSeleccionarCeldaHandler(boton, juego, i, j, requestWidth, requestHeight));
                boton.setGraphic(new ImageView(new Image("./Imagenes/0.png", requestWidth, requestHeight, false, false)));
                tablero.add(boton, j, i);
            }
        }
        return new Scene(tablero);
    }
}
