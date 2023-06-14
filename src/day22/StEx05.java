package day22;

import java.util.Scanner;



public class StEx05 {
	public static int maxNum(int a, int b) {
		int max = Math.max(a, b);
		return max;
	}
	public static int minNum(int a, int b) {
		int min = Math.min(a, b);
		return min;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 두개 입력");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("최댓값: "+maxNum(a, b));
		System.out.println("최소값: "+minNum(a, b));
		sc.close();
	}
}
