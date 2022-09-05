import java.util.*;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("팩토리얼 수를 입력  : ");
		int su = in.nextInt();
		
		int facsu = fac(su);
		
		System.out.printf("%d의 팩토리얼 값 : %d\n", su, facsu);
	}
	
	public static int fac(int n) {
		if (n==1) return 1;
		return n * fac(n-1);
	}
}
/*
2의 지수승을 입력받아 그 결과를 알아보는 프로그램
public static int bin(int n){
if (n==0) return 1;
return 2 * bin(n-1);
}
*/