import java.util.*;
public class Exam_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���⸦ ���� : 1.Į  2.����  3.�ָ�  4.���� : ");
		int select = in.nextInt();
		int a = 5;
		switch(select) {
		//byte, short, char, int, String
		case 1 : System.out.println("Į�� �����ϼ̽��ϴ�."); break;
		case 2 : System.out.println("������ �����ϼ̽��ϴ�."); break;
		case 3 : System.out.println("�ָ��� �����ϼ̽��ϴ�."); break;
		case 4 : System.out.println("������ �����ϼ̽��ϴ�."); break;
		default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		/*
		if (select == 1) {
			System.out.println("Į�� �����ϼ̽��ϴ�.");
		}else if (select == 2) {
			System.out.println("������ �����ϼ̽��ϴ�.");
		}else if (select == 3) {
			System.out.println("�ָ��� �����ϼ̽��ϴ�.");
		}else if (select == 4) {
			System.out.println("������ �����ϼ̽��ϴ�.");
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		*/
	}
}
