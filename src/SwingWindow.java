import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventListener;

public class SwingWindow extends JFrame implements ActionListener, EventListener, KeyListener {
    private JPanel mainPanel;
    private JButton fightButton;
    private JButton spellsButton;
    private JButton bagButton;
    private JButton fleeButton;
    private JTextArea inputArea;

    public SwingWindow() {
        setContentPane(mainPanel);
        setTitle("GUI Test");
        setSize(1000, 750);
        setLocation(400,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        fightButton.addActionListener(this);
        spellsButton.addActionListener(this);
        bagButton.addActionListener(this);
        fleeButton.addActionListener(this);
        inputArea.addKeyListener(this);
        inputArea.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton) {
            JButton button = (JButton) source;
            String buttonText = button.getText();

            if (buttonText.equals("Fight")) {
                inputArea.setText("fight");
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyChar() == 'w') {
            inputArea.setText("UP");
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyChar() == 's') {
            inputArea.setText("DOWN");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyChar() == 'a') {
            inputArea.setText("LEFT");
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyChar() == 'd') {
            inputArea.setText("RIGHT");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
