import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		int su1 = input();
		int su2 = input();
		int bigsu = absBigsu(su1, su2);
		System.out.println("절대값이 큰 수 : " + bigsu);
	}
	
	public static int absBigsu(int a, int b) {
		if (abs(a)>abs(b)) return a;
		else return b;
	}
	public static int abs(int a) {
		if (a<0) return a*-1;
		return a;
	}
	
	
	public static int input() {
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력 : ");
		int su = in.nextInt();
		return su;
	}
}
