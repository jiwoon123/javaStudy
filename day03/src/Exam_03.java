/*
 * ������ �� 2���� �Է¹޾� ū���� ��½����ִ� ���α׷�
 */
import java.util.*;
public class Exam_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("ù��°���� �Է� : ");
		int su1 = in.nextInt();
		System.out.print("�ι�°���� �Է� : ");
		int su2 = in.nextInt();
		
		if (su1 > su2) {
			System.out.println("ù��° �Է��Ͻ� �� " + su1 + "�� �� ū �� �Դϴ�.");
		}else if (su2 > su1){
			System.out.println("�ι�° �Է��Ͻ� �� " + su2 + "�� �� ū �� �Դϴ�.");
		}else {
			System.out.println("�Է��Ͻ� �� ���� ���� �� �Դϴ�.");
		}
	}
}












