package com.calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cal extends JFrame implements ActionListener {
     JButton  btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,dot,backspace,add,sub,mult,div;

     JTextField field;

     double first;
     double second;

     double result;
     String operaion;

     String answer;

    Cal(){
        super("Calculator");

        JPanel panel=new JPanel();
        panel.setBounds(0,0,400,30);
        panel.setBackground(Color.yellow);
        add(panel);

        JLabel label=new JLabel("Calculator");
        label.setBounds(0,0,400,25);
        label.setFont(new Font("Arial",Font.BOLD,20));
        panel.add(label);

        JLabel labell=new JLabel("Standard");
        labell.setBounds(2,35,400,25);
        labell.setFont(new Font("Arial",Font.BOLD,20));
        add(labell);

        JButton btn=new JButton("---");
        btn.setBounds(0,1,35,30);
        btn.setBackground(Color.CYAN);
        btn.setFont(new Font("Arial",Font.BOLD,20));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(btn);

        field=new JTextField();
        field.setBounds(0,90,500,60);
        field.setFont(new Font("Arial",Font.BOLD,35));
        field.setBorder(BorderFactory.createLineBorder(Color.black));
        add(field);

        btn1=new JButton("C");
        btn1.setBounds(240,450,120,60);
        btn1.setFont(new Font("Arial",Font.BOLD,30));
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn1.addActionListener(this);
        add(btn1);

        btn2=new JButton("0");
        btn2.setBounds(120,450,120,60);
        btn2.setFont(new Font("Arial",Font.BOLD,30));
        btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn2.addActionListener(this);
        add(btn2);

        btn3=new JButton("=");
        btn3.setBounds(0,450,120,60);
        btn3.setFont(new Font("Arial",Font.BOLD,30));
        btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn3.addActionListener(this);
        add(btn3);

        btn4=new JButton("9");
        btn4.setBounds(240,390,120,60);
        btn4.setFont(new Font("Arial",Font.BOLD,30));
        btn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn4.addActionListener(this);
        add(btn4);

        btn5=new JButton("8");
        btn5.setBounds(120,390,120,60);
        btn5.setFont(new Font("Arial",Font.BOLD,30));
        btn5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn5.addActionListener(this);
        add(btn5);

        btn6=new JButton("7");
        btn6.setBounds(0,390,120,60);
        btn6.setFont(new Font("Arial",Font.BOLD,30));
        btn6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn6.addActionListener(this);
        add(btn6);


        btn7=new JButton("6");
        btn7.setBounds(240,330,120,60);
        btn7.setFont(new Font("Arial",Font.BOLD,30));
        btn7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn7.addActionListener(this);
        add(btn7);

        btn8=new JButton("5");
        btn8.setBounds(120,330,120,60);
        btn8.setFont(new Font("Arial",Font.BOLD,30));
        btn8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn8.addActionListener(this);
        add(btn8);

        btn9=new JButton("4");
        btn9.setBounds(0,330,120,60);
        btn9.setFont(new Font("Arial",Font.BOLD,30));
        btn9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn9.addActionListener(this);
        add(btn9);

        btn10=new JButton("3");
        btn10.setBounds(240,270,120,60);
        btn10.setFont(new Font("Arial",Font.BOLD,30));
        btn10.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn10.addActionListener(this);
        add(btn10);

        btn11=new JButton("2");
        btn11.setBounds(120,270,120,60);
        btn11.setFont(new Font("Arial",Font.BOLD,30));
        btn11.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn11.addActionListener(this);
        add(btn11);

        btn12=new JButton("1");
        btn12.setBounds(0,270,120,60);
        btn12.setFont(new Font("Arial",Font.BOLD,30));
        btn12.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn12.addActionListener(this);
        add(btn12);

        add=new JButton("+");
        add.setBounds(240,210,120,60);
        add.setFont(new Font("Arial",Font.BOLD,30));
        add.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add.addActionListener(this);
        add(add);

        sub=new JButton("-");
        sub.setBounds(120,210,120,60);
        sub.setFont(new Font("Arial",Font.BOLD,30));
        sub.setCursor(new Cursor(Cursor.HAND_CURSOR));
        sub.addActionListener(this);
        add(sub);

        mult=new JButton("X");
        mult.setBounds(0,210,120,60);
        mult.setFont(new Font("Arial",Font.BOLD,30));
        mult.setCursor(new Cursor(Cursor.HAND_CURSOR));
        mult.addActionListener(this);
        add(mult);

        div=new JButton("/");
        div.setBounds(240,150,120,60);
        div.setFont(new Font("Arial",Font.BOLD,30));
        div.setCursor(new Cursor(Cursor.HAND_CURSOR));
        div.addActionListener(this);
        add(div);

        dot=new JButton(".");
        dot.setBounds(120,150,120,60);
        dot.setFont(new Font("Arial",Font.BOLD,30));
        dot.setCursor(new Cursor(Cursor.HAND_CURSOR));
        dot.addActionListener(this);
        add(dot);

        backspace=new JButton("\uF0E7");
        backspace.setBounds(0,150,120,60);
        backspace.setFont(new Font("Wingdings",Font.BOLD,20));
        backspace.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backspace.addActionListener(this);
        add(backspace);

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
       new Cal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btn12){
           String num=field.getText()+btn12.getText();
           field.setText(num);
       } else if (e.getSource()==btn11) {
           String num=field.getText()+btn11.getText();
           field.setText(num);
       } else if (e.getSource()==btn10) {
           String num=field.getText()+btn10.getText();
           field.setText(num);
       } else if (e.getSource()==btn9) {
           String num=field.getText()+btn9.getText();
           field.setText(num);
       } else if (e.getSource()==btn8) {
           String num=field.getText()+btn8.getText();
           field.setText(num);
       } else if (e.getSource()==btn7) {
           String num=field.getText()+btn7.getText();
           field.setText(num);
       } else if (e.getSource()==btn6) {
           String num=field.getText()+btn6.getText();
           field.setText(num);
       } else if (e.getSource()==btn5) {
           String num=field.getText()+btn5.getText();
           field.setText(num);
       } else if (e.getSource()==btn4) {
           String num=field.getText()+btn4.getText();
           field.setText(num);
       } else if (e.getSource()==dot) {
           String num=field.getText()+dot.getText();
           field.setText(num);
       } else if (e.getSource()==btn3) {
           String answer;
           second= Double.parseDouble(field.getText());
           if (operaion=="+"){
               result=first+second;
               answer=String.format("%.2f",result);
               field.setText(answer);
           } else if (operaion=="-") {
               result=first-second;
               answer=String.format("%.2f",result);
               field.setText(answer);
           } else if (operaion=="x") {
               result=first*second;
               answer=String.format("%.2f",result);
               field.setText(answer);
           } else if (operaion=="/") {
               result=first/second;
               answer=String.format("%.2f",result);
               field.setText(answer);
           }


       } else if (e.getSource()==btn2) {
           String num=field.getText()+btn2.getText();
           field.setText(num);
       } else if (e.getSource()==btn1) {
             field.setText(null);
       } else if (e.getSource()==backspace) {
           String backspace=null;
           if (field.getText().length()>0){
               StringBuilder str=new StringBuilder(field.getText());
               str.deleteCharAt(field.getText().length()-1);
               backspace=str.toString();
               field.setText(backspace);
           }
       } else if (e.getSource()==add) {
           first= Double.parseDouble(field.getText());
           field.setText("");
           operaion="+";
       } else if (e.getSource()==sub) {
           first= Double.parseDouble(field.getText());
           field.setText("");
           operaion="-";
       } else if (e.getSource()==mult) {
           first= Double.parseDouble(field.getText());
           field.setText("");
           operaion="x";
       } else if (e.getSource()==div) {
           first= Double.parseDouble(field.getText());
           field.setText("");
           operaion="/";
       }
    }
}