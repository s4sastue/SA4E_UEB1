package com.SA4E.UEB1.T1;

import com.SA4E.UEB1.Config;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import static java.lang.Thread.sleep;


public class FireflyEnvironment extends Application {
    static double[][] values;
    static Circle[][] circles;

    @Override
    public void start(Stage stage){
        int num = Config.NUM_OF_ROWS;
        values = new double[num][num];

        GridPane gp = new GridPane();
        gp.setStyle("-fx-background-color: #000000;");
        gp.setHgap(5);
        gp.setVgap(5);

        circles = new Circle[num][num];

        int posX, posY;
        for(int i = 0; i<(num*num); i++){
            Circle c = new Circle();
            c.setRadius(20);

            posX = i%num;
            posY = i/num;

            circles[posX][posY] = c;
            gp.add(c, posX, posY);

            new Firefly(posX, posY).start();
        }

        Scene scene = new Scene(gp, num*(20*2+5), num*(20*2+5));
        stage.setTitle("Fireflies!");
        stage.setScene(scene);
        stage.show();

    }

    public static void update(int posX, int posY, double phase){
        values[posX][posY] = phase;

        Platform.runLater(() -> {
            circles[posX][posY].setFill(Color.rgb(235, 180, 50, Math.max(0, Math.sin(phase))));
        });

    }

    public static void main(String[] args) throws InterruptedException {
        launch();
    }
}