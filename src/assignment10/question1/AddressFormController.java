package assignment10.question1;

import javafx.fxml.FXML;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class AddressFormController implements EventHandler<ActionEvent> {

		public TextField txtName = new TextField();
		public TextField txtStreet = new TextField();
		public TextField txtCity = new TextField();
		public TextField txtState = new TextField();
		public TextField txtZip = new TextField();
		public Button btnSubmit = new Button("Submit");
	
		public void handle(ActionEvent event) {  
			
			System.out.println(txtName.getText());
    		System.out.println(txtStreet.getText());
    		System.out.println(txtCity.getText() + ", " + txtState.getText() + " " + txtZip.getText());

		}

}