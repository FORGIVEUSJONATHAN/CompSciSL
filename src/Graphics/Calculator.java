package Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator{
    private JPanel panel1;
    private JButton Subtraction;
    private JButton Addition;
    private JButton Multiplication;
    private JButton Division;
    private JButton Clear;
    private JButton Exit;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField1;

    public Calculator() {

        Addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2;
                num1= Float.parseFloat(textField1.getText());
                num2= Float.parseFloat(textField2.getText());
                float result=num1+num2;
                textField3.setText(String.valueOf(result));
            }
        });
        Subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2;
                num1= Float.parseFloat(textField1.getText());
                num2= Float.parseFloat(textField2.getText());
                float result=num1-num2;
                textField3.setText(String.valueOf(result));

            }
        });
        Multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2;
                num1= Float.parseFloat(textField1.getText());
                num2= Float.parseFloat(textField2.getText());
                float result=num1*num2;
                textField3.setText(String.valueOf(result));

            }
        });
        Division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2;
                num1= Float.parseFloat(textField1.getText());
                num2= Float.parseFloat(textField2.getText());
                float result=num1/num2;
                textField3.setText(String.valueOf(result));
            }
        });
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");

            }
        });
        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

        public static void main(String[]args){
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane( new Calculator().panel1);
        frame.pack();
        frame.setVisible(true);
        }



}
