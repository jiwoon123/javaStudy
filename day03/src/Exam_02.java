/*
 * ������ ���� �Է¹޾� �� ���� ¦������ Ȧ������ �˷��ִ� ���α׷�
 */
import java.util.*;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("������ ���� �Է� : ");
		int su = in.nextInt();
		if (su % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		}else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}
}
