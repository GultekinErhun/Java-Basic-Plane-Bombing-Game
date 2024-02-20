package april_29_2023_keyboard_bombinggame;
import java.awt.*;
import java.awt.event.*;


public class kanvas06 extends Canvas implements KeyListener
{
	

	
	private int Frame_size_x_bound;
	private int Frame_size_y_bound;
	
	private int bomb_falling_time=1;
	private int ground_y_point;
	
	bomb current_bomb;
	target target1;
	plane plane1;
	
	private int explotion_size=500;
	private int explotion_frame=200;
	
	public kanvas06(int Frame_size_x_bound,int Frame_size_y_bound) {
		setBackground(Color.blue);
		addKeyListener(this);  
		this.Frame_size_x_bound=Frame_size_x_bound;
		this.Frame_size_y_bound=Frame_size_y_bound;
		
		this.ground_y_point=(int)((Frame_size_y_bound/10)*9);
		
		plane1= new plane(Frame_size_x_bound,Frame_size_y_bound);
		target1=new target(Frame_size_x_bound,ground_y_point);
	}
	
	public void paint(Graphics p)
	{	
		
		
		try
		{
			Thread.sleep(15);
			plane1.update_x_location();
		}
		catch(Exception e) 
		{
			
		}  
 		if((plane1.getPlane_x_point()+plane1.getPlane_x_size()>=this.Frame_size_x_bound)||(plane1.getPlane_x_point()<=0)) {
 			plane1.setPlane_speed(-1*plane1.getPlane_speed());
 			}
 		
 		if (current_bomb.getIsFalling()==true) {
 			drawBomb();
 	 		current_bomb.setFall_time(bomb_falling_time);
 	 		current_bomb.update_bomb_y_speed();
 	 		current_bomb.update_bomb_y_point();
 	 		current_bomb.update_bomb_x_point();
 	 		current_bomb.control_is_crashed(ground_y_point, target1);
 	 		if(current_bomb.getIs_crashed()==true) {
 				current_bomb.setIsFalling(false);
 				if(this.explotion_frame>0) {
 					drawexplotion();
 					this.explotion_frame-=1;
 				}
 				
 				
 	 		}
 		}
 		

 		
 		
 		drawPlane();
 		drawGround();
 		drawTarget();
 		
 		setBackground(Color.blue);
 		

 		bomb_falling_time+=1;
 		

 		
 		repaint();
	}
	

	
	
	
	
	
	public void keyPressed(KeyEvent e)
	{
		int tus = e.getKeyCode();

		if(KeyEvent.VK_DOWN==tus) {
			if (bomb.getIsFalling()==false) {
				current_bomb= new bomb(plane1.getPlane_x_point()+(int)(plane1.getPlane_x_size()/2),plane1.getPlane_y_point()+plane1.getPlane_y_size(),plane1.getPlane_speed());		
				current_bomb.setIsFalling(true);
				this.bomb_falling_time=1;
				this.explotion_frame=200;
			}
		}
		
	}	
		
	public void keyReleased(KeyEvent e) {}	
	public void keyTyped(KeyEvent e) {}	
	
	
	
	public void drawPlane(){

        Graphics p = getGraphics();
 		p.setColor(Color.white);
 		p.fillRect(plane1.getPlane_x_point(), plane1.getPlane_y_point(), plane1.getPlane_x_size(),plane1.getPlane_y_size());

        }
	
	public void drawGround() {
		Graphics p = getGraphics();
		p.setColor(Color.green);
		p.fillRect(0, ground_y_point,Frame_size_x_bound, ground_y_point);
	}
	
	public void drawBomb() {
		Graphics p = getGraphics();
		p.setColor(Color.black);
		p.fillRect(current_bomb.getBomb_x_point(), current_bomb.getBomb_y_point(),current_bomb.getBomb_size(), current_bomb.getBomb_size());

	}
	
	public void drawTarget() {
		Graphics p = getGraphics();
		p.setColor(new Color(110,200,52));
		p.fillRect(target1.getTarget_x_point(), target1.getTarget_y_point(), target1.getTarget_x_size(), target1.getTarget_y_size());
	}
	
	public void drawexplotion() {
		Graphics p=getGraphics();
		p.setColor(Color.red);
		p.fillRect((int)(current_bomb.getBomb_x_point()-explotion_size/2), ground_y_point-explotion_size,explotion_size , explotion_size);
		
	}
	
	
	



	
}