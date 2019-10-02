import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Repeat extends JFrame implements ActionListener
{
     JLabel label;
     JButton yes, no;
     Font fnt;
     JPanel panel;

    public Repeat(){
        super("AGAIN Window");

        this.setSize(850, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(51, 153, 255));

        label = new JLabel("Do you want to play again?");
        label.setBounds(250, 50, 400, 60);
        label.setFont(new Font("Tahoma", Font.BOLD, 25));
        label.setForeground(Color.WHITE);
        panel.add(label);

        fnt = new Font("Tahoma",Font.BOLD | Font.ITALIC,20);

        yes = new JButton("YES");
		yes.setBounds(250, 180, 100, 45);
		yes.setFont(fnt);
		yes.setBackground(Color.GREEN);
        yes.setForeground(Color.WHITE);
        yes.addActionListener(this);
		panel.add(yes);

		no = new JButton("NO");
		no.setBounds(370, 180, 100, 45);
		no.setFont(fnt);
		no.setBackground(Color.RED);
        no.setForeground(Color.WHITE);
        no.addActionListener(this);
		panel.add(no);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae){
        String command = ae.getActionCommand();

        if(command.equals(yes.getText())){
            Puzzle p = new Puzzle();
            p.setVisible(true);
            this.setVisible(false);
        }

        else if(command.equals(no.getText())){
            System.exit(0);
        }

        else{}
    }
}