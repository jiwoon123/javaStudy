import java.util.*;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���丮�� ���� �Է�  : ");
		int su = in.nextInt();
		
		int facsu = fac(su);
		
		System.out.printf("%d�� ���丮�� �� : %d\n", su, facsu);
	}
	
	public static int fac(int n) {
		if (n==1) return 1;
		return n * fac(n-1);
	}
}
/*
2�� �������� �Է¹޾� �� ����� �˾ƺ��� ���α׷�
public static int bin(int n){
if (n==0) return 1;
return 2 * bin(n-1);
}
*/