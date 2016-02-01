package assignment10.question2;

import javafx.fxml.FXML;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class StringUtilityController implements EventHandler<ActionEvent> {
	
		public Button btnCountLet = new Button("Count Letters");
		public Button btnReverseLet = new Button("Reverse Letters");
		public Button btnRemoveDup = new Button("Remove Duplicates");
		
		public TextField txtInput = new TextField();
		public TextField txtOutput = new TextField();

		public void handle(ActionEvent event) {  
			
			if(event.getSource() == btnCountLet)
			{
				txtOutput.setText(String.valueOf(countLetters(txtInput.getText())));

			}
			else if (event.getSource() == btnReverseLet)
			{
				txtOutput.setText(reverseWord(txtInput.getText()));
			}
			else if (event.getSource() == btnRemoveDup)
			{
				txtOutput.setText(removeDuplicate(txtInput.getText()));
			}

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


/*btn.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent event) {
		System.out.println("Hello World!");
	}
*/