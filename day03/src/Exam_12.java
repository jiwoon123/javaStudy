import java.util.*;
public class Exam_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int oddSum = 0;
		int evenSum = 0;
		for(int i=1; i<=10; ++i) {
			System.out.print("������ ���� �Է� : ");
			int su = in.nextInt();
			if (su % 2 == 0) {
				evenSum += su;
			}else {
				oddSum += su;
			}
		}
		
		System.out.printf("Ȧ���� �� : %d, ¦���� �� : %d\n", oddSum, evenSum);
	}
}
