package be.odisee.bodymassindex;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BodyMassIndexController {

    @FXML
    private TextField textFieldLengte, textFieldMassa, textFieldBMI;

    @FXML
    private TextArea textBoodschap;

    private BodyMassIndex bodyMassIndex;

    public BodyMassIndexController() {

        bodyMassIndex = new BodyMassIndex();
    }

    /**
     * De initiële waarden in bodyMassIndex ook op de GUI tonen
     * Listeners creëren die reageren op het verladen van textFieldLengte en textFieldMassa
     */
    public void initialize() {

        textFieldMassa.setText( Double.toString(bodyMassIndex.getMassa()) );
        textFieldLengte.setText( Integer.toString(bodyMassIndex.getLengteCm()) );
        textFieldBMI.setText( Double.toString(bodyMassIndex.getBmi()) );
        textBoodschap.setText("");

        // we willen dat er iets gebeurt als we het lengte- of massatekstveld veranderen (met lambda)
        // textProperty is te gevoelig, reageert op alle veranderingen, focusedProperty is beter

        textFieldMassa.focusedProperty().addListener( (observable, oldValue, newValue) -> {
            if (!newValue) updateGuiMassa(); // alleen bij focusLost
        } );
        textFieldLengte.focusedProperty().addListener( (observable, oldValue, newValue) -> {
            if (!newValue) updateGuiLengte();
        } );
        textFieldBMI.focusedProperty().addListener( (observable, oldValue, newValue) -> {
            if (!newValue) updateGuiBMI();
        } );
    }

    /**
     * Tekstveld massa opvragen en op onderliggend object instellen
     * Nieuwe BMI berekenen en op de GUI tonen
     */
    public void updateGuiMassa() {
        try {
            bodyMassIndex.setMassa( Double.parseDouble(textFieldMassa.getText()) );
            textFieldMassa.setText( Double.toString(bodyMassIndex.getMassa()) );
            textFieldBMI.setText( Double.toString(bodyMassIndex.getBmi()) );
            textBoodschap.setText("");
        } catch (NumberFormatException e) {
            textBoodschap.setText("U voerde een waarde voor de massa in\n die geen getal is");
        }
    }

    /**
     * Tekstveld lengte in cm opvragen en op onderliggend object instellen
     * Nieuwe BMI berekenen en op de GUI tonen
     */
    public void updateGuiLengte() {
        try {
            bodyMassIndex.setLengte( Integer.parseInt(textFieldLengte.getText()) );
            textFieldLengte.setText( Integer.toString(bodyMassIndex.getLengteCm()) );
            textFieldBMI.setText( Double.toString(bodyMassIndex.getBmi()) );
            textBoodschap.setText("");
        } catch (NumberFormatException e) {
            textBoodschap.setText("U voerde een waarde voor de lengte in\n die geen geheel getal is");
        }
    }

    /**
     * Tekstveld BMI opvragen en op onderliggend object instellen
     * Nieuwe massa berekenen en op de GUI tonen
     */
    public void updateGuiBMI() {
        try {
            int lengte = Integer.parseInt(textFieldLengte.getText());
            bodyMassIndex.setBmiEnLengte( Double.parseDouble(textFieldBMI.getText()), lengte );
            textFieldMassa.setText( Double.toString(bodyMassIndex.getMassa()) );
            textBoodschap.setText("");
        } catch (NumberFormatException e) {
            textBoodschap.setText("U voerde een waarde voor de Body Mass Index in\n die geen getal is");
        }
    }
}
