
package javaprojects;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame implements ActionListener {
	private JTextField celsiusTextField;
	private JTextField fahrenheitTextField;
	TemperatureConverter(){
		
		//Set Frame Properties
		setTitle("Temperature Converter");
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create JPanel
		JPanel panel= new JPanel();
		panel.setLayout(new GridLayout(3,2));
		
		//Create and add Components
		JLabel celsiusLable = new JLabel("Celcius");
		celsiusTextField = new JTextField();
		JLabel fahrenhietLabel= new JLabel("Fahrenhiet");
		fahrenheitTextField = new JTextField();
		fahrenheitTextField.setEditable(false);
		JButton convertButton = new JButton("Convert");
		
		//Register the Button->actionListener
		convertButton.addActionListener(this);
		
		
		panel.add(celsiusLable);
		panel.add(celsiusTextField);
		panel.add(fahrenhietLabel);
		panel.add(fahrenheitTextField);
		panel.add(new JLabel());  //To create a Blank space
		panel.add(convertButton);
		
		
		add(panel);
		
		
	}
	public static void main(String[] args) {
		TemperatureConverter converter = new TemperatureConverter();
		converter.setVisible(true);
		

	}
	public void actionPerformed(ActionEvent e) {
		double celsius = Double.parseDouble(celsiusTextField.getText());
		double fahreinheit = (celsius*9/5)+32;
		fahrenheitTextField.setText(String.format("%.2f",fahreinheit));
		
}
}
