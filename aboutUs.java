package library.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame implements ActionListener{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("Library Management System (About Us) ");
            
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 700);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/sonu.jpg"));
            Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(500, 40, 100, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(255, 0, 0));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(160, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(255, 0, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            JLabel l6 = new JLabel("Developed By : Sonu Yadav");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JTextArea l7 = new JTextArea(" A Library management system is a software \n that uses to maintain the record of the library.\n The system helps both students and library manager .\n Library Management Systems is software that helps \n to maintain a database that is useful to enter new \n books & record books borrowed by the members, \n with the respective submission dates."); 
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 280);
            contentPane.add(l7);

            JLabel l10 = new JLabel("** Developed By Sonu Yadav**");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 550, 600, 34);
            contentPane.add(l10);
            contentPane.setBackground(Color.WHITE);
            
            JButton b2 = new JButton("Back");
            b2.addActionListener(this);
            b2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
            b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
            b2.setBounds(500, 578, 108, 33);
            b2.setBackground(Color.BLACK);
            b2.setForeground(Color.WHITE);
            contentPane.add(b2);
                
	}

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        this.setVisible(false);
	new Home().setVisible(true);
  
    }
        

}