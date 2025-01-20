package Calculator.Views;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Converter {
    private Circle circle;
    private HBox output;
    private GridPane buttonContainer;
    private Label label;
    private Stage convStage;
    private Scene convScene;

    public Converter(Stage stage) {
        stage.close();
        convStage = new Stage();
        startScene();
    }

    public void startScene() {

        convScene = new Scene(getNumberButtons(), 350, 450);
        convStage.setScene(convScene);
        convStage.setTitle("Calculator");

        convStage.show();
    }

    public GridPane getNumberButtons(){
        buttonContainer = new GridPane();
        return buttonContainer;
    }
}
