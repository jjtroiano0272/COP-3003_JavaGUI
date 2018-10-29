package sample;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {
	
	@FXML
	private double inputC;
	
	@FXML
	private Label outputF;
	
	@FXML
	void convertTemp(ActionEvent event) {
		double degreesF = Double.parseDouble(inputC.getText());
		double degreeesF = degreeesC * (9 / 5) + 32;
		outputF.setText(Double.toString(degreeesF));
	}
	
	// You'll need interface ChangeListener.
	// You can use anonymous interface implementation for this interface OR a lambda exp!
	
	public void initalize() {
		btnConvert.setDefaultButton(true);
	}
}
