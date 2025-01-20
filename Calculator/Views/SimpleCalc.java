package Calculator.Views;

import java.util.ArrayList;

import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SimpleCalc {


    private TextField output;

    private HBox hbox;
    private VBox vbox;
    private GridPane pane;

    private Circle circle;
    private Rectangle rect;

    private Stage calcStage;
    private Scene calcScene;

    public SimpleCalc(Stage stage) {
        stage.close();
        calcStage = new Stage();
        startScene();
    }

    public GridPane getNumberButtons() {

        pane = new GridPane();
        pane.setHgap(5);
        pane.setVgap(5);

        for (int i = 0; i <= 2; i++) {
            for (int j = 4; j >= 0; j--) {
                circle = new Circle(27);
                circle.setStroke(Color.BLUE);
                circle.setStrokeWidth(2);
                circle.setFill(Color.WHITE);
                pane.add(circle, i, j);
            }
        }
        pane.setStyle("-fx-background-color: white;");

        return pane;
    }

    public VBox getCalculationButtons() {

        vbox = new VBox();

        for (int i = 0; i < 5; i++) {
            rect = new Rectangle(130, 54);
            rect.setArcWidth(20); 
            rect.setArcHeight(20); 
            rect.setStroke(Color.BLUE);
            rect.setStrokeWidth(2);
            rect.setFill(Color.WHITE);
            vbox.getChildren().add(rect);
        }

        vbox.setSpacing(5);
        vbox.setStyle("-fx-background-color: white");

        return vbox;
    }

    public TextField getResultField(){

        output = new TextField();
        output.setStyle("-fx-background-color: white; -fx-border-color: blue; -fx-border-width: 2px; -fx-border-radius: 5px; -fx-font-size: 18px; -fx-alignment: center-right;");
        output.setEditable(true);
        output.setMinHeight(70);
        output.setMinWidth(320);
        output.setMaxWidth(320);
        return output;
    }

    public void startScene() {

        //TODO add an "go back" image and the title of the calc

        output = getResultField();

        pane = getNumberButtons();

        vbox = getCalculationButtons();

        hbox = new HBox();
        hbox.setSpacing(5);
        hbox.getChildren().add(pane);
        hbox.getChildren().add(vbox);
        hbox.setStyle("-fx-background-color: white");

        vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setStyle("-fx-background-color: white");
        vbox.getChildren().add(output);
        vbox.getChildren().add(hbox);
        vbox.setLayoutX(19);
        vbox.setLayoutY(60);


        calcScene = new Scene(vbox, 350, 450);
        calcStage.setScene(calcScene);
        calcStage.setTitle("Calculator");
        calcStage.setResizable(false);

        calcStage.show();
    }

}
