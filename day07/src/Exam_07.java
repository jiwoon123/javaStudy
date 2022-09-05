import java.util.*;

public class Exam_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("피보니치 수열의 위치를 입력 : ");
		int po = in.nextInt();
		
		System.out.print("수열 : ");
		for(int i=1; i<po; ++i) {
			System.out.print(fibonachi(i) + ", ");
		}
		System.out.println(fibonachi(po));
	}
	
	public static int fibonachi(int n) {
		if (n<=2) return 1;
		return fibonachi(n-2) + fibonachi(n-1);
	}
}












