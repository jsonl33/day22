package net.daum.vo;

class ParentPoint{
	protected int a = 10;
	protected int b = 20;
}

class ChildPoint09 extends ParentPoint{
	ParentPoint p = new ParentPoint();
	int a = p.a;
	int b = p.b;
	public void pr() {
		System.out.print(a+" "+b);
	}
}

public class ExtendedEx09 {
	public static void main(String[] args) {
		ChildPoint09 c = new ChildPoint09();
		c.pr();
	}
}
