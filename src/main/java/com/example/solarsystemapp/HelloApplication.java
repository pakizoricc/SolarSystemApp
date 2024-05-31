package com.example.solarsystemapp;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // Create a Pane to hold the shapes
        Pane pane = new Pane();

        //Importing background picture
        FileInputStream bgpicture = new FileInputStream("d:\\galaxy_background.jpg");
        Image image = new Image(bgpicture);
        BackgroundImage bi = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background bg = new Background(bi);
        pane.setBackground(bg);

        // Create the Sun and planets
        Circle sun = new Circle(300, 300, 40);
        sun.setFill(Color.YELLOW);
        Circle planet = new Circle(10);
        planet.setFill(Color.BLUE);
        Circle venera = new Circle(10);
        venera.setFill(Color.BLUE);
        Circle mars = new Circle(10);
        mars.setFill(Color.BLUE);
        Circle earth = new Circle(10);
        earth.setFill(Color.BLUE);
        Circle jupyter = new Circle(10);
        jupyter.setFill(Color.BLUE);
        Circle saturn = new Circle(10);
        saturn.setFill(Color.BLUE);
        Circle uran = new Circle(10);
        uran.setFill(Color.BLUE);

        // Create an elliptical orbit path for the planet
        Ellipse orbit = new Ellipse(300, 300, 60, 60);
        orbit.setStroke(Color.BLACK);
        orbit.setFill(null);
        Ellipse orbit1 = new Ellipse(300, 300, 90, 90);
        orbit1.setStroke(Color.BLACK);
        orbit1.setFill(null);
        Ellipse orbit2 = new Ellipse(300, 300, 120, 120);
        orbit2.setStroke(Color.BLACK);
        orbit2.setFill(null);
        Ellipse orbit3 = new Ellipse(300, 300, 150, 150);
        orbit3.setStroke(Color.BLACK);
        orbit3.setFill(null);
        Ellipse orbit4 = new Ellipse(300, 300, 180, 180);
        orbit4.setStroke(Color.BLACK);
        orbit4.setFill(null);
        Ellipse orbit5 = new Ellipse(300, 300, 210, 210);
        orbit5.setStroke(Color.BLACK);
        orbit5.setFill(null);
        Ellipse orbit6 = new Ellipse(300, 300, 240, 240);
        orbit6.setStroke(Color.BLACK);
        orbit6.setFill(null);


        //Merkur
        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.seconds(4)); // Time taken for one orbit
        pathTransition.setPath(orbit);  //Set the path
        pathTransition.setNode(planet); // Set the node (planet)
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(PathTransition.INDEFINITE); // Repeat indefinitely
        pathTransition.setAutoReverse(false);

        //Venera
        PathTransition pathTransition1 = new PathTransition();
        pathTransition1.setDuration(Duration.seconds(4)); // Time taken for one orbit
        pathTransition1.setPath(orbit1);  //Set the path
        pathTransition1.setNode(venera); // Set the node (planet)
        pathTransition1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition1.setCycleCount(PathTransition.INDEFINITE); // Repeat indefinitely
        pathTransition1.setAutoReverse(false);

        //Mars
        PathTransition pathTransition2 = new PathTransition();
        pathTransition2.setDuration(Duration.seconds(4)); // Time taken for one orbit
        pathTransition2.setPath(orbit2);  //Set the path
        pathTransition2.setNode(mars); // Set the node (planet)
        pathTransition2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition2.setCycleCount(PathTransition.INDEFINITE); // Repeat indefinitely
        pathTransition2.setAutoReverse(false);

        //Zemlja
        PathTransition pathTransition3 = new PathTransition();
        pathTransition3.setDuration(Duration.seconds(4)); // Time taken for one orbit
        pathTransition3.setPath(orbit3);  //Set the path
        pathTransition3.setNode(earth); // Set the node (planet)
        pathTransition3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition3.setCycleCount(PathTransition.INDEFINITE); // Repeat indefinitely
        pathTransition3.setAutoReverse(false);

        //Jupiter
        PathTransition pathTransition4 = new PathTransition();
        pathTransition4.setDuration(Duration.seconds(4)); // Time taken for one orbit
        pathTransition4.setPath(orbit4);  //Set the path
        pathTransition4.setNode(jupyter); // Set the node (planet)
        pathTransition4.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition4.setCycleCount(PathTransition.INDEFINITE); // Repeat indefinitely
        pathTransition4.setAutoReverse(false);

        //Saturn
        PathTransition pathTransition5 = new PathTransition();
        pathTransition5.setDuration(Duration.seconds(4)); // Time taken for one orbit
        pathTransition5.setPath(orbit5);  //Set the path
        pathTransition5.setNode(saturn); // Set the node (planet)
        pathTransition5.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition5.setCycleCount(PathTransition.INDEFINITE); // Repeat indefinitely
        pathTransition5.setAutoReverse(false);

        //Uran
        PathTransition pathTransition6 = new PathTransition();
        pathTransition6.setDuration(Duration.seconds(4)); // Time taken for one orbit
        pathTransition6.setPath(orbit6);  //Set the path
        pathTransition6.setNode(uran); // Set the node (planet)
        pathTransition6.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition6.setCycleCount(PathTransition.INDEFINITE); // Repeat indefinitely
        pathTransition6.setAutoReverse(false);

        //Neptun
        PathTransition pathTransition7 = new PathTransition();
        pathTransition7.setDuration(Duration.seconds(4)); // Time taken for one orbit
        pathTransition7.setPath(orbit3);  //Set the path
        pathTransition7.setNode(earth); // Set the node (planet)
        pathTransition7.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition7.setCycleCount(PathTransition.INDEFINITE); // Repeat indefinitely
        pathTransition7.setAutoReverse(false);

        // Start the animation
        pathTransition.play();
        pathTransition1.play();
        pathTransition2.play();
        pathTransition3.play();
        pathTransition4.play();
        pathTransition5.play();
        pathTransition6.play();
        pathTransition7.play();

        // Add shapes to the pane
        pane.getChildren().addAll(orbit, sun, planet, orbit1, venera, orbit2, mars, orbit3, earth,
                orbit4, jupyter, orbit5, saturn, orbit6, uran);

        // Create a Scene and place it in the stage
        Scene scene = new Scene(pane, 600, 600);
        stage.setTitle("Suncev sistem");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}