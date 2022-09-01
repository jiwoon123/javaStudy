import java.util.*;

public class Exam_15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			int com = (int)(Math.random()*3) + 1;
			System.out.print("1.가위  2.바위  3.보  4.종료 : ");
			int select = in.nextInt();
			
			switch(select) {
			case 1 :
				if (com == 1) System.out.println("비겼습니다.");
				else if (com == 2) System.out.println("졌습니다.");
				else System.out.println("이겼습니다.");
				break;
			case 2 :
				if (com == 2) System.out.println("비겼습니다.");
				else if (com == 3) System.out.println("졌습니다.");
				else System.out.println("이겼습니다.");
				break;
			case 3 :
				if (com == 3) System.out.println("비겼습니다.");
				else if (com == 1) System.out.println("졌습니다.");
				else System.out.println("이겼습니다.");
				break;
			case 4 :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);//프로그램을 종료시킬때 사용하는 명령어
			default :
				System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
			}
		}
	}
}
