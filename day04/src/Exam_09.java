import java.util.*;

public class Exam_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		int co = 0;
		while(true) {
			System.out.print("������ ���� �Է� : ");
			int su = in.nextInt();
			if (su<=0) break;
			sum += su;
			co++;
		}
		
		System.out.printf("�հ� : %d, ��� : %.2f\n", sum, sum/(float)co);
	}
}











