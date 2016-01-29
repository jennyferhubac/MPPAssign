package assignment09.question2;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.paint.*;

public class StringUtility extends Application{
	@Override
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("String Utility");
		
		//StackPane root = new StackPane();
		FlowPane root = new FlowPane();
		root.setOrientation(Orientation.HORIZONTAL);
		Scene scene = new Scene(root, 380, 150);
		//scene.getStylesheets().add(
		//		getClass().getResource("test.css").toExternalForm());

        primaryStage.setScene(scene);
		
		//left
		FlowPane flow = new FlowPane();
		//flow.setId("flow");
		flow.setOrientation(Orientation.VERTICAL);
		flow.setPrefWrapLength(0);
		flow.setAlignment(Pos.TOP_LEFT);
		flow.setHgap(20);
		flow.setVgap(10);
		flow.setPadding(new Insets(25, 25, 25, 55));
		
		VBox vBox = new VBox(10);
		vBox.setPrefWidth(120);
		Button btnCountLet = new Button("Count Letters");
		Button btnReverseLet = new Button("Reverse Letters");
		Button btnRemoveDup = new Button("Remove Duplicates");
		
		btnCountLet.setMinWidth(vBox.getPrefWidth());
		btnReverseLet.setMinWidth(vBox.getPrefWidth());
		btnRemoveDup.setMinWidth(vBox.getPrefWidth());
		
		btnCountLet.setAlignment(Pos.TOP_LEFT);
		btnReverseLet.setAlignment(Pos.TOP_LEFT);
		btnRemoveDup.setAlignment(Pos.TOP_LEFT);
		
		vBox.getChildren().add(btnCountLet);
		vBox.getChildren().add(btnReverseLet);
		vBox.getChildren().add(btnRemoveDup);
		
		flow.getChildren().add(vBox);
		
		//right
		FlowPane flow2 = new FlowPane();
		//flow2.setId("flow2");
		flow2.setPrefWidth(80);
		flow2.setOrientation(Orientation.VERTICAL);
		//flow2.setPrefWrapLength(0);
		//flow2.setAlignment(Pos.TOP_RIGHT);
		flow2.setHgap(20);
		flow2.setVgap(0);
		flow2.setPadding(new Insets(30, 25, 25, 0));
		
		VBox vInput = new VBox();
		Label lblInput = new Label("Input");
		TextField txtInput = new TextField();
		
		lblInput.setFont(new Font(10));
		txtInput.setPrefHeight(5);
		
		vInput.getChildren().add(lblInput);
		vInput.getChildren().add(txtInput);
		
		flow2.getChildren().add(vInput);
		
		VBox vOutput = new VBox();
		Label lblOutput = new Label("Output");
		TextField txtOutput = new TextField();
		
		lblOutput.setFont(new Font(10));
		
		vOutput.getChildren().add(lblOutput);
		vOutput.getChildren().add(txtOutput);
		
		flow2.getChildren().add(vOutput);

		root.getChildren().add(flow);
		root.getChildren().add(flow2);
		
		
		//btnEvent

		btnCountLet.setOnAction(new EventHandler<ActionEvent>() 
		{
	@Override
	public void handle(ActionEvent e)
	{
		txtOutput.setText(String.valueOf(countLetters(txtInput.getText())));

	}
		});
		
		btnReverseLet.setOnAction(new EventHandler<ActionEvent>()
		{
	@Override
	public void handle(ActionEvent e)
	{
		txtOutput.setText(reverseWord(txtInput.getText()));
	}
		});
		
		btnRemoveDup.setOnAction(new EventHandler<ActionEvent>()
		{
	@Override
	public void handle(ActionEvent e)
	{
		txtOutput.setText(removeDuplicate(txtInput.getText()));
	}
		});
		

        primaryStage.show();
	}


	public static void main(String[] args) {
		launch(args);
	}
	
	public static int countLetters(String str)
	{
		if(str.length() == 0)
			return 0;
		else
			return 1 + countLetters(str.substring(1));
	}
	
	public static String reverseWord(String str)
	{
		if(str.length() == 0)
			return "";
		else
			return str.charAt(str.length() - 1) + reverseWord(str.substring(0, str.length()-1));
	}
	
	public static String removeDuplicate(String str)
	{
		if(str.length() <= 1)
		 return str;
		else if(str.substring(1).contains(str.substring(0,1)))
			return removeDuplicate(str.substring(1));
		else
			return str.charAt(0) + removeDuplicate(str.substring(1));
		
	}
}
