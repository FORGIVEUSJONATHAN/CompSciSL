package Graphics;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
public class GUI extends JFrame{
    public static void main(String[]args){
        new GUI();
    }
    public GUI(){
        this.setSize(600,600);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        int xPos =(dim.width/2)-(this.getWidth()/2);
        int yPos =(dim.height/2)-(this.getHeight()/2);
        this.setLocation(xPos,yPos);

        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Duang");


        JPanel thePanel = new JPanel();
        JLabel theLabel = new JLabel();
        theLabel.setText("agifusfkjfsofhfgiusfgwofihweifhweoifhwehfweiofhwehfowofwheof");

        theLabel.setToolTipText("Spring Festival");
        thePanel.add(theLabel);

        JButton Button1 = new JButton("nihao");
        thePanel.add(Button1);
        Button1.setBorderPainted(true);
        Button1.setContentAreaFilled(true);
        Button1.setText("New Button");
        this.add(thePanel);
        this.setVisible(true);

    }
}
