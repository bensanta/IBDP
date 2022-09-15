import javax.swing.*;

public class InputGUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Welcome to Computer Science Class, " +name);
    }
}
