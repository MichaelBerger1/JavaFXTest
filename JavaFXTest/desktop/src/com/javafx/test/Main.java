package com.javafx.test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane root = new StackPane();

        Scene frame = new Scene(root);
        primaryStage.isResizable();
        primaryStage.setTitle("Bank Business");
        primaryStage.setScene(frame);
        primaryStage.centerOnScreen();
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}