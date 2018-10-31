package sample;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.text.NumberFormat;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.stage.Stage;
import javax.swing.plaf.SliderUI;
import javax.xml.soap.Text;

public class Controller {
	
	/* Commented out in order to work on sandbox version of GUI...
	
	
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
	*/
	
	private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
	private static final NumberFormat percent = NumberFormat.getPercentInstance();
	
	private BigDecimal tipPercentage = new BigDecimal(0.20);
	
	@FXML
	private TextField boxAmount;
	
	@FXML
	private Label lblPercentage;
	
	@FXML
	private Slider sldPercentage;
	
	@FXML
	private TextField boxTip;
	
	@FXML
	private TextField lblTotal;
	
}
