package com.jenkov.javafx.button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Shows a simple JavaFX Button - and prints a text when the button is clicked.
 */
public class ButtonExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button button = new Button();

        button.setText("Click me!");

        button.setOnAction((event) -> {
            System.out.println("Button clicked!");
        });


        VBox vbox = new VBox(button);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
