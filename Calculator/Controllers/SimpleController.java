package Calculator.Controllers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SimpleController {

    private HBox hbox;
    private VBox vbox;
    private ImageView imageview;
    private Image image;
    private Stage calcStage;
    private Scene calcScene;

    public SimpleController(Stage stage) {
        stage.close();
        calcStage = new Stage();
        startScene();
    }

    public HBox getExitAndTtitle() {

        hbox = new HBox();

        try {
            imageview = new ImageView(new Image(
                    new FileInputStream("C:/Users/zouro/Desktop/MyCode/Calculator/Calculator/images/1808051-200.png")));
        } catch (FileNotFoundException e) {
            System.out.println("Image not Found: Exit");
        }


        hbox.getChildren().addAll(imageview);

        Label title = new Label("Simple Calculator");
        title.setStyle(null);
        title.setStyle("-fx-text-fill: black;");
        title.setFont(new Font("Arial Rounded MT Bold", 20));

        return hbox;
    }

    public void startScene() {

        vbox = new VBox();

        vbox.getChildren().add(getExitAndTtitle());


        calcScene = new Scene(vbox, 350, 450);
        calcStage.setScene(calcScene);
        calcStage.setTitle("Calculator");
        calcStage.setResizable(false);

        calcStage.show();
    }

}
