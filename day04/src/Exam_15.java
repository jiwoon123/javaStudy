import java.util.*;

public class Exam_15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			int com = (int)(Math.random()*3) + 1;
			System.out.print("1.����  2.����  3.��  4.���� : ");
			int select = in.nextInt();
			
			switch(select) {
			case 1 :
				if (com == 1) System.out.println("�����ϴ�.");
				else if (com == 2) System.out.println("�����ϴ�.");
				else System.out.println("�̰���ϴ�.");
				break;
			case 2 :
				if (com == 2) System.out.println("�����ϴ�.");
				else if (com == 3) System.out.println("�����ϴ�.");
				else System.out.println("�̰���ϴ�.");
				break;
			case 3 :
				if (com == 3) System.out.println("�����ϴ�.");
				else if (com == 1) System.out.println("�����ϴ�.");
				else System.out.println("�̰���ϴ�.");
				break;
			case 4 :
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);//���α׷��� �����ų�� ����ϴ� ��ɾ�
			default :
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			}
		}
	}
}
