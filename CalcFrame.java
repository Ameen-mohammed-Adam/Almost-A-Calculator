import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CalcFrame extends JFrame implements ActionListener {

    private JLabel label = new JLabel();
    private ImageIcon k = new ImageIcon();
    // private JPanel NumbersPanel = new JPanel();
    private JTextField textField = new JTextField();
    JPanel NumbersPanel = new JPanel();
    JPanel PagePanle = new JPanel();

    public CalcFrame() {
        //================================== Jframe =======================================
        setTitle("MyCalculator");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 420);
        setLocationRelativeTo(null);
        add(PagePanle);

        // ================================= Buttons ======================================
        Buttons btn0 = new Buttons("0");
        Buttons btn1 = new Buttons("1");
        Buttons btn2 = new Buttons("2");
        Buttons btn3 = new Buttons("3");
        Buttons btn4 = new Buttons("4");
        Buttons btn5 = new Buttons("5");
        Buttons btn6 = new Buttons("6");
        Buttons btn7 = new Buttons("7");
        Buttons btn8 = new Buttons("8");
        Buttons btn9 = new Buttons("9");
        Buttons btnPlus = new Buttons("+");
        Buttons btnMinus = new Buttons("-");
        Buttons btnMultiply = new Buttons("*");
        Buttons btnDivide = new Buttons("/");
        Buttons btnClear = new Buttons("Clear");
        Buttons btnEquals = new Buttons("=");
        Buttons btnDel = new Buttons("Del");
        Buttons btnHello = new Buttons("Del");

        // ================================= JTextField ==================================
        textField.setBounds(100,100, 300, 300);
        // textField.setEditable(false);
        textField.setVisible(true);
        textField.setBackground(Color.WHITE);
        textField.setForeground(Color.WHITE);

        
        // ================================= Panels ======================================
        NumbersPanel.setBackground(Color.BLACK);
        NumbersPanel.setBounds(0,0,300, 300);
        NumbersPanel.setLayout(new GridLayout(3,3));
        NumbersPanel.add(btn1);
        NumbersPanel.add(btn2);
        NumbersPanel.add(btn3);
        NumbersPanel.add(btn4);
        NumbersPanel.add(btn5);
        NumbersPanel.add(btn6);
        NumbersPanel.add(btn7);
        NumbersPanel.add(btn8);
        NumbersPanel.add(btn9); 

        PagePanle.add(NumbersPanel);
        PagePanle.setBackground(Color.GRAY);
        PagePanle.add(textField);



    }







    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }









    public static void main(String[] args) {
        new CalcFrame();
    }










    
}
