package unit4.ui.demos;

import static javafx.application.Application.launch;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EventFiltersExample extends Application {

    private Circle setupCircle(){
        Circle circle = new Circle();                              //Make a Circle
        circle.setCenterX(300.0f);                                 //Set X position of the circle
        circle.setCenterY(135.0f);                                 //Set Y position of the circle
        circle.setRadius(25.0f);                                   //Set radius of the circle
        circle.setFill(Color.BROWN);                               //Set the color of the circle
        circle.setStrokeWidth(20);                                 //Set the stroke width of the circle
        return circle;
    }

    private Text setupText(){
        Text text = new Text("Click circle to change color");      //Set the text
        text.setFont(Font.font(null, FontWeight.BOLD, 15));     //Set the font of the text
        text.setFill(Color.CRIMSON);                                  //Set the color of the text
        text.setX(150);                                               //Set X position of the text
        text.setY(50);                                                //Set Y position of the text
        return text;
    }

    private EventHandler<MouseEvent> getMouseHandler(Circle circle){
        //Creating the mouse event handler
        return (event) -> {
            System.out.println("Hello World");
            circle.setFill(Color.DARKSLATEBLUE);
        };
    }

    private Scene setupScene(Circle circle, Text text){
        Group root = new Group(circle, text);                                    //Creating a Group object
        Scene scene = new Scene(root, 600, 300);                          //Creating a scene object
        scene.setFill(Color.LAVENDER);                                           //Setting the fill color to the scene
        return scene;
    }

    @Override
    public void start(Stage stage) {
        Text text = setupText();
        Circle circle = setupCircle();
        EventHandler<MouseEvent> eventHandler = getMouseHandler(circle);         //Creating the mouse event handler
        circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);           //Registering the event filter
        Scene scene = setupScene(circle, text);
        stage.setTitle("Event Filters Example");                                 //Setting title to the Stage
        stage.setScene(scene);                                                   //Adding scene to the stage
        stage.show();                                                            //Displaying the contents of the stage
    }
    public static void main(String args[]){
        launch(args);
    }
}


