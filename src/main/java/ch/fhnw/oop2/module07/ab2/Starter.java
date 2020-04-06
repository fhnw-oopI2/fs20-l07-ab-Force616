package ch.fhnw.oop2.module07.ab2;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public final class Starter extends Application{
	
	@Override
	public void start(Stage stage) {
		Parent rootPanel = new ApplicationUI();
		
		Scene scene = new Scene(rootPanel);
		
		stage.setTitle("FX");
		stage.setScene(scene);
		stage.setWidth(300);
		stage.setHeight(400);
		stage.show();
	}
	public static void main(String[]args) {
		Application.launch(args);
	}
}
