package com.SA4E.UEB1.T2.Server;

import com.SA4E.UEB1.Config;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Main extends Application {
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
        }

        Scene scene = new Scene(gp, num*(20*2+5), num*(20*2+5));
        stage.setTitle("Fireflies (on gRPC) !");
        stage.setScene(scene);
        stage.show();

    }

    public static void update(int posX, int posY, double phase){
        values[posX][posY] = phase;

        Platform.runLater(() -> {
            circles[posX][posY].setFill(Color.rgb(235, 180, 50, Math.max(0, Math.sin(phase))));
        });

    }

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                Server server = ServerBuilder
                        .forPort(8999)
                        .addService(new FirelfyCommunicationImpl())
                        .build();

                server.start();
                System.out.println("Server started at " + server.getPort());
                server.awaitTermination();
            } catch (Exception ignore) {}
        });

        t.start();
        launch();
        t.interrupt();
    }
}