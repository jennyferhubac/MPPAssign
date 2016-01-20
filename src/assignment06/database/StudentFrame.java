package assignment06.database;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 * A basic JFC 1.1 based application.
 */
 
public class StudentFrame extends javax.swing.JFrame
{
       private JScrollPane JScrollPane1;
   

	public StudentFrame()
	{
		

		//{{INIT_CONTROLS

		setTitle("JDBC example");
		setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(502,349);
		setVisible(false);
		Bshowdata.setText("showdata");
		Bshowdata.setActionCommand("showdata");
		getContentPane().add(Bshowdata);
		Bshowdata.setBounds(48,288,100,25);
		Bshowselection.setText("showselection");
		Bshowselection.setActionCommand("showselection");
		getContentPane().add(Bshowselection);
		Bshowselection.setBounds(180,288,120,24);
		BExit.setText("Exit");
		BExit.setActionCommand("Exit");
		getContentPane().add(BExit);
		BExit.setBounds(324,288,100,25);
		
		JLabel lblNewLabel = new JLabel("Student ID:");
		lblNewLabel.setBounds(48, 22, 69, 14);
		getContentPane().add(lblNewLabel);
		
		txtStudentID = new JTextField();
		txtStudentID.setBounds(127, 19, 86, 20);
		getContentPane().add(txtStudentID);
		txtStudentID.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(48, 49, 46, 14);
		getContentPane().add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(127, 46, 86, 20);
		getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewGpa = new JLabel("New GPA:");
		lblNewGpa.setBounds(48, 74, 69, 14);
		getContentPane().add(lblNewGpa);
		
		txtNewGPA = new JTextField();
		txtNewGPA.setBounds(127, 77, 86, 20);
		getContentPane().add(txtNewGPA);
		txtNewGPA.setColumns(10);
		
		JButton btnUpdateGpa = new JButton("Update GPA");
		btnUpdateGpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			     dbconnection dbconnect = new dbconnection();
			     dbconnect.Connect();
			     dbconnect.DoUpdate("Update StudentInfo set GPA = " + txtNewGPA.getText() + " where StudentID = '" + txtStudentID.getText() + "' and StudentName = '" + txtName.getText() + "'");
			     //System.out.println("Update StudentInfo set GPA = " + txtNewGPA.getText() + " where StudentID = " + txtStudentID.getText() + " and StudentName = " + txtName.getText());
			     dbconnect.Close();
			}
		});
		btnUpdateGpa.setBounds(10, 108, 137, 23);
		getContentPane().add(btnUpdateGpa);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(264, 22, 46, 14);
		getContentPane().add(lblAge);
		
		txtAge = new JTextField();
		txtAge.setBounds(324, 19, 86, 20);
		getContentPane().add(txtAge);
		txtAge.setColumns(10);
		
		JLabel lblGpa = new JLabel("GPA:");
		lblGpa.setBounds(264, 49, 46, 14);
		getContentPane().add(lblGpa);
		
		txtGPA = new JTextField();
		txtGPA.setBounds(324, 46, 86, 20);
		getContentPane().add(txtGPA);
		txtGPA.setColumns(10);
		
		JButton btnInsertStudent = new JButton("Insert Student");
		btnInsertStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 dbconnection dbconnect = new dbconnection();
			     dbconnect.Connect();
			     dbconnect.DoUpdate("Insert into StudentInfo (StudentID, StudentName, Age, GPA) values('" + txtStudentID.getText() + "','" + txtName.getText() + "'," + txtAge.getText() + "," + txtGPA.getText() + ")");
			     //System.out.println("Insert into StudentInfo (StudentID, StudentName, Age, GPA) values('" + txtStudentID.getText() + "','" + txtName.getText() + "'," + txtAge.getText() + "," + txtGPA.getText() + ")");
			     dbconnect.Close();
				
			}
		});
		btnInsertStudent.setBounds(169, 108, 120, 23);
		getContentPane().add(btnInsertStudent);
		
		JButton btnDeleteStudent = new JButton("Delete Student by Student ID");
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 dbconnection dbconnect = new dbconnection();
			     dbconnect.Connect();
			     dbconnect.DoUpdate("Delete from StudentInfo where StudentID = '" + txtStudentID.getText() + "'");
			     //System.out.println("Delete from StudentInfo where StudentID = '" + txtStudentID.getText() + "'");
			     dbconnect.Close();
			}
		});
		btnDeleteStudent.setBounds(299, 107, 177, 25);
		getContentPane().add(btnDeleteStudent);
		
		
		//}}

		//{{INIT_MENUS
		//}}

		//{{REGISTER_LISTENERS
		SymWindow aSymWindow = new SymWindow();
		this.addWindowListener(aSymWindow);
		SymAction lSymAction = new SymAction();
		Bshowdata.addActionListener(lSymAction);
		Bshowselection.addActionListener(lSymAction);
		BExit.addActionListener(lSymAction);
		//}}
	}

	
	/**
	 * The entry point for this application.
	 * Sets the Look and Feel to the System Look and Feel.
	 * Creates a new JFrame1 and makes it visible.
	 */
	static public void main(String args[])
	{
		try {
		    // Add the following code if you want the Look and Feel
		    // to be set to the Look and Feel of the native system.
		    
		    try {
		        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		    } 
		    catch (Exception e) { 
		    }
		    

			//Create a new instance of our application's frame, and make it visible.
			(new StudentFrame()).setVisible(true);
		} 
		catch (Throwable t) {
			t.printStackTrace();
			//Ensure the application exits with an error condition.
			System.exit(1);
		}
	}


	//{{DECLARE_CONTROLS
	javax.swing.JButton Bshowdata = new javax.swing.JButton();
	javax.swing.JButton Bshowselection = new javax.swing.JButton();
	javax.swing.JButton BExit = new javax.swing.JButton();
	private JTextField txtStudentID;
	private JTextField txtName;
	private JTextField txtNewGPA;
	private JTextField txtAge;
	private JTextField txtGPA;
	//}}

	//{{DECLARE_MENUS
	//}}

	void exitApplication()
	{
		try {
		    	this.setVisible(false);    // hide the Frame
		    	this.dispose();            // free the system resources
		    	System.exit(0);            // close the application
			}
		catch (Exception e) {
		}
	}

	class SymWindow extends java.awt.event.WindowAdapter
	{
		public void windowClosing(java.awt.event.WindowEvent event)
		{
			Object object = event.getSource();
			if (object == StudentFrame.this)
				StudentFrame_windowClosing(event);
		}
	}

	void StudentFrame_windowClosing(java.awt.event.WindowEvent event)
	{
		// to do: code goes here.
			 
		StudentFrame_windowClosing_Interaction1(event);
	}

	void StudentFrame_windowClosing_Interaction1(java.awt.event.WindowEvent event) {
		try {
			this.exitApplication();
		} catch (Exception e) {
		}
	}

	class SymAction implements java.awt.event.ActionListener
	{
		public void actionPerformed(java.awt.event.ActionEvent event)
		{
			Object object = event.getSource();
			if (object == Bshowdata)
				Bshowdata_actionPerformed(event);
			else if (object == Bshowselection)
				Bshowselection_actionPerformed(event);
			else if (object == BExit)
				BExit_actionPerformed(event);
			
		}
	}

	void Bshowdata_actionPerformed(java.awt.event.ActionEvent event)
	{
	    String id, name;
	  //START ASSIGN6 JDBC LAB 1.A & 1.B
	    int age, count=0;
	    double totalgpa = 0.0, gpa;
	  //END ASSIGN6 JDBC LAB 1.A & 1.B  
	    
		// load data from the database!!

        dbconnection dbconnect = new dbconnection();
        dbconnect.Connect();
        ResultSet rs;
        rs=dbconnect.DoQuery("Select * from StudentInfo");
		
		try {
		  while (rs.next()) {
			  count++;
				id = rs.getString("StudentID");
				name = rs.getString("StudentName");
				//START ASSIGN6 JDBC LAB 1.A & 1.B
				age = rs.getInt("Age");
                gpa = rs.getDouble("GPA");
                //System.out.println("Student ID is " + id + "   Student Name is " + name);
                System.out.println("---------------------------------------");
                System.out.println("Student ID:   " + id);
                System.out.println("Student Name: " + name);
                System.out.println("Student Age:  " + age);
                System.out.println("Student GPA:  " + gpa);
               totalgpa += gpa;
              //END ASSIGN6 JDBC LAB 1.A & 1.B
		    }
		  
		  System.out.println("============================================================\n");
		  System.out.printf("The average GPA of the student is:\t%.2f", getGPAAverage(count,totalgpa));
		} catch (SQLException ex) {
			System.err.println("error in database connection");
		}

		dbconnect.Close();  //close database connection
			 
	}
	
	//START ASSIGN6 JDBC LAB 1.A & 1.B
	private double getGPAAverage(int count, double totalgpa)
	{
		return totalgpa/count;
	}
	//END ASSIGN6 JDBC LAB 1.A & 1.B

	void Bshowselection_actionPerformed(java.awt.event.ActionEvent event)
	{
	    String id="";
       
        
		JFrame2 frame = new JFrame2();
		frame.setid(id);
		frame.setVisible(true);
			 
	}

	void BExit_actionPerformed(java.awt.event.ActionEvent event)
	{
		exitApplication();
			 
	}
}
