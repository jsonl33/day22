package net.daum.vo;

import net.daum.model.*;

class ChildPoint09 extends ParentPoint09 implements ChildInterface {
	ParentPoint09 p = new ParentPoint09();
	
	int a = p.getA();
	int b = p.getB();

	public void pr() {
		System.out.print(a + " " + b);
	}
	
}

public class ExtendedEx09 {
	public static void main(String[] args) {
		ChildPoint09 cp = new ChildPoint09();
		cp.pr();
	}
}
