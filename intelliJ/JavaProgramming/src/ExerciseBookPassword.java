import javax.swing.*;

public class ExerciseBookPassword {
    public static void main(String[] args) {
        String userPassInput = "";
        String pass = "Hello World!";
        int attempts = 0;

        while (attempts < 3){
            userPassInput = JOptionPane.showInputDialog("Enter the password: ");
            if (userPassInput.equals(pass)){
                JOptionPane.showMessageDialog(null, "Welcome!");
                attempts = 10;
            } else {
                System.out.println("The password you typed is incorrect.");
                attempts ++;
                if (attempts == 3) {
                    JOptionPane.showMessageDialog(null, "Access denied!");
                }
            }
        }
    }
}
