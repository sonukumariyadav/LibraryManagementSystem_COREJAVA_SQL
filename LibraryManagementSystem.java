package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LibraryManagementSystem extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public LibraryManagementSystem() {
		super("Library Management System");
                setSize(1266,510);
                setLayout(null);
                setLocation(300,300);
                
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		l1 = new JLabel("");
                b1 = new JButton("Next");
                b1.setFont(new Font("Tahoma", Font.PLAIN, 35));
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
				
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/library.JPG"));
                Image i3 = i1.getImage().getScaledInstance(1366, 510,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                b1.setBounds(509, 360, 179, 39);

		l1.setBounds(0, 0, 1366, 510);
                
                l1.add(b1);
		add(l1);
                
                b1.addActionListener(this);
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login_user().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                LibraryManagementSystem window = new LibraryManagementSystem();
                window.setVisible(true);			
	}
}