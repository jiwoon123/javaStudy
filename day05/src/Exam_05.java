import java.util.*;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���� ������ �Է� : ");
		int roomSu = in.nextInt();
		boolean[] room = new boolean[roomSu];
		//false�� ���, true�� �����
		
		while(true) {
			System.out.print("1.�Խ�  2.���  3.����  4.���� : ");
			int select = in.nextInt();
			int roomNum;
			switch(select) {
			case 1 :
				do {
					System.out.print("�Խ��Ͻ� ���� ��ȣ : ");
					roomNum = in.nextInt();
				}while(roomNum<1 || roomNum>roomSu);
				if (room[roomNum-1]) {
					System.out.println(roomNum+"ȣ���� ������Դϴ�.");
				}else {
					room[roomNum-1] = true;
					System.out.println(roomNum+"ȣ�ǿ� �Խ��ϼ̽��ϴ�.");
				}
				break;
			case 2 :
				do {
					System.out.print("����Ͻ� ���� ��ȣ : ");
					roomNum = in.nextInt();
				}while(roomNum<1 || roomNum>roomSu);
				if (room[roomNum-1]) {
					room[roomNum-1] = false;
					System.out.println(roomNum+"ȣ�ǿ��� ����ϼ̽��ϴ�.");
				}else {
					System.out.println(roomNum+"ȣ���� ����Դϴ�.");
				}
				break;
			case 3 :
				for(int i=0; i<roomSu; ++i) {
					if (room[i]) {
						System.out.printf("%dȣ�� - �����", i+1);
					}else {
						System.out.printf("%dȣ�� = ���", i+1);
					}
				}
				break;
			case 4 :
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			default :
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ��Է����ּ���");
			}
		}
	}
}
