/*
 * 	���������� ���������� �Է¹޾� ��հ��� 90�� �̻��̸� ��
	80~89�����̸� ��, 70~79�����̸� ��, 60~69�����̸� ��
	59�� �̸��� ���� ��½����ִ� ���α׷�
	��, ������ 0~100�� ���̰��� �ԷµǾ��ٰ� �����Ѵ�.
 */
import java.util.*;
public class Exam_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���������� �Է� : ");
		int kor = in.nextInt();
		System.out.print("���������� �Է� : ");
		int eng = in.nextInt();
		int avg = (kor + eng) / 2;

		switch(avg/10) {
		case 10 : System.out.println("���Դϴ�."); break;
		case 9 : System.out.println("���Դϴ�."); break;
		case 8 : System.out.println("���Դϴ�."); break;
		case 7 : System.out.println("���Դϴ�."); break;
		case 6 : System.out.println("���Դϴ�."); break;
		default : System.out.println("���Դϴ�.");
		}
		/*
		if (avg>=90) {
			System.out.println("���Դϴ�.");
		}else if (avg>=80) {
			System.out.println("���Դϴ�.");
		}else if (avg>=70) {
			System.out.println("���Դϴ�.");
		}else if (avg>=60) {
			System.out.println("���Դϴ�.");
		}else {
			System.out.println("���Դϴ�.");
		}
		*/
	}
}











