import java.util.*;

public class Exam_01 {
	public static void main(String[] args) {
		intro();
		int su1 = input();
		int su2 = input();
		int hap = sum(su1, su2);
		output(su1, su2, hap);
	}
	
	//반환형은 없고, 매개변수도 없는 메소드
	public static void intro() {
		System.out.println("두개의 수를 입력하면 그 합을 알려주는 프로그램");
	}
	
	//반환형은 없고, 매개변수는 있는 메소드
	public static void output(int a, int b, int c) {
		System.out.printf("%d + %d = %d\n", a, b, c);
	}
	
	//반환형은 있고, 매개변수도 있는 메소드
	public static int sum(int a, int b) {
		return a+b;
	}
	
	//반환형은 있고, 매개변수가 없는 메소드
	public static int input() {
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력 : ");
		int su = in.nextInt();
		return su;
	}
}









