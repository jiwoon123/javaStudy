/*
 * 	������ ���� �ϳ� �Է¹޾�
	�׼��� 3�� �������, 5�� �������,
	3�� 5�� �������, 3�� 5�� ����� �ƴ�����
	�˷��ִ� ���α׷�
 */
import java.util.*;
public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("������ ���� �Է� : ");
		int su = in.nextInt();
		
		if (su%3 == 0) {
			if (su%5 == 0) {
				System.out.println("�Է��Ͻ� ���� 3�� 5�� ����Դϴ�.");
			}else {
				System.out.println("�Է��Ͻ� ���� 3�� ����Դϴ�.");
			}
		}else if (su%5 == 0) {
			System.out.println("�Է��Ͻ� ���� 5�� ����Դϴ�.");
		}else {
			System.out.println("�Է��Ͻ� ���� 3�� 5�� ����� �ƴմϴ�.");
		}
	}
}




