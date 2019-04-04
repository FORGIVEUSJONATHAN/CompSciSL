package GUi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JButton CPrecentage;
    private JButton countIBGButton;
    private JPanel Student;
    private JButton clearButton;
    private JButton exitButton;

    String Name;
    int StudentNo;
    int[] score = new int [4];
    double prencent;
    int IBG;

    public Student(){


        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                textField6.setText("");
                textField7.setText("");
            }
        });
        countIBGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float test1,test2,test3,test4,grade,ibg;
                test1 = Float.parseFloat(textField2.getText());
                test2 = Float.parseFloat(textField3.getText());
                test3 = Float.parseFloat(textField4.getText());
                test4 = Float.parseFloat(textField5.getText());
                grade = (test1+test2+test3+test4)/4;
                if(grade>=90){
                    ibg = 7;
                }else if(grade<90 && grade>=80){
                    ibg = 6;
                }else if(grade<80 && grade>=70){
                    ibg = 5;
                }else if(grade<70 && grade>=60){
                    ibg = 4;
                }else if(grade<60 && grade>=50){
                    ibg = 3;
                }else if(grade<50 && grade>=40){
                    ibg = 2;
                }else{
                    ibg = 1;
                }
                textField7.setText(String.valueOf(ibg));
            }
        });

        CPrecentage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float test1,test2,test3,test4,grade;
                test1 = Float.parseFloat(textField2.getText());
                test2 = Float.parseFloat(textField3.getText());
                test3 = Float.parseFloat(textField4.getText());
                test4 = Float.parseFloat(textField5.getText());
                grade = ((test1+test2+test3+test4)/4)/100;
                textField6.setText(String.valueOf(grade));
            }
        });
    }
    public static void main(String[] args){
        JFrame frame = new JFrame ("Student");
        frame.setContentPane(new Student().Student);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


