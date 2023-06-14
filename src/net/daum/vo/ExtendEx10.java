package net.daum.vo;

class Parent10{
	public void p10() {
		System.out.println("부모클래스에서 정의된 메서드 p10()");
	}
}

class Child10 extends Parent10{
	
	@Override
	public void p10() {
		System.out.println("오버라이딩 한 메서드 p10()");
	}
	
	public void ch10() {
		System.out.println("자손에서 정의된 메서드 ch10()");
	}
}

public class ExtendEx10 {
	public static void main(String[] args) {
		Child10 c = new Child10();
		c.p10();
		c.ch10();
		
		Parent10 p = new Parent10();
		p.p10();
	}
}
