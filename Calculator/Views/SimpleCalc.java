package Calculator.Views;

import java.io.FileInputStream;
import java.io.InputStream;

import javafx.geometry.Pos;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SimpleCalc {

    private static TextField textfield;
    private static VBox vbox;
    private static HBox hbox;
    private static Circle circle;
    private static Rectangle rect;
    private static GridPane grid;

    public SimpleCalc() {

    }

    public static GridPane getCircleButtons() {

        grid = new GridPane();
        grid.setHgap(5);
        grid.setVgap(5);

        circle = new Circle(30);
        //circle.setFill(new ImagePattern(new Image(FileInputStream())));
        grid.add(circle,0,0);

        circle = new Circle(30);
        //circle.setFill(new ImagePattern(new Image(FileInputStream())));
        grid.add(circle,1,0);

        circle = new Circle(30);
        //circle.setFill(new ImagePattern(new Image(FileInputStream())));
        grid.add(circle,2,0);


        circle = new Circle(30);
        //circle.setFill(new ImagePattern(new Image(FileInputStream())));
        grid.add(circle,0,1);

        circle = new Circle(30);
        //circle.setFill(new ImagePattern(new Image(FileInputStream())));
        grid.add(circle,1,1);

        circle = new Circle(30);
        //circle.setFill(new ImagePattern(new Image(FileInputStream())));
        grid.add(circle,2,1);


        circle = new Circle(30);
        //circle.setFill(new ImagePattern(new Image(FileInputStream())));
        grid.add(circle,0,2);

        circle = new Circle(30);
        //circle.setFill(new ImagePattern(new Image(FileInputStream())));
        grid.add(circle,1,2);

        circle = new Circle(30);
        //circle.setFill(new ImagePattern(new Image(FileInputStream())));
        grid.add(circle,2,2);


        circle = new Circle(30);
        //circle.setFill(new ImagePattern(new Image(FileInputStream())));
        grid.add(circle,0,3);

        circle = new Circle(30);
        //circle.setFill(new ImagePattern(new Image(FileInputStream())));
        grid.add(circle,1,3);

        circle = new Circle(30);
        //circle.setFill(new ImagePattern(new Image(FileInputStream())));
        grid.add(circle,2,3);
       

        return grid;
    }

    public static VBox getOvalButtons() {

        vbox = new VBox();
        vbox.setSpacing(5);

        rect = new Rectangle(125,60);
        rect.setArcWidth(30);
        rect.setArcHeight(30);
        //circle.setFill(new ImagePattern(new Image(FileInputStream())));
        vbox.getChildren().add(rect);

        rect = new Rectangle(125,60);
        rect.setArcWidth(30);
        rect.setArcHeight(30);
        //circle.setFill(new ImagePattern(new Image(FileInputStream())));
        vbox.getChildren().add(rect);

        rect = new Rectangle(125,60);
        rect.setArcWidth(30);
        rect.setArcHeight(30);
        //circle.setFill(new ImagePattern(new Image(FileInputStream())));
        vbox.getChildren().add(rect);


        rect = new Rectangle(125,60);
        rect.setArcWidth(30);
        rect.setArcHeight(30);
        //circle.setFill(new ImagePattern(new Image(FileInputStream())));
        vbox.getChildren().add(rect);


        return vbox;
    }

    public VBox alignCirclesAndOvals() {


        return vbox;
    }

    public static TextField getResultField() {

        textfield = new TextField();
        textfield.setEditable(false);
        textfield.setAlignment(Pos.BOTTOM_RIGHT);
        textfield.setFont(new Font("Digital-7",40));
        textfield.setMinSize(330, 125);
        textfield.setMaxSize(330, 125);
        //textfield.setStyle("-fx-border-color: blue; -fx-border-width: 3; -fx-border-style: dashed;");
        return textfield;

    }

    @SuppressWarnings("unused")
    public static HBox getChoiceBoxAndTtitle(Stage stage) {

        hbox = new HBox();
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER_LEFT);

        ChoiceBox<String> choicebox = new ChoiceBox<String>();
        choicebox.getItems().addAll("Simple Clculator", "Scientific Calculator", "Converter");
        choicebox.setValue("Pick a calculator");

        choicebox.setOnAction(e -> {
            String selected = choicebox.getValue();
            switch (selected) {
                case "Simple Clculator":
                    break;

                case "Scientific Calculator":
                    System.out.println("Change to Sci");
                    // new SciController(stage);
                    break;

                case "Converter":
                    System.out.println("Change to Conv");
                    // new ConvController(stage);
                    break;

            }
        });

        hbox.getChildren().add(choicebox);


        Label title = new Label("Simple Calculator");
        title.setStyle("-fx-text-fill: black;");
        title.setFont(new Font("Arial Rounded MT Bold", 15));
        hbox.getChildren().add(title);


        hbox.setMaxWidth(344);
        hbox.setMinWidth(344);

        return hbox;
    }

}
