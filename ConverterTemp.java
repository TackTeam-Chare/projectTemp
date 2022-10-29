import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ConverterTemp extends JFrame {
    JLabel labelFahrenheit1;
	JLabel labelCelsius1;
	JTextField textFahrenheit1;
	JTextField textCelsius1;
	private JButton conFahToCel1;
	private JButton conCelToFah1;

	JLabel labelKelvin2; 
	JLabel labelCelsius2;
	JTextField textKelvin2;
	JTextField textCelsius2;
	JButton conKelvinToCel2;
	JButton conCelTokelvin2;

	JLabel labelFahrenheit2;
	JLabel labelKelvin3;
	JTextField textFahrenheit2;
	JTextField textKelvin3;
	private JButton conFahToKel1;
	private JButton conKelToFah1;
	// Button Clear
	private JButton ClearButton;
	//Button Exit
    private JButton ExitButton;

	public ConverterTemp () { // คอนสรัคเตอร์ของคลาส			
		super ("Temperature");
		setLayout (new FlowLayout ());
		//Fahrenheit to Celsius
		labelFahrenheit1 = new JLabel ("Fahrenheit : ", SwingConstants.LEFT);
		labelFahrenheit1.setToolTipText("This is a temerature scale");
		add (labelFahrenheit1);
		textFahrenheit1 = new JTextField (10);
		add (textFahrenheit1);
		labelCelsius1 = new JLabel ("Celsius :       ", SwingConstants.LEFT);
		labelCelsius1.setToolTipText("This is a scale and unit of measurement for temperature");
		add (labelCelsius1);
		textCelsius1 = new JTextField (10);
		add (textCelsius1);
		 conFahToCel1 = new JButton ("Convert Fahrenheit to Celsius");
		 conFahToCel1.setToolTipText("This is a button to convert Fahrenheit to Celsius temperature.");
		 labelFahrenheit1.add(conFahToCel1);
		add (conFahToCel1);
		conCelToFah1 = new JButton ("Convert Celsius to Fahrenheit");
		conCelToFah1.setToolTipText("This is a button for converting Celsius to Fahrenheit temperature.");
		labelCelsius1.add(conCelToFah1);
		add (conCelToFah1);
		JPanel panel1 = new JPanel(new GridLayout(2, 2, 10, 4));
		panel1.add(labelFahrenheit1);
		panel1.add(labelCelsius1);
		panel1.add(textFahrenheit1);
		panel1.add(textCelsius1);
		add(panel1, BorderLayout.NORTH);
		JPanel buttonPanel1 = new JPanel();
		buttonPanel1.add(conFahToCel1);
		buttonPanel1.add(conCelToFah1);	
		add(buttonPanel1, BorderLayout.SOUTH);
		conFahToCel1.addActionListener(new FahrListener1 ());
		conCelToFah1.addActionListener(new CelsListener1 ());
		//Kelvin to Celsius
		labelKelvin2 = new JLabel ("kelvin : ", SwingConstants.LEFT);
		labelKelvin2.setToolTipText(" ");
		add (labelKelvin2);
		textKelvin2 = new JTextField (10);
		add (textKelvin2);
		labelCelsius2 = new JLabel ("Celsius :       ", SwingConstants.LEFT);
		labelCelsius2.setToolTipText("");
		add (labelCelsius2);
		textCelsius2 = new JTextField (10);
		add (textCelsius2);
		conKelvinToCel2 = new JButton ("Convert kelvin to Celsius");
		conKelvinToCel2.setToolTipText("This is a button for converting Kelvin to Celsius temperature.");
		labelKelvin2.add(conKelvinToCel2);
		add (conKelvinToCel2);
		conCelTokelvin2 = new JButton ("Convert Celsius to kelvin");
		conCelTokelvin2.setToolTipText("This is a button for converting Celsius to Kelvin temperature.");
		labelKelvin2.add(conCelTokelvin2);
		add (conCelTokelvin2);
		JPanel panel2 = new JPanel(new GridLayout(2, 2, 10, 4));
		panel2.add(labelKelvin2);
		panel2.add(labelCelsius2);
		panel2.add(textKelvin2);
		panel2.add(textCelsius2);
		add(panel2, BorderLayout.NORTH);
		JPanel buttonPanel2 = new JPanel();
		buttonPanel2.add(conKelvinToCel2);
		buttonPanel2.add(conCelTokelvin2);	
		add(buttonPanel2, BorderLayout.SOUTH);
		conKelvinToCel2.addActionListener(new KelvinListener1 ());
		conCelTokelvin2.addActionListener(new CelsListener2 ());
		//Fahrenheit to Kelvin
		labelFahrenheit2 = new JLabel ("Fahrenheit : ", SwingConstants.LEFT);
		labelFahrenheit2.setToolTipText("");
		add (labelFahrenheit2);
		textFahrenheit2 = new JTextField (10);
		add (textFahrenheit2);
		labelKelvin3 = new JLabel ("Kelvin :       ", SwingConstants.LEFT);
		labelKelvin3.setToolTipText("");
		add (labelKelvin3);
		textKelvin3 = new JTextField (10);
		add (textKelvin3);
		conFahToKel1 = new JButton ("Convert Fahrenheit to Kelvin");
		conFahToKel1.setToolTipText("This is a button for converting Fahrenheit to Kelvin temperature.");
		labelKelvin2.add(conFahToKel1);
		add ( conFahToKel1);
		conKelToFah1 = new JButton ("Convert Kelvin to Fahrenheit");
		conKelToFah1.setToolTipText("This is a button for converting  Kelvin to Fahrenheit temperature.");
		labelKelvin2.add(conKelToFah1);
		add ( conKelToFah1);
		JPanel panel3 = new JPanel(new GridLayout(2, 2, 10, 4));
		panel3.add(labelFahrenheit2);
		panel3.add(labelKelvin3);
		panel3.add(textFahrenheit2);
		panel3.add(textKelvin3);
		add(panel3, BorderLayout.NORTH);
		JPanel buttonPanel3 = new JPanel();
		buttonPanel3.add(conFahToKel1);
		buttonPanel3.add(conKelToFah1);	
		add(buttonPanel3, BorderLayout.SOUTH);
		conFahToKel1.addActionListener(new FahrListener2 ());
		conKelToFah1.addActionListener(new KelvinListener2 ());
		  //Clear 
		ClearButton = new JButton("Clear");
		ClearButton.setBackground(Color.DARK_GRAY);
		ClearButton.setForeground(Color.WHITE);
		ClearButton.setToolTipText(" Numeric Clear Button ! ");
		add(ClearButton);
		  JPanel  buttonPanelClear = new JPanel();
		  buttonPanelClear.add(ClearButton);
		  add(buttonPanelClear,BorderLayout.NORTH);
		  ClearButton.addActionListener(new Clear ());
		  setVisible(true); 
		  //Exit
		  ExitButton = new JButton("Exit");
		  ExitButton.setBackground(Color.BLACK);
		  ExitButton.setForeground(Color.WHITE);
		
		  ExitButton.setToolTipText(" Exit the program ! ");
		  add(ExitButton);
		  JPanel  buttonPanelExit = new JPanel();
		  buttonPanelExit.add(ExitButton);
		  add(buttonPanelExit,BorderLayout.SOUTH);
		  ExitButton.addActionListener(new Exit ());
		  setVisible(true);	  
	} // จบconstructor 
     // Class ConvertTemp  คำนวณ
	private class FahrListener1 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			// fahrenheit to celsius
			String Fahrenheit = textFahrenheit1.getText().toString();
			if(Fahrenheit.equals("")){
				JOptionPane.showMessageDialog(null, "Please enter a number before calculating.");
			}
				if (event.getSource() == conFahToCel1){
					//สร้าง Exception เพื่อดักจับข้อผิดพลาดเมื่อยังไม่ได้ป้อนตัวเลขเเล้วกดปุ่มคำนวณ
					try{
					Double conFahToCel =  (((5.0/9.0) * (((Double.parseDouble(textFahrenheit1.getText())) -32))));			
					textCelsius1.setText(String.format("%.2f",conFahToCel));
					System.out.printf("ผลการคำนวณของ fahrenheit to celsius = %.2f  \n",conFahToCel);            
					textFahrenheit1.requestFocus();
					textFahrenheit1.selectAll();
			} catch (NumberFormatException e) {
				System.out.println(" You haven't entered a number to calculate.  ( ยังไม่ป้อนตัวเลขเพื่อคำนวณ )   ");
			}
			

			} // จบ if statement		
		} // จบ actionPerformed
	} //จบ FahrListener1	
	private class CelsListener1  implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			// celsius to fahrenheit
			String  Celsius = textCelsius1.getText().toString();
			if(Celsius.equals("")){
				JOptionPane.showMessageDialog(null, "Please enter a number before calculating.");
			}
			if (event.getSource() == conCelToFah1){
				try{
				Double conCelToFah =  (((((Double.parseDouble(textCelsius1.getText())) *(9.0/5.0) + 32))));
				//textFahrenheit1.setText(conCelToFah + " °F");
				textFahrenheit1.setText(String.format("%.2f",conCelToFah,"°F"));
                System.out.printf("ผลการคำนวณของ  celsius to fahrenheit  = %.2f  \n",conCelToFah);   
				textCelsius1.requestFocus();
				textCelsius1.selectAll();
			}catch(NumberFormatException e){
				System.out.println(" You haven't entered a number to calculate. ( ยังไม่ป้อนตัวเลขเพื่อคำนวณ )   ");
			}
			} // จบ if statement		
		} // จบ actionPerformed
	} // จบ CelsListener1
	private class KelvinListener1 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			// kelvin to celsius	
			String  kelvin = textKelvin2.getText().toString();
			if(kelvin.equals("")){
				JOptionPane.showMessageDialog(null, "Please enter a number before calculating.");
			}
			if (event.getSource() == conKelvinToCel2){
				try{
				Double conKelToCel =  ((Double.parseDouble(textKelvin2.getText())) -273.15);
				textCelsius2.setText(String.format("%.2f",conKelToCel," °C"));
                System.out.printf("ผลการคำนวณของ  kelvin to celsius   = %.2f \n ",conKelToCel);   
				textKelvin2.requestFocus();
				textKelvin2.selectAll();
				}catch(NumberFormatException e){
					System.out.println(" You haven't entered a number to calculate.  ( ยังไม่ป้อนตัวเลขเพื่อคำนวณ )   ");
				}
			}// จบ if statement
		}// จบ actionPerformed
	}// จบ KelvinListener1
	private class CelsListener2  implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			//  celsius to kelvin 
			String  Celsius = textCelsius2.getText().toString();
			if(Celsius.equals("")){
				JOptionPane.showMessageDialog(null, "Please enter a number before calculating.");
			}
			if (event.getSource() == conCelTokelvin2){
				try{
				 Double conCelToKel =  (((Double.parseDouble(textCelsius2.getText())) + 273.15));
				//textkelvin2.setText(conCelToKel + " K");
				textKelvin2.setText(String.format("%.2f",conCelToKel," K"));
                System.out.printf("ผลการคำนวณของ  celsius to kelvin    = %.2f \n ",conCelToKel);   
				textCelsius2.requestFocus();
				textCelsius2.selectAll();
				}catch(NumberFormatException e){
					System.out.println(" You haven't entered a number to calculate.  ( ยังไม่ป้อนตัวเลขเพื่อคำนวณ )   ");
				}
			}// จบ if statement
		}// จบ actionPerformedS
	}// จบ CelsListener2
	private class FahrListener2 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			// Fahrenheit to Kelvin
			String  Fahrenheit = textFahrenheit2.getText().toString();
			if(Fahrenheit.equals("")){
				JOptionPane.showMessageDialog(null, "Please enter a number before calculating.");
			}
			if (event.getSource() == conFahToKel1){
				try{
			Double conFahToKel = (Double) (( (((Double.parseDouble(textFahrenheit2.getText())) -32* (5.0/9.0)+273.15))));
				//textkelvin3.setText(conFahToKel + " K");
				textKelvin3.setText(String.format("%.3f",conFahToKel," °K"));
                System.out.printf("ผลการคำนวณของ fahrenheit to kelvin   = %.2f  \n",conFahToKel);  
				textFahrenheit2.requestFocus();
				textFahrenheit2.selectAll();
				}catch (NumberFormatException e){
					System.out.println(" You haven't entered a number to calculate.  ( ยังไม่ป้อนตัวเลขเพื่อคำนวณ )   ");
				}
			} // จบ if statement		
		} // จบ actionPerformed
	} //จบ FahrListener2	
	private class KelvinListener2 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
		//Kelvin to  Fahrenheit
		String   Kelvin= textKelvin2.getText().toString();
		if(Kelvin.equals("")){
			JOptionPane.showMessageDialog(null, "Please enter a number before calculating.");
		}
			if (event.getSource() == conKelToFah1){
				try{
				Double conKelToFah1 = (Double) ((((((Double.parseDouble(textKelvin3.getText())) -273.15 *(9.0/5.0) +32 )))));
				textFahrenheit2.setText(String.format("%.3f",conKelToFah1," °F"));
                System.out.printf("ผลการคำนวณของ kelvin to  fahrenheit   = %.2f \n",conKelToFah1);  
				textKelvin3.requestFocus();
				textKelvin3.selectAll();
				}catch(NumberFormatException e){
					System.out.println(" You haven't entered a number to calculate.  ( ยังไม่ป้อนตัวเลขเพื่อคำนวณ )   ");
				}
			} // จบ if statement	
		}// จบ actionPerformed
	}// จบ KelvinListener2
	//ปุ่มClear
	private class Clear implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == ClearButton){
				textFahrenheit1.setText("");
				textFahrenheit2.setText("");
				textCelsius1.setText("");
				textKelvin2.setText("");
				textCelsius2.setText("");
				textKelvin3.setText("");
			} // จบ if statement	
		}// จบ actionPerformed
	}// จบ KelvinListener2
	// ปุ่ม Exit */
	private class Exit implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(JOptionPane.showConfirmDialog(ExitButton,"Confrime if you want Exit ?", "Exit", 
            JOptionPane.YES_NO_CANCEL_OPTION)==JOptionPane.YES_NO_OPTION)
			{
				System.exit(0);
			} // จบ if statement		
		} // จบ actionPerformed
	}
}
