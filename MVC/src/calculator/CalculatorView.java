package calculator;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {
	private JTextField fn=new JTextField(10);
	private JLabel additionLabel=new JLabel("+");
	private JTextField sn=new JTextField(10);
	private JButton calculateButton=new JButton("Calculate");
	private JTextField calcSolution=new JTextField(10);
	private JLabel l1 = new JLabel();
	private JPanel jp = new JPanel();
	
	CalculatorView()
	{
		JPanel calcPanel=new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,200);
		
		l1.setText("Name: Devam Joshi | Roll No.: 22BCP319");
		jp.add(l1);
		
		calcPanel.add(fn);
		calcPanel.add(additionLabel);
		calcPanel.add(sn);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		
		this.add(jp, BorderLayout.NORTH);
		this.add(calcPanel, BorderLayout.CENTER);
		this.setTitle("MVC");
	}
	
	public int getFirstNumber()
	{
		return Integer.parseInt(fn.getText());
	}
	
	public int getSecondNumber()
	{
		return Integer.parseInt(sn.getText());
	}
	
	public int getCalcSolution()
	{
		return Integer.parseInt(calcSolution.getText());
	}
	
	public void setCalcSolution(int solution)
	{
	calcSolution.setText(Integer.toString(solution));	
	}
	
	void addCalculationListener(ActionListener listenerForCalcButton)
	{
	calculateButton.addActionListener(listenerForCalcButton);	
	}
	
	void displayErrorMessage(String errorMessage)
	{
	JOptionPane.showMessageDialog(this, errorMessage);	
	}
}
