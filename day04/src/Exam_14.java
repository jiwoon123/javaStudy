import java.util.*;

public class Exam_14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("1~100������ ���� �ϳ� �����ϰ� EnterŰ�� ��������!!");
		in.nextLine();
		int multi = 100, plus = 1;
		while(true) {
			int su = (int)(Math.random() * multi) + plus;
			System.out.println("����� ������ ���� " + su + "�Դϱ�?");
			System.out.print("1.up  2.down  3.���� : ");
			int select = in.nextInt();
			
			if (select == 3) {
				break;
			}else if (select == 1) {
				multi = (multi+plus-1) - su;
				plus = su + 1;
			}else if (select == 2) {
				multi = su - plus;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			}
		}
		
		System.out.println("������ ���߾ ���α׷��� �����մϴ�.");
	}
}




