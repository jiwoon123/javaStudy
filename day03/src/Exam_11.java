/*
 * 	10���� ���� �Է¹޾� �� �հ� ����� ���ϴ� ���α׷�
	��, ����� �Ҽ��� 2�ڸ����� ��Ÿ���� ���ּ���
 */
import java.util.*;
public class Exam_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		for(int i=1; i<=10; ++i) {
			System.out.print("���� �Է� : ");
			int su = in.nextInt();
			sum += su;//sum = sum + su;
		}
		
		System.out.printf("���� : %d, ��� : %.2f\n", sum, sum/10.0);
	}
}






