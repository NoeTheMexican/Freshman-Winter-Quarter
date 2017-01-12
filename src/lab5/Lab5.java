package lab5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Lab5 extends Application{
    private Label label;

    public void start(Stage primaryStage) throws Exception{
        VBox root = new VBox();
        HBox buttons = new HBox();
        Pane lifeGrid = new Pane();
        lifeGrid.setPrefHeight(300);
        lifeGrid.setPrefWidth(300);
        LifeGrid grid = new LifeGrid(lifeGrid);
        grid.randomize();
        label = new Label("Alive: " + grid.countAliveCells()+"\n" + "Dead: "+ grid.countDeadCells());
        Button step = new Button("Step");
        Button randomize = new Button("Randomize");
        Button clear = new Button("Clear");
        Button play = new Button("Play");
        Button stop = new Button("Stop");
        step.setOnAction(new MyHandler());
        buttons.getChildren().addAll(step, randomize,clear, play, stop);
        root.getChildren().addAll(buttons);
        root.getChildren().addAll(lifeGrid);
        root.getChildren().add(label);
        primaryStage.setTitle("Lab 5: Life");
        primaryStage.setScene(new Scene(root, 290, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public class MyHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            
        }
    }

}
