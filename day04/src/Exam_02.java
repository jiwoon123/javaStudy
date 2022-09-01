import java.util.*;
public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("분을 입력 : ");
		int min = in.nextInt();
		
		int price = 2000;
		if (min>30) {
			min -= 30;//1~10 => 10, 11~20 -> 20
			price += ((min/10) + (min%10==0? 0 : 1)) * 500;
		}
				
		System.out.printf("주차요금은 %d원 입니다.", price);
	}
}
