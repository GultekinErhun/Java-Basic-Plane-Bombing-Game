package april_29_2023_keyboard_bombinggame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;


public class PersonMain extends Frame implements Runnable{

    private int x =0;

    public PersonMain(){
        super("Moving Face");

        setBackground(Color.BLUE);
       
        setSize(400,400);

        this.addWindowListener(new WindowAdapter(){
              public void windowClosing(WindowEvent we){
                System.exit(0);
              }
            });

        Thread t = new Thread(this);
        t.start();

    }

    public void run() {

        int xDir = +1; //direction (horizontal)
        int incr = 5; //speed of movement
        int sleepFor = 10;
        while (true) {
            x += (incr * xDir);
            /*redraw image in new screen location*/
            repaint();
            setBackground(Color.BLUE);
            System.out.println();
            try {
                /*put thread to sleep for designated time*/
                Thread.sleep(sleepFor);
            } //ends try
            catch (InterruptedException e) {}
        }
    } //ends method

    public void paint(Graphics g){

        g.setColor(Color.WHITE);

        g.drawRect(x, 100, 200,200);
        g.fillOval(x, 100,200,200);

        drawHat();

        drawEye(x+30,130);
        drawEye(x+140,130);

        drawNose(x,150);

        drawMouth();

    }

    public void drawEye(int x, int y) {

         Graphics g = getGraphics();


         g.drawOval(x, y, 25, 15);
         g.setColor(Color.BLACK);
         g.fillOval(x, y, 25, 10);

    }

    public void drawHat(){

        Graphics g = getGraphics();

         g.drawRect(x+20, 20, 150, 100);
         g.fillRect(x+20,20,150,100);
         g.drawLine(x+20, 120, x+275, 120);

    }

     public void drawNose(int x, int y) {

         Graphics g = getGraphics();

         g.drawLine(x+100, y, x+120, 160);
         g.drawLine(x+100, y, x+120, 160);
     }

     public void drawMouth(){

         Graphics g = getGraphics();

         g.drawArc(x+60, 190, 90, 75, 180, 180);

         }


     public static void main(String args[]){
         PersonMain pm = new PersonMain();

         pm.setVisible(true);
         pm.setSize(600,400);
     }
}