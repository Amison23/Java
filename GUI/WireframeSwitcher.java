import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WireframeSwitcher extends JFrame {
    private JPanel panel1;
    private JPanel panel2;

    public WireframeSwitcher() {
        setTitle("Wireframe Switcher");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating two panels representing the wireframes
        panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel2 = new JPanel();
        panel2.setBackground(Color.BLUE);

        // Create a button to switch between wireframes
        JButton switchButton = new JButton("Switch");
        switchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Toggle the visibility of the panels
                panel1.setVisible(!panel1.isVisible());
                panel2.setVisible(!panel2.isVisible());
            }
        });

        // Add components to the content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(panel1, BorderLayout.CENTER);
        contentPane.add(panel2, BorderLayout.CENTER);
        contentPane.add(switchButton, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                WireframeSwitcher wireframeSwitcher = new WireframeSwitcher();
                wireframeSwitcher.setVisible(true);
            }
        });
    }
}
