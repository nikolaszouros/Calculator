package Calculator.Controllers;

import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import Calculator.Views.OptionScreen;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/*
 * This controller is called from the Main
 * It initializes a window based on the choise of the user
 * Each window (simple,sci,conv), is costumized in each View file 
 */

public class OptionScreenController {

    @SuppressWarnings("unused")
    private Stage primaryStage;
    private Scene scene;
    private Pane layout;
    private static Image image;
    private HBox box;
    private VBox container;

    public OptionScreenController(Stage primaryStage) {
        this.primaryStage = primaryStage;
        initializeOptionScreen(primaryStage);
    }

    public void initializeOptionScreen(Stage primaryStage) {
        layout = new StackPane();
        scene = new Scene(layout, 350, 450);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);

        Label label = new Label("Pick your Calculator");
        label.setStyle("-fx-text-fill: black;");
        label.setFont(new Font("Arial Rounded MT Bold", 20));

        container = new VBox();
        container.setSpacing(50);
        container.setAlignment(Pos.CENTER);
        container.setPrefWidth(Region.USE_COMPUTED_SIZE);
        // container.setStyle("-fx-border-color: red; -fx-border-width: 2;
        // -fx-border-radius: 5;");
        container.getChildren().addAll(label);

        box = OptionScreen.getOption("1", getSimpleCalcImage(), "Calculator", primaryStage);
        container.getChildren().addAll(box);

        box = OptionScreen.getOption("2", getScientificCalcImage(), "Scientific Calculator", primaryStage);
        container.getChildren().addAll(box);

        box = OptionScreen.getOption("3", getConverterImage(), "Converter", primaryStage);
        container.getChildren().addAll(box);

        layout.getChildren().addAll(container);
    }

    public static ImageView getSimpleCalcImage() {
        try {
            image = new Image(
                    new FileInputStream("C:/Users/zouro/Desktop/MyCode/Calculator/Calculator/images/simple_calc.jpg"));
        } catch (FileNotFoundException e) {
            System.out.println("Image not Found: Simple");
        }
        return new ImageView(image);
    }

    public static ImageView getScientificCalcImage() {
        try {
            image = new Image(
                    new FileInputStream(
                            "C:/Users/zouro/Desktop/MyCode/Calculator/Calculator/images/scientific_calc-removebg-preview.png"));
        } catch (FileNotFoundException e) {
            System.out.println("Image not Found: Sci");
        }
        return new ImageView(image);
    }

    public static ImageView getConverterImage() {
        try {
            image = new Image(new FileInputStream(
                    "C:/Users/zouro/Desktop/MyCode/Calculator/Calculator/images/converter-removebg-preview.png"));
        } catch (FileNotFoundException e) {
            System.out.println("Image not Found: Conv");
        }
        return new ImageView(image);
    }
}