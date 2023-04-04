import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class SwingWindow extends JFrame implements ActionListener, EventListener {
    private JPanel mainPanel;
    private JButton fightButton;
    private JButton spellsButton;
    private JButton bagButton;
    private JButton fleeButton;
    public SwingWindow() {
        setContentPane(mainPanel);
        setTitle("GUI Test");
        setSize(1000, 750);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        fightButton.addActionListener(this);
        spellsButton.addActionListener(this);
        bagButton.addActionListener(this);
        fleeButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton) {
            JButton button = (JButton) source;
            String buttonText = ((JButton) source).getText();
        }
    }

}
