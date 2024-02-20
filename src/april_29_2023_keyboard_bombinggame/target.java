package april_29_2023_keyboard_bombinggame;

public class target {
	private int target_x_size;
	private int target_y_size;
	private int target_x_point;
	private int target_y_point;
	private static int target_x_size_random_coeff=200;
	private static int target_y_size_coeff=100;
	
	private boolean crashed;
	
	
	public target(int Frame_size_x_bound,int ground_y_point) {
		this.target_x_size=(int)(Math.random()*target_x_size_random_coeff);
		this.target_y_size=(int)(Math.random()*target_y_size_coeff);
		
		this.target_x_point=(int) (Math.random()*(Frame_size_x_bound-target_x_size));
		this.target_y_point=ground_y_point-(target_y_size);

	}


	public int getTarget_x_size() {
		return target_x_size;
	}


	public void setTarget_x_size(int target_x_size) {
		this.target_x_size = target_x_size;
	}


	public int getTarget_y_size() {
		return target_y_size;
	}


	public void setTarget_y_size(int target_y_size) {
		this.target_y_size = target_y_size;
	}


	public int getTarget_x_point() {
		return target_x_point;
	}


	public void setTarget_x_point(int target_x_point) {
		this.target_x_point = target_x_point;
	}


	public int getTarget_y_point() {
		return target_y_point;
	}


	public void setTarget_y_point(int target_y_point) {
		this.target_y_point = target_y_point;
	}


	public static int getTarget_x_size_random_coeff() {
		return target_x_size_random_coeff;
	}


	public static void setTarget_x_size_random_coeff(int target_x_size_random_coeff) {
		target.target_x_size_random_coeff = target_x_size_random_coeff;
	}


	public static int getTarget_y_size_coeff() {
		return target_y_size_coeff;
	}


	public static void setTarget_y_size_coeff(int target_y_size_coeff) {
		target.target_y_size_coeff = target_y_size_coeff;
	}


	public boolean isCrashed() {
		return crashed;
	}


	public void setCrashed(bomb one_bomb,boolean crashed) {
		if(true) {
//			one_bomb.getBomb_x_point()-;
		}
		this.crashed = crashed;
		
	}




}
