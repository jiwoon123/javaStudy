import java.util.*;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("방의 갯수를 입력 : ");
		int roomSu = in.nextInt();
		boolean[] room = new boolean[roomSu];
		//false는 빈방, true는 사용중
		
		while(true) {
			System.out.print("1.입실  2.퇴실  3.보기  4.종료 : ");
			int select = in.nextInt();
			int roomNum;
			switch(select) {
			case 1 :
				do {
					System.out.print("입실하실 방의 번호 : ");
					roomNum = in.nextInt();
				}while(roomNum<1 || roomNum>roomSu);
				if (room[roomNum-1]) {
					System.out.println(roomNum+"호실은 사용중입니다.");
				}else {
					room[roomNum-1] = true;
					System.out.println(roomNum+"호실에 입실하셨습니다.");
				}
				break;
			case 2 :
				do {
					System.out.print("퇴실하실 방의 번호 : ");
					roomNum = in.nextInt();
				}while(roomNum<1 || roomNum>roomSu);
				if (room[roomNum-1]) {
					room[roomNum-1] = false;
					System.out.println(roomNum+"호실에서 퇴실하셨습니다.");
				}else {
					System.out.println(roomNum+"호실은 빈방입니다.");
				}
				break;
			case 3 :
				for(int i=0; i<roomSu; ++i) {
					if (room[i]) {
						System.out.printf("%d호실 - 사용중", i+1);
					}else {
						System.out.printf("%d호실 = 빈방", i+1);
					}
				}
				break;
			case 4 :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default :
				System.out.println("잘못입력하셨습니다. 다시입력해주세요");
			}
		}
	}
}
