package assignment09.question1;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.paint.*;


public class AddressForm extends Application {
	
	@Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Address Form");
        
        StackPane root = new StackPane();

        FlowPane flow = new FlowPane();
        flow.setOrientation(Orientation.HORIZONTAL);
        flow.setPrefWrapLength(400);
        flow.setAlignment(Pos.TOP_CENTER);
        flow.setHgap(20);
        flow.setVgap(20);
        flow.setPadding(new Insets(25, 25, 25, 25));
        
        //name
        VBox vName = new VBox();
        vName.setAlignment(Pos.TOP_LEFT);
        Label lblName = new Label("Name");
        TextField txtName = new TextField();
        
        vName.getChildren().add(lblName);
        vName.getChildren().add(txtName);
        
        flow.getChildren().add(vName);
        
        //street
        VBox vStreet = new VBox();
        vStreet.setAlignment(Pos.TOP_LEFT);
        Label lblStreet = new Label("Street");
        TextField txtStreet = new TextField();
        
        vStreet.getChildren().add(lblStreet);
        vStreet.getChildren().add(txtStreet);
        
        flow.getChildren().add(vStreet);
        
        //city
        VBox vCity = new VBox();
        vCity.setAlignment(Pos.TOP_LEFT);
        Label lblCity = new Label("City");
        TextField txtCity = new TextField();
        
        vCity.getChildren().add(lblCity);
        vCity.getChildren().add(txtCity);
        
        flow.getChildren().add(vCity);
        
        //state
        VBox vState = new VBox();
        vState.setAlignment(Pos.TOP_LEFT);
        Label lblState = new Label("State");
        TextField txtState = new TextField();
        
        vState.getChildren().add(lblState);
        vState.getChildren().add(txtState);
        
        flow.getChildren().add(vState);
        
        //zip
        VBox vZip = new VBox();
        vZip.setAlignment(Pos.TOP_LEFT);
        Label lblZip = new Label("Zip");
        TextField txtZip = new TextField();
        
        vZip.getChildren().add(lblZip);
        vZip.getChildren().add(txtZip);
        
        flow.getChildren().add(vZip);
        
        //button
        FlowPane flow2 = new FlowPane();
        flow2.setOrientation(Orientation.HORIZONTAL);
        flow2.setPrefWrapLength(400);
        flow2.setAlignment(Pos.BOTTOM_CENTER);
        flow2.setHgap(10);
        flow2.setVgap(10);
        flow2.setPadding(new Insets(10, 10, 10, 10));
        Button btnSubmit = new Button("Submit");
        
        flow2.getChildren().add(btnSubmit);
        
        root.getChildren().addAll(flow,flow2);
        
        //btnevent
        btnSubmit.setOnAction(new EventHandler<ActionEvent>() 
        		{
        	@Override
        	public void handle(ActionEvent e)
        	{
        		System.out.println(txtName.getText());
        		System.out.println(txtStreet.getText());
        		System.out.println(txtCity.getText() + ", " + txtState.getText() + " " + txtZip.getText());
        	}
        		});

        Scene scene = new Scene(root, 550, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

	
	public static void main(String[] args) {
		launch(args);
	}
}

