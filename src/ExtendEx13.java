class Parent13 {
	protected int x;
	protected int y;

	public Parent13() {
	}

	public Parent13(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Child13 extends Parent13 {
	protected int z;

	public Child13() {
	}

	public Child13(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public void pr() {
		System.out.println("x="+x+"\ty="+y+"\tz="+z);
	}
}

public class ExtendEx13 {
	public static void main(String[] args) {
		Child13 c = new Child13(10,20,30);
		c.pr();
	}
}
