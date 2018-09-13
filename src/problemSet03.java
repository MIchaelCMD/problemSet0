/* This calculates tax based on two bands of income
    It prints out the user's name, gross income and net income
 */

import javax.swing.*;

public class problemSet03 {
    public static void main(String[] args) {

     String userName, grossIncomeAS;
     double grossIncome = 0, taxRemoved = 0,netIncome = 0;


        userName = JOptionPane.showInputDialog("Enter your Name: ");
        grossIncomeAS = JOptionPane.showInputDialog("Enter your taxable income: ");

        grossIncome = Double.parseDouble(grossIncomeAS);

        if(grossIncome <= 20000.00)
        {
            JOptionPane.showMessageDialog(null,"Your name is " + userName + "\n" +
                   "Your tax rate is 0%." +
                    "Your total tax is EUR0.00" +
                   "Your net income after tax was removed is: " +
                    netIncome,"Tax Information",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(grossIncome > 20000.02 && grossIncome <= 36000.00)
        {
            taxRemoved = (grossIncome * 0.20);

            netIncome = grossIncome + taxRemoved;

            JOptionPane.showMessageDialog(null,"Name: " + userName + "\n" +
                    "Gross income: " + grossIncome + "\n" +
                    "Tax Rate: 20% \n" +
                    "Income after tax: " + netIncome);
        }
        else
        {
            taxRemoved = (36000.00 * 0.20) + ((grossIncome - 36000.00) * 0.41);

            netIncome = grossIncome - taxRemoved;

            JOptionPane.showMessageDialog(null,"Name: " + userName + "\n" +
                    "Gross Income: " + grossIncome + "\n" +
                    "Tax Rate: 20% on EUR36,000.00 + 41% on remainder" + "\n" +
                    "Net Income after Tax: " + netIncome + "\n","Tax Information",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
