/*
 * 	국어점수와 영어점수를 입력받아 평균값이 90점 이상이면 수
	80~89점사이면 우, 70~79점사이면 미, 60~69점사이면 양
	59점 미만은 가를 출력시켜주는 프로그램
	단, 점수는 0~100점 사이값만 입력되었다고 가정한다.
 */
import java.util.*;
public class Exam_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("국어점수를 입력 : ");
		int kor = in.nextInt();
		System.out.print("영어점수를 입력 : ");
		int eng = in.nextInt();
		int avg = (kor + eng) / 2;

		switch(avg/10) {
		case 10 : System.out.println("수입니다."); break;
		case 9 : System.out.println("수입니다."); break;
		case 8 : System.out.println("우입니다."); break;
		case 7 : System.out.println("미입니다."); break;
		case 6 : System.out.println("양입니다."); break;
		default : System.out.println("가입니다.");
		}
		/*
		if (avg>=90) {
			System.out.println("수입니다.");
		}else if (avg>=80) {
			System.out.println("우입니다.");
		}else if (avg>=70) {
			System.out.println("미입니다.");
		}else if (avg>=60) {
			System.out.println("양입니다.");
		}else {
			System.out.println("가입니다.");
		}
		*/
	}
}











