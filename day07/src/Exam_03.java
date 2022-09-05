import java.util.*;
import java.io.*;

public class Exam_03 {
	public static void main(String[] args) throws IOException {
		int su1 = input();
		int su2 = input();
		char op = (char)System.in.read();
		
		int tot = 0;
		switch(op) {
		case '+' : tot = add(su1, su2); break;			
		case '-' : tot = min(su1, su2); break;
		case '*' : tot = mul(su1, su2); break;
		case '/' : tot = div(su1, su2); break;
		default : System.out.println("잘못입력하셨습니다."); System.exit(0);
		}
		
		System.out.printf("%d %c %d = %d\n", su1, op, su2, tot);
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static int min(int a, int b) {
		if (a>b) return a-b;
		else return b-a;
	}
	public static int div(int a, int b) {
		if (b==0) b = 1;
		return a/b;
	}
	
	public static int input() {
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력 : ");
		int su = in.nextInt();
		return su;
	}
}
