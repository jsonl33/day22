package net.daum.vo;

class Parent12{
	int a=10;
	int b=20;
}

class Child12 extends Parent12{
	int a=40;
	int b=50;
	int c=30;
	
	void print() {
		System.out.println("this.a="+this.a+", b="+b);
		System.out.println("super.a="+super.a+", super.b="+super.b);
		System.out.println("c="+c+", this.c="+this.c);
	}
}
public class ExtendEx12 {
	public static void main(String[] args) {
		Child12 c = new Child12();
		c.print();
	}
}
