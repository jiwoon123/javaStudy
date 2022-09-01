/*
 * 임의의 수를 입력받아 그 수가 짝수인지 홀수인지 알려주는 프로그램
 */
import java.util.*;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("임의의 수를 입력 : ");
		int su = in.nextInt();
		if (su % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
	}
}
