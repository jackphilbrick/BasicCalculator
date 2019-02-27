package jackphilbrick;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BasicCalculator {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("hi");
		
		String question = JOptionPane.showInputDialog("Please enter the calculation");
		String moddedQ = question.replace(" ", "");
		boolean found = false;
		int i = 0;
		char operator = ' ';
		while(found == false && i < moddedQ.length()){
			if(moddedQ.charAt(i) == '+' || moddedQ.charAt(i) == '-' || moddedQ.charAt(i) == '*' || moddedQ.charAt(i) == '/'){
				operator = moddedQ.charAt(i);
				found = true;
			}
			else{
				i++;
			}
		}
		/* Negative Numbers - in next implement
		 * 
		double firstNum = 0.0;
		String firstNumNum = moddedQ.substring(0, moddedQ.indexOf(operator));
		if(firstNumNum.contains("-")){
			firstNum = Double.parseDouble("-"+1);
			firstNum = -1 * firstNum;
		}
		*/
		double firstNum = Double.parseDouble(moddedQ.substring(0, moddedQ.indexOf(operator)));
		double secondNum = Double.parseDouble(moddedQ.substring(moddedQ.indexOf(operator) + 1));
		double solution = 0;
		switch(operator){
		case '+': solution = firstNum + secondNum;
		break;
		case '-': solution = firstNum - secondNum;
		break;
		case '*': solution = firstNum * secondNum;
		break;
		case '/': solution = firstNum / secondNum;
		break;
		}
		
		JOptionPane.showMessageDialog(frame, "The answer is: " + solution);
		
	}

}

