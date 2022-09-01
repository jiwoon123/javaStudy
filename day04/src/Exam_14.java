import java.util.*;

public class Exam_14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("1~100사이의 수를 하나 생각하고 Enter키를 누르세요!!");
		in.nextLine();
		int multi = 100, plus = 1;
		while(true) {
			int su = (int)(Math.random() * multi) + plus;
			System.out.println("당신이 생각한 수가 " + su + "입니까?");
			System.out.print("1.up  2.down  3.정답 : ");
			int select = in.nextInt();
			
			if (select == 3) {
				break;
			}else if (select == 1) {
				multi = (multi+plus-1) - su;
				plus = su + 1;
			}else if (select == 2) {
				multi = su - plus;
			}else {
				System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
			}
		}
		
		System.out.println("정답을 맞추어서 프로그램을 종료합니다.");
	}
}





