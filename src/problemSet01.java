import javax.swing.JOptionPane;

public class problemSet01 {
    public static void main(String[] args) {

        String name = "", amountWantedAS = "", className = "";
        int amountWanted = 0;
        final float SNACK_PRICE = 2;

        /* Information taken in */
        name = JOptionPane.showInputDialog("Enter your name: ");
        className = JOptionPane.showInputDialog("Enter you class name: ");
        amountWantedAS = JOptionPane.showInputDialog("How many snacks do you want? ");

        /* String to Int */
        amountWanted = Integer.parseInt(amountWantedAS);

        JOptionPane.showMessageDialog(null,"Name: " + name + "\n" +
                                                                    "Class: " + className + "\n" +
                                                                    "Snacks wanted: " + amountWanted + "\n" +
                                                                    "Total Cost = " + (SNACK_PRICE * amountWanted));
    }
}
