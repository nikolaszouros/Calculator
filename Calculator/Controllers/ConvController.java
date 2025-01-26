package Calculator.Controllers;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ConvController {

    private Stage convStage;
    private Scene convScene;
    private Parent vbox;

    public ConvController(Stage stage) {
        stage.close();
        convStage = new Stage();
        startScene();
    }

    public void startScene() {

        convScene = new Scene(vbox, 350, 450);
        convStage.setScene(convScene);
        convStage.setTitle("Calculator");

        convStage.show();
    }
}
