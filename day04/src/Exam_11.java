import java.util.*;

public class Exam_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int kor;
		while(true) {
			System.out.print("국어점수를 입력 : ");
			kor = in.nextInt();
			if (kor>=0 && kor<=100) break;
		}
		
		/*
		do {
			System.out.print("국어점수를 입력 : ");
			kor = in.nextInt();
		}while(kor<0 && kor>100);
		*/
		System.out.println("입력하신 국어점수 : " + kor +"점");
	}
}
