package april_29_2023_keyboard_bombinggame;

public class plane {
	private int plane_x_point=0;   // at the same time, it is start x location
	private int plane_y_point=50;  // at the same time, it is start y location
	private int plane_speed=5;
	private int plane_x_size;
	private int plane_y_size;
	
	public plane(int Frame_size_x_bound,int Frame_size_y_bound) {
		
		this.plane_x_size=(int)Frame_size_x_bound/10;
		this.plane_y_size=(int)Frame_size_y_bound/20;
	}

	public void update_x_location() {
		this.plane_x_point+=this.plane_speed;
	}
	
	public int getPlane_x_point() {
		return this.plane_x_point;
	}

	public void setPlane_x_point(int plane_x_point) {
		this.plane_x_point = plane_x_point;
	}

	public int getPlane_y_point() {
		return plane_y_point;
	}

	public void setPlane_y_point(int plane_y_point) {
		this.plane_y_point = plane_y_point;
	}

	public int getPlane_speed() {
		return plane_speed;
	}

	public void setPlane_speed(int plane_speed) {
		this.plane_speed = plane_speed;
	}

	public int getPlane_x_size() {
		return plane_x_size;
	}

	public void setPlane_x_size(int plane_x_size) {
		this.plane_x_size = plane_x_size;
	}

	public int getPlane_y_size() {
		return plane_y_size;
	}

	public void setPlane_y_size(int plane_y_size) {
		this.plane_y_size = plane_y_size;
	}
	
	
}
