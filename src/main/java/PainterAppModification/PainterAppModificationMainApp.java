package PainterAppModification;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PainterAppModificationMainApp extends Application {

    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PainterAppModification.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setTitle("Painter App Modification");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
