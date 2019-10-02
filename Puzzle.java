import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Puzzle extends JFrame implements ActionListener
{
     JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
     String txtb1, txtb2, txtb3, txtb4, txtb5, txtb6, txtb7, txtb8, txtb9, txtb10;
     int sc = 500 ,count = 5;
     JLabel score,countl;
     
     JPanel panel;

     Random rand = new Random();
   	 Font myFont = new Font("Tahoma",Font.BOLD,18);
     

    public Puzzle(){
        super("Puzzle Game");

        this.setSize(850, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(51, 153, 255));

        score = new JLabel("SCORE: " + sc);
        score.setBounds(10, 10, 200, 40);
        score.setForeground(Color.WHITE);
        panel.add(score);

        countl = new JLabel("count: " + count);
        countl.setBounds(750, 10, 100, 40);
        
        countl.setForeground(Color.WHITE);
        panel.add(countl);

        btn1 = new JButton();
        btn1.setBounds(rand.nextInt(700), rand.nextInt(300) , 60, 35);
        btn1.setBackground(Color.BLUE);
        btn1.addActionListener(this);
        panel.add(btn1);

        btn2 = new JButton();
        btn2.setBounds(rand.nextInt(700), rand.nextInt(300) , 60, 35);
        btn2.setBackground(Color.BLUE);
        btn2.addActionListener(this);
        panel.add(btn2);

        btn3 = new JButton();
        btn3.setBounds(rand.nextInt(700), rand.nextInt(300) , 60, 35);
        btn3.setBackground(Color.BLUE);
        btn3.addActionListener(this);
        panel.add(btn3);

        btn4 = new JButton();
        btn4.setBounds(rand.nextInt(700), rand.nextInt(300) , 60, 35);
        btn4.setBackground(Color.BLUE);
        btn4.addActionListener(this);
        panel.add(btn4);

        btn5 = new JButton();
        btn5.setBounds(rand.nextInt(700), rand.nextInt(300) , 60, 35);
        btn5.setBackground(Color.BLUE);
        btn5.addActionListener(this);
        panel.add(btn5);

        btn6 = new JButton();
        btn6.setBounds(rand.nextInt(700), rand.nextInt(300) , 60, 35);
        btn6.setBackground(Color.GREEN);
        btn6.addActionListener(this);
        panel.add(btn6);

        btn7 = new JButton();
        btn7.setBounds(rand.nextInt(700), rand.nextInt(300) , 60, 35);
        btn7.setBackground(Color.GREEN);
        btn7.addActionListener(this);
        panel.add(btn7);

        btn8 = new JButton();
        btn8.setBounds(rand.nextInt(700), rand.nextInt(300) , 60, 35);
        btn8.setBackground(Color.GREEN);
        btn8.addActionListener(this);
        panel.add(btn8);

        btn9 = new JButton();
        btn9.setBounds(rand.nextInt(700), rand.nextInt(300) , 60, 35);
        btn9.setBackground(Color.GREEN);
        btn9.addActionListener(this);
        panel.add(btn9);

        btn10 = new JButton();
        btn10.setBounds(rand.nextInt(700), rand.nextInt(300) , 60, 35);
        btn10.setBackground(Color.GREEN);
        btn10.addActionListener(this);
        panel.add(btn10);

        this.add(panel);
    }



    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==btn1)
        {
            btn1.setText("10");
            btn1.setFont(myFont);
            btn1.setForeground(Color.WHITE);
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");

           
            if(btn1.getText()==btn6.getText()){
                btn1.setVisible(false);
                btn6.setVisible(false);
                count--;
              
            }
           
            

            score.setText("SCORE: " + sc);
            countl.setText("count : "+ count);
        }

        else if(ae.getSource().equals(btn2)){
            btn2.setText("25");
            btn2.setFont(myFont);
            btn2.setForeground(Color.WHITE);
            btn1.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");

            txtb2 = btn2.getText();

            if(txtb2.equals(txtb7)){
                txtb1 = "";
                txtb3 = "";
                txtb4 = "";
                txtb5 = "";
                txtb6 = "";
                txtb8 = "";
                txtb9 = "";
                txtb10 = "";
                btn2.setVisible(false);
                btn7.setVisible(false);
                count--;
               
            }
            
         

            score.setText("SCORE: " + sc);
            countl.setText("count : "+ count);
        }

        else if(ae.getSource().equals(btn3)){
            btn3.setText("40");
            btn3.setFont(myFont);
            btn3.setForeground(Color.WHITE);
            btn1.setText("");
            btn2.setText("");
            btn4.setText("");
            btn5.setText("");

            txtb3 = btn3.getText();

            if(txtb3.equals(txtb8)){
                txtb2 = "";
                txtb1 = "";
                txtb4 = "";
                txtb5 = "";
                txtb7 = "";
                txtb6 = "";
                txtb9 = "";
                txtb10 = "";
                btn3.setVisible(false);
                btn8.setVisible(false);
                count--;
              
            }
            else
            {
            	sc-= 5;
            }
            

            score.setText("SCORE: " + sc);
            countl.setText("count : "+ count);
        }

        else if(ae.getSource().equals(btn4)){
            btn4.setText("57");
            btn4.setFont(myFont);
            btn4.setForeground(Color.WHITE);
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn5.setText("");

            txtb4 = btn4.getText();

            if(txtb4.equals(txtb9)){
                txtb2 = "";
                txtb3 = "";
                txtb1 = "";
                txtb5 = "";
                txtb7 = "";
                txtb8 = "";
                txtb6 = "";
                txtb10 = "";
                btn4.setVisible(false);
                btn9.setVisible(false);
                count--;
              
            }
            else
            {
            	sc-= 5;
            }
            

            score.setText("SCORE: " + sc);
            countl.setText("count : "+ count);
        }

        else if(ae.getSource().equals(btn5)){
            btn5.setText("99");
            btn5.setFont(myFont);
            btn5.setForeground(Color.WHITE);
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");

            txtb5 = btn5.getText();

            if(txtb5.equals(txtb10)){
                txtb2 = "";
                txtb3 = "";
                txtb4 = "";
                txtb1 = "";
                txtb7 = "";
                txtb8 = "";
                txtb9 = "";
                txtb6 = "";
                btn5.setVisible(false);
                btn10.setVisible(false);
                count--;
              
            }
            else
            {
            	sc-= 5;
            }
            

            score.setText("SCORE: " + sc);
            countl.setText("count : "+ count);
        }

        else if(ae.getSource().equals(btn6)){
            btn6.setText("10");
            btn6.setFont(myFont);
            btn6.setForeground(Color.WHITE);
            btn7.setText("");
            btn8.setText("");
            btn9.setText("");
            btn10.setText("");

            txtb6 = btn6.getText();

            if(txtb6.equals(txtb1)){
                txtb2 = "";
                txtb3 = "";
                txtb4 = "";
                txtb5 = "";
                txtb7 = "";
                txtb8 = "";
                txtb9 = "";
                txtb10 = "";
                btn1.setVisible(false);
                btn6.setVisible(false);
                count--;
              
            }
            else
            {
            	sc-= 5;
            }
            

            score.setText("SCORE: " + sc);
            countl.setText("count : "+ count);
        }

        else if(ae.getSource().equals(btn7)){
            btn7.setText("25");
            btn7.setFont(myFont);
            btn7.setForeground(Color.WHITE);
            btn6.setText("");
            btn8.setText("");
            btn9.setText("");
            btn10.setText("");

            txtb7 = btn7.getText();

            if(txtb7.equals(txtb2)){
                txtb1 = "";
                txtb3 = "";
                txtb4 = "";
                txtb5 = "";
                txtb6 = "";
                txtb8 = "";
                txtb9 = "";
                txtb10 = "";
                btn2.setVisible(false);
                btn7.setVisible(false);
                count--;
               
            }
            else
            {
            	sc-= 5;
            }
            

            score.setText("SCORE: " + sc);
            countl.setText("count : "+ count);
        }

        else if(ae.getSource().equals(btn8)){
            btn8.setText("40");
            btn8.setFont(myFont);
            btn8.setForeground(Color.WHITE);
            btn6.setText("");
            btn7.setText("");
            btn9.setText("");
            btn10.setText("");

            txtb8 = btn8.getText();

            if(txtb8.equals(txtb3)){
                txtb2 = "";
                txtb1 = "";
                txtb4 = "";
                txtb5 = "";
                txtb7 = "";
                txtb6 = "";
                txtb9 = "";
                txtb10 = "";
                btn3.setVisible(false);
                btn8.setVisible(false);
                count--;
               
            
            }
            else
            {
            	sc-= 5;
            }

            score.setText("SCORE: " + sc);
            countl.setText("count : "+ count);
        }

        else if(ae.getSource().equals(btn9)){
            btn9.setText("57");
            btn9.setFont(myFont);
            btn9.setForeground(Color.WHITE);
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn10.setText("");

            txtb9 = btn9.getText();

            if(txtb9.equals(txtb4)){
                txtb2 = "";
                txtb3 = "";
                txtb1 = "";
                txtb5 = "";
                txtb7 = "";
                txtb8 = "";
                txtb6 = "";
                txtb10 = "";
                btn4.setVisible(false);
                btn9.setVisible(false);
                count--;
               
            }
            else 
            {
            	sc-= 5;
            }

            score.setText("SCORE: " + sc);
            countl.setText("count : "+ count);
        }

        else if(ae.getSource().equals(btn10)){
            btn10.setText("99");
            btn10.setFont(myFont);
            btn10.setForeground(Color.WHITE);
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText("");

            txtb10 = btn10.getText();

            if(txtb10.equals(txtb5)){
                txtb2 = "";
                txtb3 = "";
                txtb4 = "";
                txtb1 = "";
                txtb7 = "";
                txtb8 = "";
                txtb9 = "";
                txtb6 = "";
                btn5.setVisible(false);
                btn10.setVisible(false);
                count--;
            
            }
            else
            {
            	sc-= 5;
            }

            score.setText("SCORE: " + sc);
            countl.setText("count : "+ count);
        }

        else{}

       
        if(count == 0){
            Repeat r = new Repeat();
            r.setVisible(true);
            this.setVisible(false);
        }
    }      
}

//***************************************************//
//                    GAME BUG 
//**************************************************//
//1.Clicking the green button first reduces to 5. But blue button does not cause this problems
//At the end, sometimes it is necessary to click twice.