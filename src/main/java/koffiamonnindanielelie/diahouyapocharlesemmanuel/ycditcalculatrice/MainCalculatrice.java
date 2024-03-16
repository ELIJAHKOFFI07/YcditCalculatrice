package koffiamonnindanielelie.diahouyapocharlesemmanuel.ycditcalculatrice;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MainCalculatrice extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainCalculatrice.class.getResource("calculette.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 390);

        stage.setTitle("calculette!");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}