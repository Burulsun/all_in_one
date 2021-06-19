package DigitalAlarmClock;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Clock extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Clock.fxml"));
        primaryStage.setTitle("Digital Alarm Clock");
        primaryStage.setScene(new Scene(root, 739, 389));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}