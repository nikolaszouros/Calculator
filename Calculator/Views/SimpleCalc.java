package Calculator.Views;

import java.io.FileInputStream;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SimpleCalc {

    private TextField output;
    private VBox vbox;
    private Circle circle;
    private Rectangle rect;
    private Stage calcStage;
    private Scene calcScene;
    private ImageView imageView;
    private Image image;
    private FileInputStream file;

    public SimpleCalc() {

    }

    public Circle getCircleButtons() {

        circle = new Circle(25);

        return circle;
    }

    public Rectangle getOvalButtons() {

        return rect;
    }

    public TextField getResultField() {

        return output;
    }

}
