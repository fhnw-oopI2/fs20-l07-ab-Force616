package ch.fhnw.oop2.module07.ab1;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ApplicationUI extends HBox{
	
	private Button button;
	Label inputText;
	private int x = 1;

	
	public ApplicationUI() {
		initalizeControls();
		layoutControls();
	}
	
	private void initalizeControls() {
		button = new Button("Action");
		inputText = new Label();
		
	}
	
	private void layoutControls() {
		HBox rootPane = new HBox();
		
		rootPane.setPadding(new Insets(10));
		rootPane.getChildren().addAll(button);
		
		button.setOnMouseClicked(event -> { 
			inputText = new Label("Label" + x);
			rootPane.getChildren().add(inputText);
			x += 1;
			this.getChildren().add(rootPane);
		});
		
		this.getChildren().add(rootPane);
	}
}
