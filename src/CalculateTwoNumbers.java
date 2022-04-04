// Calculate sum, difference, product, and quotient of 2 double numbers which are entered by users.

import javax.swing.JOptionPane;
public class CalculateTwoNumbers{
	public static void main(String args[]) {
		String strNum1, strNum2;
		strNum1 = JOptionPane.showInputDialog(null, "Please enter your first number: ", "Input your first number", JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null, "Please input your second number", "Input your second number", JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		double sum, difference, product, quotient;
		sum = num1+num2;
		difference = num1-num2;
		product = num1*num2;
		quotient = num1/num2;
		String result = "Two numbers are: "+ strNum1 + " and "+ strNum2;
		result += "\n";
		result += "Sum: " + sum;
		result += "\n";
		result += "Difference: " + difference;
		result += "\n";
		result += "Product: " + product;
		result += "\n";
		result += "Quotient: " + quotient;
		// Show two numbers
		JOptionPane.showMessageDialog(null, result, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);;
		System.exit(0);
	}
}