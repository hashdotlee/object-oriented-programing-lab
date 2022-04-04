import javax.swing.JOptionPane;
import java.lang.Math;
public class SolveEquations {
	public static void FirstDegreeEquation(double a, double b) {
		double result = -b/a;
		JOptionPane.showMessageDialog(null, "Result: " + result, "First Degree Equation", JOptionPane.INFORMATION_MESSAGE);
	}
	public static void SecondDegreeEquation(double a, double b, double c) {
		double delta = b*b-4*a*c;
		double result1 = (-b+Math.sqrt(delta))/(2*a);
		double result2 = (-b-Math.sqrt(delta))/(2*a);
		JOptionPane.showMessageDialog(null, "Result1: " + result1 + "\n" + "Result2: "+ result2, "Second Degree Equation", JOptionPane.INFORMATION_MESSAGE);
	}
	public static void FirstDegreeSysEquation(double a11, double a12, double a22, double a21, double b1, double b2) {
		double D = a11*a22-a21*a12;
		double D1 = b1*a22 - b2*a12;
		double D2 = a11*b2-a21*b1;
		if(D != 0) {
			double result1 = D1/D;
			double result2 = D2/D;
			JOptionPane.showMessageDialog(null, "Result1: " + result1 + "\n" + "Result2: "+ result2, "First Degree Sys of Equations", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Infinite solution!", "First Degree Sys of Equations", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public static void main(String args[]) {
		String menu = "Menu: \n";
		menu += "1: First Degree Equation\n";
		menu += "2: Second Degree Equation\n";
		menu += "3: First Degree Sys of Equations\n";
		menu += "Enter your choice: ";
		String option = JOptionPane.showInputDialog(null, menu, "Solve Equations", JOptionPane.INFORMATION_MESSAGE);
		switch (option) {
			case "1":
				FirstDegreeEquation(2,3);
				break;
			case "2":
				SecondDegreeEquation(1,2,1);
				break;
			case "3":
				FirstDegreeSysEquation(1,2,3,4,5,6);
				break;
			default:
				break;
		}
	}
}