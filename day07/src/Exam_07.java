import java.util.*;

public class Exam_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�Ǻ���ġ ������ ��ġ�� �Է� : ");
		int po = in.nextInt();
		
		System.out.print("���� : ");
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












