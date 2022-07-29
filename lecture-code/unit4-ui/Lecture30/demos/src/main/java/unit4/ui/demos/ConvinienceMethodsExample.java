package unit4.ui.demos;

import javafx.animation.PathTransition;
import javafx.application.Application;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

import javafx.scene.shape.Circle;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;


public class ConvinienceMethodsExample extends Application {
    private Circle setupCircle(){
        Circle circle = new Circle();         //Make a Circle
        circle.setCenterX(300.0f);            //Set X position of circle
        circle.setCenterY(135.0f);            //Set Y position of circle
        circle.setRadius(25.0f);              //Set radius of circle
        circle.setFill(Color.BROWN);          //Set color of circle
        circle.setStrokeWidth(20);            //Set stroke width of circle
        return circle;
    }

    private Path setupPath(){
        Path path = new Path();                         //Make a Path
        MoveTo moveTo = new MoveTo(208, 71);     //Moving to the staring point
        LineTo line1 = new LineTo(421, 161);     //Creating 1st line
        LineTo line2 = new LineTo(226,232);      //Creating 2nd line
        LineTo line3 = new LineTo(332,52);       //Creating 3rd line
        LineTo line4 = new LineTo(369, 250);     //Creating 4th line
        LineTo line5 = new LineTo(208, 71);      //Creating 5th line
        path.getElements().add(moveTo);                 //Adding all elements to path
        path.getElements().addAll(line1, line2, line3, line4, line5);
        return path;
    }

    private PathTransition setupPathTransition(Circle circle, Path path){
        PathTransition pathTransition = new PathTransition();        //Make the path transition
        pathTransition.setDuration(Duration.millis(1000));        //Set duration of transition
        pathTransition.setNode(circle);                              //Set node for transition
        pathTransition.setPath(path);                                //Set path for transition
        pathTransition.setOrientation( PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT); //Set orientation of path
        pathTransition.setCycleCount(50);                           //Set cycle count for transition
        pathTransition.setAutoReverse(false);                       //Set auto reverse to true
        return pathTransition;
    }

    private Button setupButton(String text, int x, int y){
        Button playButton = new Button(text);
        playButton.setLayoutX(x);
        playButton.setLayoutY(y);
        return playButton;
    }

    private void setupCircleHandler(Circle circle){
        circle.setOnMouseClicked ((event) -> {
            System.out.println("Hello World");
            circle.setFill(Color.DARKSLATEBLUE);
        });
    }

    private void setupPlayButtonHandler(Button playButton, PathTransition pathTransition){
        playButton.setOnMouseClicked( (event) -> {
                System.out.println("Hello World");
                pathTransition.play();
        });
    }

    private void setupStopButtonHandler(Button stopButton, PathTransition pathTransition){
        stopButton.setOnMouseClicked( (event) -> {
                System.out.println("Hello World");
                pathTransition.stop();
        });
    }

    private Scene setupScene(Node... nodes){
        //Creating a Group object
        Group root = new Group(nodes);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);
        scene.setFill(Color.LAVENDER);
        return scene;
    }



    @Override
    public void start(Stage stage) {
        Circle circle = setupCircle();
        setupCircleHandler(circle);
        Path path = setupPath();
        PathTransition pathTransition = setupPathTransition(circle, path);
        Button playButton = setupButton("Play",300,250);        //Create play button
        setupPlayButtonHandler(playButton, pathTransition);
        Button stopButton = setupButton("Stop",250,250 );       //Create stop button
        setupStopButtonHandler(stopButton, pathTransition);
        Scene scene = setupScene(circle, playButton, stopButton);
        stage.setTitle("Convenience Methods Example");                      //Set title to the Stage
        stage.setScene(scene);                                              //Add scene to the stage
        stage.show();                                                       //show GUI
    }
    public static void main(String args[]){
        launch(args);
    }
}
