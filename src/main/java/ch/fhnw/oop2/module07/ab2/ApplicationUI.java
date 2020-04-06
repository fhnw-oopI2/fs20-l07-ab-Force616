package ch.fhnw.oop2.module07.ab2;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;


public class ApplicationUI extends VBox{
	
	Label inputText;
	Slider slider;
	DoubleProperty slidernum = new SimpleDoubleProperty();
	
	public ApplicationUI() {
		initalizeControls();
		layoutControls();
	}
	
	private void initalizeControls() {
		inputText = new Label(slidernum.toString());
		inputText.setAlignment(Pos.BASELINE_CENTER);
		
		slider = new Slider(1, 10, slidernum.get());
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(0.25f);
		slider.setBlockIncrement(0.1f);
	}
	
	private void layoutControls() {
		VBox rootPane = new VBox();
		slidernum.set(5.0);
		slidernum.addListener(slidernum -> inputText.textProperty().setValue(slider.valueProperty().toString()));
		
		rootPane.setPadding(new Insets(10, 10, 10, 10));
		rootPane.getChildren().addAll(inputText, slider);
		
		this.getChildren().add(rootPane);
	}
}
