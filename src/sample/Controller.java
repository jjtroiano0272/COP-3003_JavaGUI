package sample;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {
	
	@FXML
	private TextField inputC;
	
	@FXML
	private Label outputF;
	
	@FXML
	void convertTemp(ActionEvent event) {
		double degreeesC = Double.parseDouble(inputC);
		double degreeesF = degreeesC * (9/5) + 32;
		outputF.setText(Double.toString(degreeesF));
	};
}
