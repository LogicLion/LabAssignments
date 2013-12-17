import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TempConverter extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int WIDTH = 300;
	private int HEIGHT = 100;
	private JTextField cBox;
	private JTextField fBox;
	
	public TempConverter(){
		setTitle("Temperatue Converter");
		setSize(WIDTH,HEIGHT);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		createContents();
		setVisible(true);
	}
	
	private void createContents(){
		JLabel fLabel = new JLabel("Fahrenheit: ");
		JLabel cLabel = new JLabel("Celsius: ");
		Listener listener = new Listener();	
		
		cBox = new JTextField(4);
		fBox = new JTextField(4);
		add(fLabel);
		add(fBox);
		add(cLabel);
		add(cBox);
		cBox.addActionListener(listener);
		fBox.addActionListener(listener);
	}
	
	private class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			double fVal;
			double cVal;
			if(e.getSource() == fBox){
				fVal = Double.parseDouble(fBox.getText());
				cBox.setText(String.format("%.2f", convertFahrenheitToCelsius(fVal)));
			}else{
				cVal = Double.parseDouble(cBox.getText());
				fBox.setText(String.format("%.2f", convertCelsiusToFahrenheit(cVal)));
			}
		}
	}
		
	private double convertFahrenheitToCelsius(double val){
		return (val-32)*((double)5/9);

	}
	
	private double convertCelsiusToFahrenheit(double val){
		return 32+(val*((double)9/5));
	}
	
	public static void main(String[] args){
		new TempConverter();
	}
}
