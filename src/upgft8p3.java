import javax.swing.*;

public class upgft8p3 {
    public static void main(String[] args) {
        while (true) {
            String s = JOptionPane.showInputDialog("Talet?");
            if (s == null)
                break;

            int talet = Integer.parseInt(s);
            boolean ärPrimtal = true;

            for (int k = 2; k < talet; k++) {
                if (talet % k == 0) {
                    ärPrimtal = false;
                    break;
                }
            }
            if (ärPrimtal)
                JOptionPane.showMessageDialog(null, "Primtal");
            else
                JOptionPane.showMessageDialog(null, "Ej primtal");

        }
    }
}
