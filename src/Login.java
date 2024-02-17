import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JPanel panelLogin;
    private JTabbedPane loginTab;
    private JPanel Doctor;
    private JButton signUpButtonP;
    private JButton loginButtonP;
    private JTextField tcP;
    private JLabel labelTitle;
    private JPanel Patient;
    private JButton loginButtonD;
    private JTextField tcD;
    private JTextField passwordD;
    private JPasswordField passwordP;

    public Login() {
        add(panelLogin);
        setTitle("Hospital Otomation ");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        labelTitle = new JLabel(new ImageIcon("src/medicine.png"));


        loginButtonD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tcD.getText().isEmpty() || passwordD.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please fill in all fields ");
                }else{

                }
            }
        });
    }
}
