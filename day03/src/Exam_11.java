/*
 * 	10개의 수를 입력받아 그 합과 평균을 구하는 프로그램
	단, 평균은 소수점 2자리까지 나타나게 해주세요
 */
import java.util.*;
public class Exam_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		for(int i=1; i<=10; ++i) {
			System.out.print("수를 입력 : ");
			int su = in.nextInt();
			sum += su;//sum = sum + su;
		}
		
		System.out.printf("총점 : %d, 평균 : %.2f\n", sum, sum/10.0);
	}
}






