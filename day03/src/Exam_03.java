/*
 * 임의의 수 2개를 입력받아 큰수를 출력시켜주는 프로그램
 */
import java.util.*;
public class Exam_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫번째수를 입력 : ");
		int su1 = in.nextInt();
		System.out.print("두번째수를 입력 : ");
		int su2 = in.nextInt();
		
		if (su1 > su2) {
			System.out.println("첫번째 입력하신 수 " + su1 + "가 더 큰 수 입니다.");
		}else if (su2 > su1){
			System.out.println("두번째 입력하신 수 " + su2 + "가 더 큰 수 입니다.");
		}else {
			System.out.println("입력하신 두 수는 같은 수 입니다.");
		}
	}
}












