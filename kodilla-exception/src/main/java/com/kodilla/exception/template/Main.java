package com.kodilla.exception.template;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {launch(args);}

    private Parent createContent(){
        Pane root = new Pane();
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(createContent());
        primaryStage.setTitle("t");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

