import javax.swing.*;

public class problemSet02 {
    public static void main(String[] args) {

        String cyclistName, initial, lastName, distanceAS, fullName = "";
        final double sponserU10 = 0.07, sponserO10 = 0.10;
        float distance = 0;
        double totalU10 = 0, totalO10 = 0, total = 0;

        cyclistName = JOptionPane.showInputDialog("Enter you name: ");
        initial = JOptionPane.showInputDialog("Enter you initial: ");
        lastName = JOptionPane.showInputDialog("Enter your last name: ");
        distanceAS = JOptionPane.showInputDialog("Enter the distance you cycled to one decimal place: ");

        distance = Float.parseFloat(distanceAS);

        if(distance <= 10)
        {
            totalU10 = sponserU10 * distance;
        }
        else
        {
            distance = (distance - 10);

            totalO10 = sponserO10 * distance;
        }

        total = (totalO10 + totalU10);

        fullName = (cyclistName + "." + initial + "." + lastName);

        JOptionPane.showMessageDialog(null,"Name: " + fullName + "\n" +
                                                                    "Distance Cycled: " + distanceAS + "\n" +
                                                                    "Money due from Sponser = " + String.format("%.2f",total));
    }
}
