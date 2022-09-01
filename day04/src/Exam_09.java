import java.util.*;

public class Exam_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		int co = 0;
		while(true) {
			System.out.print("임의의 수를 입력 : ");
			int su = in.nextInt();
			if (su<=0) break;
			sum += su;
			co++;
		}
		
		System.out.printf("합계 : %d, 평균 : %.2f\n", sum, sum/(float)co);
	}
}











