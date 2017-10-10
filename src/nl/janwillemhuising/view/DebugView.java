package nl.janwillemhuising.view;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DebugView{

    //debug labels
    private Label labelFPS = new Label();

    private GridPane debugview;

    public DebugView(){
        debugview = new GridPane();
        debugview.setHgap(5);
        debugview.setVgap(5);
        debugview.setPadding(new Insets(10));

        debugview.addRow(0, labelFPS);
    }

    public void seTextFpsLabel(String string){
        this.labelFPS.setText(string);
    }

    public GridPane getDebugView() {
        return debugview;
    }
}
