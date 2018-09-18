import javax.swing.JOptionPane;

public class problemSet04 {
    public static void main(String[] args) {

        int newNum = 0, count = 1, total = 0;

        // String newNumAS = "";

        String newNumAS = JOptionPane.showInputDialog("Enter a number (q to quit): ");

        while (!newNumAS.equals("q"))
        {
            if(!newNumAS.equals("q"))
            count++;
            newNumAS = JOptionPane.showInputDialog("Enter number " + count + "(q to quit): ");
            newNum = Integer.parseInt(newNumAS);
            total = total + newNum;
            else
                break;
        }

        while (newNumAS.equals("q"))
        {
            if(count > 1)
            {
                JOptionPane.showMessageDialog(null, "The total of all numbers is " + total +
                        "\nThe amount of numbers entered is " + count, "Finish", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You did not enter any number. Baiiiiii!", "Baii", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }

    }
}
