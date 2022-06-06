import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculatorTest extends JFrame implements ActionListener {
    private JPanel textPanel, buttonPanel;
    private JButton sinButton, cosButton, addButton, subtractButton, multiplyButton, divideButton, delButton, calculateButton, clearButton;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private JButton powButton, squareButton, logButton, remainButton, log10Button;
    private JTextField textField;
    private JLabel labelTextField;

    private String operator, ilksayi;
    private float sonuc;

    public String getOperator() {return operator;}
    public void setOperator(String operator) {this.operator = operator;}
    public String getIlksayi() {return ilksayi;}
    public void setIlksayi(String ilksayi) {this.ilksayi = ilksayi;}
    public float getSonuc() {return sonuc;}
    public void setSonuc(float sonuc) {this.sonuc = sonuc;}


    public calculatorTest() {


        super("Calculator");

        setLayout(new BorderLayout());
        textPanel = new JPanel();

        textPanel.setLayout(new GridLayout(2, 1));
        textPanel.setBorder(new TitledBorder("textField"));
        textPanel.setBackground(Color.PINK); //derste görmedik

        labelTextField = new JLabel();
        labelTextField.setPreferredSize(new Dimension(400, 50)); // derste görmedik

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(400, 70)); //derste görmedik


        textPanel.add(labelTextField);
        textPanel.add(textField);

        add(textPanel);
        add(textPanel, BorderLayout.NORTH);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 4));

        buttonPanel.setBorder(new TitledBorder("buttonField"));
        buttonPanel.setPreferredSize(new Dimension(400, 200));


        sinButton = new JButton("sin");
        cosButton = new JButton("cos");
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        delButton = new JButton("<-");
        calculateButton = new JButton("=");
        clearButton = new JButton("C");

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");


        powButton = new JButton("x^2");
        squareButton = new JButton("x^1/2");
        logButton = new JButton("log e");
        log10Button = new JButton("log10");
        remainButton = new JButton("%");
      


        buttonPanel.add(sinButton);
        buttonPanel.add(cosButton);
        buttonPanel.add(logButton);
        buttonPanel.add(log10Button);

        buttonPanel.add(powButton);
        buttonPanel.add(squareButton);
        buttonPanel.add(remainButton);
        buttonPanel.add(divideButton);

        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(multiplyButton);

        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(subtractButton);

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(addButton);

        buttonPanel.add(delButton);
        buttonPanel.add(button0);
        buttonPanel.add(clearButton);
        buttonPanel.add(calculateButton);


        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);


        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        remainButton.addActionListener(this);

        delButton.addActionListener(this);
        clearButton.addActionListener(this);
        calculateButton.addActionListener(this);

        log10Button.addActionListener(this);
        logButton.addActionListener(this);
        sinButton.addActionListener(this);
        cosButton.addActionListener(this);
        powButton.addActionListener(this);
        squareButton.addActionListener(this);


        add(buttonPanel, BorderLayout.SOUTH);


        setVisible(true);
        setLocationRelativeTo(null);
        setSize(300, 400);
    }


    public static void main(String[] args) {
        new calculatorTest();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        float num1, num2;
        String newValue;


        if (event.getSource() == clearButton) {
            textField.setText(" ");
            labelTextField.setText("");}
        
        else if (event.getSource() == button0) {
            textField.setText(textField.getText() + "0");
        } else if (event.getSource() == button1) {
            textField.setText(textField.getText() + "1");
        } else if (event.getSource() == button2) {
            textField.setText(textField.getText() + "2");
        } else if (event.getSource() == button3) {
            textField.setText(textField.getText() + "3");
        } else if (event.getSource() == button4) {
            textField.setText(textField.getText() + "4");
        } else if (event.getSource() == button5) {
            textField.setText(textField.getText() + "5");
        } else if (event.getSource() == button6) {
            textField.setText(textField.getText() + "6");
        } else if (event.getSource() == button7) {
            textField.setText(textField.getText() + "7");
        } else if (event.getSource() == button8) {
            textField.setText(textField.getText() + "8");
        } else if (event.getSource() == button9) {
            textField.setText(textField.getText() + "9");
        } else if (event.getSource() == addButton) {
            setIlksayi(textField.getText());
            setOperator("+");
            textField.setText(textField.getText() + "+");
            labelTextField.setText(textField.getText() + getOperator());
            textField.setText("");
        } else if (event.getSource() == subtractButton) {
            setIlksayi(textField.getText());
            setOperator("-");
            textField.setText(textField.getText() + "-");
            int text = Integer.parseInt(textField.getText());
            labelTextField.setText(text + getOperator());
            textField.setText("");
        } else if (event.getSource() == multiplyButton) {
            setIlksayi(textField.getText());
            setOperator("*");
            int text = Integer.parseInt(textField.getText());
            labelTextField.setText(text + getOperator());
            textField.setText(textField.getText() + "*");
            textField.setText("");
        } else if (event.getSource() == divideButton) {
            setIlksayi(textField.getText());
            setOperator("/");
            int text = Integer.parseInt(textField.getText());
            labelTextField.setText(text + getOperator());
            textField.setText(textField.getText() + "/");
            textField.setText("");
        } else if (event.getSource() == remainButton) {
            setIlksayi(textField.getText());
            setOperator("%");
            labelTextField.setText(textField.getText() + getOperator());
            textField.setText(textField.getText() + "%");
            textField.setText("");
        }
        

        else if (event.getSource() == delButton) {
            int textLength = textField.getText().length();
            if (textLength > 0) {
                textField.setText(textField.getText().substring(0, textLength - 1));
            }
        }
        else if (event.getSource() == sinButton) {
            num1 = Float.valueOf(textField.getText());
            newValue = String.valueOf(Math.sin(num1));
            labelTextField.setText("sin" + textField.getText() + " = " + newValue);
            textField.setText(newValue);
        } else if (event.getSource() == cosButton) {
            num1 = Float.valueOf(textField.getText());
            newValue = String.valueOf(Math.cos(num1));
            labelTextField.setText("cos" + textField.getText() + " =" + newValue);
            textField.setText(newValue);
        } else if (event.getSource() == powButton) {
            num1 = Float.valueOf(textField.getText());
            newValue = String.valueOf(Math.pow(num1, 2));
            labelTextField.setText(textField.getText() + "^2 = " + newValue);
            textField.setText(newValue);
        } else if (event.getSource() == squareButton) {
            num1 = Float.valueOf(textField.getText());
            newValue = String.valueOf(Math.sqrt(num1));
            labelTextField.setText(textField.getText() + "^(1/2) = " + newValue);
            textField.setText(newValue);
        } else if (event.getSource() == log10Button) {
            num1 = Float.valueOf(textField.getText());
            newValue = String.valueOf(Math.log10(num1));
            labelTextField.setText("log10" + textField.getText() + " = " + newValue);
            textField.setText(newValue);
        } else if (event.getSource() == logButton) {
            num1 = Float.valueOf(textField.getText());
            newValue = String.valueOf(Math.log(num1));
            labelTextField.setText("log e" + textField.getText() + " = " + newValue);
            textField.setText(newValue);
        }


        else if (event.getSource() == calculateButton) {
            String operator = getOperator();

            num1 = Float.parseFloat(getIlksayi());
            num2 = Float.parseFloat(textField.getText());


            if (operator == "+") {
                setSonuc(num1 + num2);
                newValue = String.valueOf(getSonuc());
                textField.setText(newValue);
            } else if (operator == "-") {
                setSonuc(num1 - num2);
                newValue = String.valueOf(getSonuc());
                textField.setText(newValue);
            } else if (operator == "*") {
                setSonuc(num1 * num2);
                newValue = String.valueOf(getSonuc());
                textField.setText(newValue);
            } else if (operator == "/") {
                setSonuc(num1 / num2);
                newValue = String.valueOf(getSonuc());
                textField.setText(newValue);
            } else if (operator == "%") {
                setSonuc(num1 % num2);
                newValue = String.valueOf((int) getSonuc()); // kalanımız ondalıklı olmasın diye
                textField.setText(newValue);

                labelTextField.setText(num1 + getOperator() + num2 + " = " + getSonuc());
            }

        }
    }
}
