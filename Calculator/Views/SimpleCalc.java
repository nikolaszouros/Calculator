package Calculator.Views;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SimpleCalc {

    private static TextField textfield;
    private static VBox vbox;
    private static HBox hbox;
    private static Label label;
    private static Circle circle;
    private static Rectangle rect;
    private static GridPane grid;
    private static StackPane pane;

    public SimpleCalc() {

    }

    public static GridPane getCircleButtons() {

        grid = new GridPane();
        grid.setHgap(8);
        grid.setVgap(5);

        circle = new Circle(27);
        circle.setFill(Color.web("#007ea7"));
        grid.add(circle, 0, 0);
        label = new Label("(");
        label.setFont(new Font(20));
        grid.add(label, 0, 0);
        GridPane.setHalignment(label, HPos.CENTER); 
        GridPane.setValignment(label, VPos.CENTER); 

        circle = new Circle(27);
        circle.setFill(Color.web("#007ea7"));
        grid.add(circle, 1, 0);
        label = new Label(")");
        label.setFont(new Font(20));
        grid.add(label, 1, 0);
        GridPane.setHalignment(label, HPos.CENTER); 
        GridPane.setValignment(label, VPos.CENTER); 

        circle = new Circle(27);
        circle.setFill(Color.web("#007ea7"));
        grid.add(circle, 2, 0);
        label = new Label("-x");
        label.setFont(new Font(20));
        grid.add(label, 2, 0);
        GridPane.setHalignment(label, HPos.CENTER); 
        GridPane.setValignment(label, VPos.CENTER); 

        circle = new Circle(27);
        circle.setFill(Color.web("#007ea7"));
        grid.add(circle, 0, 1);
        label = new Label("7");
        label.setFont(new Font(20));
        grid.add(label, 0, 1);
        GridPane.setHalignment(label, HPos.CENTER); 
        GridPane.setValignment(label, VPos.CENTER); 

        circle = new Circle(27);
        circle.setFill(Color.web("#007ea7"));
        grid.add(circle, 1, 1);
        label = new Label("8");
        label.setFont(new Font(20));
        grid.add(label, 1, 1);
        GridPane.setHalignment(label, HPos.CENTER); 
        GridPane.setValignment(label, VPos.CENTER); 

        circle = new Circle(27);
        circle.setFill(Color.web("#007ea7"));
        grid.add(circle, 2, 1);
        label = new Label("9");
        label.setFont(new Font(20));
        grid.add(label, 2, 1);
        GridPane.setHalignment(label, HPos.CENTER); 
        GridPane.setValignment(label, VPos.CENTER); 

        circle = new Circle(27);
        circle.setFill(Color.web("#007ea7"));
        grid.add(circle, 0, 2);
        label = new Label("4");
        label.setFont(new Font(20));
        grid.add(label, 0, 2);
        GridPane.setHalignment(label, HPos.CENTER); 
        GridPane.setValignment(label, VPos.CENTER); 

        circle = new Circle(27);
        circle.setFill(Color.web("#007ea7"));
        grid.add(circle, 1, 2);
        label = new Label("5");
        label.setFont(new Font(20));
        grid.add(label, 1, 2);
        GridPane.setHalignment(label, HPos.CENTER); 
        GridPane.setValignment(label, VPos.CENTER); 

        circle = new Circle(27);
        circle.setFill(Color.web("#007ea7"));
        grid.add(circle, 2, 2);
        label = new Label("6");
        label.setFont(new Font(20));
        grid.add(label, 2, 2);
        GridPane.setHalignment(label, HPos.CENTER); 
        GridPane.setValignment(label, VPos.CENTER); 

        circle = new Circle(27);
        circle.setFill(Color.web("#007ea7"));
        grid.add(circle, 0, 3);
        label = new Label("1");
        label.setFont(new Font(20));
        grid.add(label, 0, 3);
        GridPane.setHalignment(label, HPos.CENTER); 
        GridPane.setValignment(label, VPos.CENTER); 

        circle = new Circle(27);
        circle.setFill(Color.web("#007ea7"));
        grid.add(circle, 1, 3);
        label = new Label("2");
        label.setFont(new Font(20));
        grid.add(label, 1, 3);
        GridPane.setHalignment(label, HPos.CENTER); 
        GridPane.setValignment(label, VPos.CENTER); 

        circle = new Circle(27);
        circle.setFill(Color.web("#007ea7"));
        grid.add(circle, 2, 3);
        label = new Label("3");
        label.setFont(new Font(20));
        grid.add(label, 2, 3);
        GridPane.setHalignment(label, HPos.CENTER); 
        GridPane.setValignment(label, VPos.CENTER); 

        circle = new Circle(27);
        circle.setFill(Color.web("#007ea7"));
        grid.add(circle, 0, 4);
        label = new Label(".");
        label.setFont(new Font(20));
        grid.add(label, 0, 4);
        GridPane.setHalignment(label, HPos.CENTER); 
        GridPane.setValignment(label, VPos.CENTER); 

        circle = new Circle(27);
        circle.setFill(Color.web("#007ea7"));
        grid.add(circle, 1, 4);
        label = new Label("0");
        label.setFont(new Font(20));
        grid.add(label, 1, 4);
        GridPane.setHalignment(label, HPos.CENTER); 
        GridPane.setValignment(label, VPos.CENTER); 

        circle = new Circle(27);
        circle.setFill(Color.web("#007ea7"));

        grid.add(circle, 2, 4);
        label = new Label("=");
        label.setFont(new Font(20));
        grid.add(label, 2, 4);
        GridPane.setHalignment(label, HPos.CENTER); 
        GridPane.setValignment(label, VPos.CENTER); 

        return grid;
    }

    public static VBox getOvalButtons() {

        vbox = new VBox();
        vbox.setSpacing(5);

        pane = new StackPane();
        rect = new Rectangle(120, 54);
        rect.setArcWidth(30);
        rect.setArcHeight(30);
        pane.getChildren().add(rect);
        label = new Label("CLEAR");
        label.setFont(new Font(20));
        pane.getChildren().add(label);
        vbox.getChildren().add(pane);


        pane = new StackPane();
        rect = new Rectangle(120, 54);
        rect.setArcWidth(30);
        rect.setArcHeight(30);
        pane.getChildren().add(rect);
        label = new Label("+");
        label.setFont(new Font(30));
        pane.getChildren().add(label);
        vbox.getChildren().add(pane);


        pane = new StackPane();
        rect = new Rectangle(120, 54);
        rect.setArcWidth(30);
        rect.setArcHeight(30);
        pane.getChildren().add(rect);
        label = new Label("-");
        label.setFont(new Font(30));
        pane.getChildren().add(label);
        vbox.getChildren().add(pane);


        pane = new StackPane();
        rect = new Rectangle(120, 54);
        rect.setArcWidth(30);
        rect.setArcHeight(30);
        pane.getChildren().add(rect);
        label = new Label("x");
        label.setFont(new Font(30));
        pane.getChildren().add(label);
        vbox.getChildren().add(pane);


        pane = new StackPane();
        rect = new Rectangle(120, 54);
        rect.setArcWidth(27);
        rect.setArcHeight(27);
        pane.getChildren().add(rect);
        label = new Label("/");
        label.setFont(new Font(30));
        pane.getChildren().add(label);
        vbox.getChildren().add(pane);


        return vbox;
    }

    //TODO add TextFormatter
    public static TextField getResultField() {

        textfield = new TextField();
        textfield.setEditable(true);
        textfield.setAlignment(Pos.BOTTOM_RIGHT);
        textfield.setFont(new Font("Digital-7", 40));
        textfield.setMinSize(327, 100);
        textfield.setMaxSize(327, 100);
        // textfield.setStyle("-fx-border-color: blue; -fx-border-width: 3;
        // -fx-border-style: dashed;");
        return textfield;

    }

    @SuppressWarnings("unused")
    public static HBox getChoiceBoxAndTtitle(Stage stage) {

        hbox = new HBox();
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER_LEFT);

        ChoiceBox<String> choicebox = new ChoiceBox<String>();
        choicebox.setStyle("-fx-background-color: lightblue;-fx-text-fill: darkblue;");
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
        title.setFont(new Font("Arial Rounded MT Bold", 20));
        hbox.getChildren().add(title);

        hbox.setMaxWidth(344);
        hbox.setMinWidth(344);

        return hbox;
    }

}
