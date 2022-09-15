import javax.swing.*;

public class CircleCalculations {
    public static void main(String[] args) {
        //IBIO input
        //double radius = IBIO.inputInt("Enter the radius of the circle: ");

        //JoptionPane input
        int radius = Integer.parseInt(JOptionPane.showInputDialog("Enter the radius of the circle: "));

        //area
        System.out.println("The area of the circle is: " + (Math.PI * radius * radius));
        //circumference
        System.out.println("The circumference of the circle is: " + (2 * Math.PI * radius));
        //diameter
        System.out.println("The diameter of the circle is: " + (2 * radius));

    }
}
