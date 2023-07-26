package com.calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temp extends JFrame implements ActionListener {
    JButton btn,label1;

    JComboBox box1,box2;

    JTextField t1,t2;

    Container c;
    Temp(){
        super("Calculator");

        JPanel panel=new JPanel();
        panel.setBounds(0,0,400,30);
        panel.setBackground(Color.yellow);
        add(panel);

        c=getContentPane();
        c.setBackground(Color.PINK);

        JLabel label=new JLabel("Calculator");
        label.setBounds(0,0,400,25);
        label.setFont(new Font("Arial",Font.BOLD,20));
        panel.add(label);

        JLabel labell=new JLabel("Temperature");
        labell.setBounds(2,35,400,25);
        labell.setFont(new Font("Arial",Font.BOLD,20));
        add(labell);


        JButton btn=new JButton("---");
        btn.setBounds(0,1,35,30);
        btn.setBackground(Color.CYAN);
        btn.setFont(new Font("Arial",Font.BOLD,20));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(btn);

        String angle1[]={"Celsius","Fahrenheit","Kelvin"};
        box1=new JComboBox(angle1);
        box1.setBounds(15,110,120,25);
        box1.setFont(new Font("Arial",Font.BOLD,16));
        box1.addActionListener(this);
        add(box1);

        String angle2[]={"Celsius","Fahrenheit","Kelvin"};
        box2=new JComboBox(angle2);
        box2.setBounds(15,180,120,25);
        box2.setFont(new Font("Arial",Font.BOLD,16));
        box2.addActionListener(this);
        add(box2);


        label1=new JButton("Convert");
        label1.setBounds(215,170,100,30);
        label1.setFont(new Font("Arial",Font.BOLD,14));
        label1.setBackground(Color.MAGENTA);
        label1.addActionListener(this);
        add(label1);

        t1=new JTextField();
        t1.setBounds(180,220,170,40);
        t1.setFont(new Font("Arial",Font.BOLD,20));
        t1.setEditable(false);
        add(t1);

        t2=new JTextField();
        t2.setBounds(200,450,150,35);
        t2.setFont(new Font("Arial",Font.BOLD,20));
        add(t2);

        JLabel label2=new JLabel("Enter the number to convert:");
        label2.setBounds(10,455,250,20);
        label2.setFont(new Font("Arial",Font.BOLD,12));
        add(label2);


        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==btn){
                    JWindow w=new JWindow();
                    Container c=w.getContentPane();
                    c.setBackground(Color.cyan);

                    JPanel panel11=new JPanel();
                    panel11.setBounds(0,0,400,30);
                    panel11.setBackground(new Color(231, 57, 57));
                    w.add(panel11);

                    JButton exit=new JButton("x");
                    exit.setBounds(105,30,45,30);
                    exit.setFont(new Font("Arial",Font.BOLD,20));
                    w.add(exit);

                    exit.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            w.dispose();
                        }
                    });

                    JLabel label1=new JLabel("Calculator");
                    label1.setBackground(Color.BLACK);
                    label1.setBounds(5,40,100,20);
                    label1.setFont(new Font("Arial",Font.BOLD,14));
                    w.add(label1);

                    JButton button1=new JButton("Standard");
                    button1.setBounds(15,80,100,25);
                    button1.setForeground(Color.RED);
                    button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    w.add(button1);
                    button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setInvisible();
                            new Cal();
                        }
                    });

                    JButton button2=new JButton("Scientific");
                    button2.setBounds(15,120,100,25);
                    button2.setForeground(Color.RED);
                    button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    w.add(button2);
                    button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JOptionPane.showMessageDialog(null,"this button is not working");
                        }
                    });


                    JLabel label2=new JLabel("Converter");
                    label2.setBackground(Color.BLACK);
                    label2.setBounds(5,170,100,20);
                    label2.setFont(new Font("Arial",Font.BOLD,14));
                    w.add(label2);

                    JButton length=new JButton("Length");
                    length.setBounds(15,210,110,25);
                    length.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    length.setForeground(Color.RED);
                    w.add(length);
                    length.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JOptionPane.showMessageDialog(null,"this button is not working");
                        }
                    });

                    JButton temp=new JButton("Temperature");
                    temp.setBounds(15,250,110,25);
                    temp.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    temp.setForeground(Color.RED);
                    w.add(temp);
                    temp.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setInvisible();
                            new Temp();
                        }
                    });

                    JButton angle=new JButton("Angle");
                    angle.setBounds(15,290,110,25);
                    angle.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    angle.setForeground(Color.RED);
                    w.add(angle);
                    angle.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setInvisible();
                            new Angle();
                        }
                    });

                    JButton energy=new JButton("Energy");
                    energy.setBounds(15,330,110,25);
                    energy.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    energy.setForeground(Color.RED);
                    w.add(energy);
                    energy.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setInvisible();
                            new Energy();
                        }
                    });

                    JButton power=new JButton("Power");
                    power.setBounds(15,370,110,25);
                    power.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    power.setForeground(Color.RED);
                    w.add(power);
                    power.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setInvisible();
                            new Power();
                        }
                    });


                    w.setLayout(null);
                    w.setSize(150,513);
                    w.setLocation(588,163);
                    w.setVisible(true);
                }
            }

            private void setInvisible() {
                setVisible(false);
            }
        });
        setLayout(null);
        setSize(375,550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Temp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (box1.getSelectedItem()==box2.getSelectedItem()){
           JOptionPane.showMessageDialog(null,"Same thing to same thing conversion is not possible");
       } else if (box1.getSelectedItem()=="Celsius" && box2.getSelectedItem()=="Fahrenheit") {
           try{
               double a= Double.parseDouble(t2.getText());
               double b=a*33.8;
               t1.setText(String.valueOf(b));
           }catch (Exception e1){
               
           }
       } else if (box1.getSelectedItem()=="Celsius" && box2.getSelectedItem()=="Kelvin") {
           try{
               double a= Double.parseDouble(t2.getText());
               double b=a*274.15;
               t1.setText(String.valueOf(b));
           }catch (Exception e1){

           }
       } else if (box1.getSelectedItem()=="Fahrenheit" && box2.getSelectedItem()=="Celsius") {
           try{
               double a= Double.parseDouble(t2.getText());
               double b=a*(-17.22222);
               t1.setText(String.valueOf(b));
           }catch (Exception e1){

           }
       } else if (box1.getSelectedItem()=="Fahrenheit" && box2.getSelectedItem()=="Kelvin") {
           try{
               double a= Double.parseDouble(t2.getText());
               double b=a*255.9278;
               t1.setText(String.valueOf(b));
           }catch (Exception e1){

           }
       } else if (box1.getSelectedItem()=="Kelvin" && box2.getSelectedItem()=="Celsius") {
           try{
               double a= Double.parseDouble(t2.getText());
               double b=a*(-272.15);
               t1.setText(String.valueOf(b));
           }catch (Exception e1){

           }
       } else if (box1.getSelectedItem()=="Kelvin" && box2.getSelectedItem()=="Fahrenheit") {
           try{
               double a= Double.parseDouble(t2.getText());
               double b=a*(-257.87);
               t1.setText(String.valueOf(b));
           }catch (Exception e1){

           }
       }
    }
}

