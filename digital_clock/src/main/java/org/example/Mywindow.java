package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mywindow extends JFrame
{   private  JLabel heading;
    private JLabel clockLabel;
    private Font font=new Font("Almeria",Font.BOLD,35);
    Mywindow(){
        super.setTitle("My Clock");
        super.setSize(600,400);
        super.setLocation(300,15);
        this.createGUI();
        super.setVisible(true);
        this.startClock();


    }
    public void createGUI(){

        heading=new JLabel("My Clock");
        clockLabel=new JLabel("DATE,TIME!!!");
        heading.setFont(font);
        heading.setLocation(200,100);
        clockLabel.setFont(font);
        clockLabel.setLocation(200,100);
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);
        this.setBackground(Color.cyan);
    }
    public void startClock(){
        Timer timer=new Timer(1000, new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
               // String dateTime=new Date().toString();
                String dateTime = new Date().toLocaleString();
                Date d=new Date();
                SimpleDateFormat sfd=new SimpleDateFormat("hh : mm : ss a");
                 dateTime=sfd.format(d);
                clockLabel.setText(dateTime);
            }
        });

        timer.start();
    }

}
