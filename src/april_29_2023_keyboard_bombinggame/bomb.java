package april_29_2023_keyboard_bombinggame;

public class bomb {
	private int bomb_size=20;
	
	private int bomb_x_point;
	private int bomb_y_point;
	
	private int bomb_x_speed;
	private int bomb_y_speed;
	
	private double gravity_acceleration=0.001;
	private int fall_time;
	
	
	
	private static boolean IsFalling=false;
	private boolean is_crashed;
	
	private int explotion_size=500;
	private int explotion_frame=200;
	
	


	
	public bomb(int bomb_x_point,int bomb_y_point,int bomb_x_speed) {
		
		this.bomb_x_point=bomb_x_point;
		this.bomb_y_point=bomb_y_point;
		this.bomb_x_speed=bomb_x_speed;
		this.is_crashed=false;
	}
	
	
	public void update_bomb_y_speed() {
		this.bomb_y_speed=(int)(gravity_acceleration*(fall_time*fall_time));
	}
	public void update_bomb_y_point() {
		this.bomb_x_point+=bomb_x_speed;
	}
	
	public void update_bomb_x_point() {
		this.bomb_y_point+=bomb_y_speed;
	}
	
	public double getGravity_acceleration() {
		return gravity_acceleration;
	}


	public void setGravity_acceleration(int gravity_acceleration) {
		this.gravity_acceleration = gravity_acceleration;
	}


	public int getFall_time() {
		return fall_time;
	}


	public void setFall_time(int fall_time) {
		this.fall_time = fall_time;
	}


	public int getBomb_size() {
		return bomb_size;
	}


	public void setBomb_size(int bomb_size) {
		this.bomb_size = bomb_size;
	}


	public int getBomb_x_point() {
		return bomb_x_point;
	}


	public void setBomb_x_point(int bomb_x_point) {
		this.bomb_x_point = bomb_x_point;
	}


	public int getBomb_y_point() {
		return bomb_y_point;
	}


	public void setBomb_y_point(int bomb_y_point) {
		this.bomb_y_point = bomb_y_point;
	}


	public int getBomb_x_speed() {
		return bomb_x_speed;
	}


	public void setBomb_x_speed(int bomb_x_speed) {
		this.bomb_x_speed = bomb_x_speed;
	}


	public int getBomb_y_speed() {
		return bomb_y_speed;
	}


	public void setBomb_y_speed(int bomb_y_speed) {
		this.bomb_y_speed = bomb_y_speed;
	}


	public static boolean getIsFalling() {
		return IsFalling;
	}


	public static void setIsFalling(boolean IsFalling) {
		bomb.IsFalling = IsFalling;
	}


	public boolean getIs_crashed() {
		return this.is_crashed;
	}


	public void setIs_crashed(boolean is_crashed) {
		this.is_crashed = is_crashed;
	}


	public void control_is_crashed(int ground_y_point,target target) {
		if(this.getBomb_y_point()>=ground_y_point) {
			this.setIs_crashed(true);
		}
		
	}
	


	
	

}
