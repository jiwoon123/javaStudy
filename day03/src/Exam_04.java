/*
 * 임의의 수 3개를 입력받아 큰수대로 나열하기
 */
import java.util.*;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫번째수를 입력 : ");
		int su1 = in.nextInt();
		System.out.print("두번째수를 입력 : ");
		int su2 = in.nextInt();
		System.out.print("세번째수를 입력 : ");
		int su3 = in.nextInt();
		//제일큰수를 su1에 넣기
		if (su2>su1 && su2>=su3) {
			//su2>=su3의 식으로 한 이유 : su2와 su3이 같고, 둘다 su1보다 크다면...
			int imsi = su1;
			su1 = su2;
			su2 = imsi;
		}else if (su3>su1 && su3>su2) {
			int imsi = su1;
			su1 = su3;
			su3 = imsi;
		}
		//두번째 큰수를 su2에 넣기
		if (su3 > su2) {
			int imsi = su2;
			su2 = su3;
			su3 = imsi;
		}
		
		System.out.printf("%d >= %d >= %d\n", su1, su2, su3);
	}
}










