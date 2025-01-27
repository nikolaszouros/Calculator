package Calculator.Controllers;

import Calculator.Views.SimpleCalc;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleController {

    private HBox hbox;
    private VBox vbox;
    private Stage calcStage;
    private Scene calcScene;
    private TextField textfield;
    private static GridPane grid;

    public SimpleController(Stage stage) {
        stage.close();
        calcStage = new Stage();
        startScene(calcStage);
    }

    public void startScene(Stage calcStage) {

        vbox = new VBox();
        vbox.setStyle("-fx-background-color : #003459");
        vbox.setMinSize(350, 450);
        vbox.setMaxSize(350, 450);
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);

        hbox = SimpleCalc.getChoiceBoxAndTtitle(calcStage);
        vbox.getChildren().add(hbox);

        textfield = SimpleCalc.getResultField();
        textfield.setStyle("-fx-background-color : #007ea7");
        vbox.getChildren().add(textfield);

        grid = SimpleCalc.getCircleButtons();


        hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(5);
        hbox.getChildren().add(grid);
        hbox.getChildren().add(SimpleCalc.getOvalButtons());
        vbox.getChildren().add(hbox);

        calcScene = new Scene(vbox, 350, 450);
        calcStage.setScene(calcScene);
        calcStage.setTitle("Calculator");
        calcStage.setResizable(false);

        calcStage.show();
    }

}