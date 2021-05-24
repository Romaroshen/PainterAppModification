package PainterAppModification;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import java.math.BigDecimal;

public class PainterAppModificationController {

    @FXML    private Slider RSlider;
    @FXML    private Slider GSlider;
    @FXML    private Slider BSlider;
    @FXML    private Rectangle ColoredRectangle;
    @FXML    private Label RValue;
    @FXML    private Label BValue;
    @FXML    private Label GValue;


    BigDecimal R = BigDecimal.valueOf(RSlider.getValue());
    BigDecimal G = BigDecimal.valueOf(GSlider.getValue());
    BigDecimal B = BigDecimal.valueOf(BSlider.getValue());



    public void initialize(){

        RSlider.valueProperty().addListener(
                (ov, oldValue, newValue) -> {
                    RValue.setText(String.valueOf(newValue));
                    ColoredRectangle.setFill(Color.rgb((Integer) newValue, G.intValue(), B.intValue()));
                    RValue.setText(String.valueOf(newValue));
                });

        GSlider.valueProperty().addListener(
                (ov, oldValue, newValue) -> {
                    GValue.setText(String.valueOf(newValue));
                    ColoredRectangle.setFill(Color.rgb(R.intValue(), (Integer) newValue, B.intValue()));
                    GValue.setText(String.valueOf(newValue));
                });

        BSlider.valueProperty().addListener(
                (ov, oldValue, newValue) -> {
                    BValue.setText(String.valueOf(newValue));
                    ColoredRectangle.setFill(Color.rgb(R.intValue(), G.intValue(), (Integer) newValue));
                    BValue.setText(String.valueOf(newValue));
                });
    }

}
