package be.odisee.bodymassindex;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BodyMassIndexMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("BodyMassIndex.fxml"));
        primaryStage.setTitle("BodyMassIndex");
        primaryStage.setScene(new Scene(root, 600, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
