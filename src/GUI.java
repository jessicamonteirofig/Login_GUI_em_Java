import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;


    public static void main(String[] args) {

        JPanel panel = new JPanel();

        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("Usuario");
        userLabel.setBounds(20, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Senha");
        passwordLabel.setBounds(20, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(20, 90, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel();
        success.setBounds(20, 120, 300, 25);
        panel.add(success);


        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String Usuario = userText.getText();
        String Senha = passwordText.getText();

        if (Usuario.equals("Jessica") && Senha.equals("Jessica123")){
            success.setText("Login bem sucedido!");
        } else {
            success.setText("Login incorreto!");
        }
}
}