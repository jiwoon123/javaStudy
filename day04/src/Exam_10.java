import java.util.*;

public class Exam_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("분을 입력 : ");
			int min = in.nextInt();
			if (min == 0) break;
			else if (min < 0) System.out.println("음수는 넣을 수 없습니다.");
			else System.out.printf("%d시간 %d분 입니다.\n", min/60, min%60);
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
