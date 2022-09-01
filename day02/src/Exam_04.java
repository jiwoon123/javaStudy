import java.util.*;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//키보드에 입력된 자료를 in으로 처리하겠다
		
		System.out.print("이름을 입력 : ");
		String name = in.next();//문자열을 처리, 공백, 탭, 줄개행
		System.out.print("국어점수를 입력 : ");
		int kor = in.nextInt();//정수를 입력받을때... 정수값이 아니면 오류발생!!
		System.out.print("평균을 입력 : ");
		double avg = in.nextDouble();//실수(더블)자료형 입력받을때.. 
		
		
		System.out.println("입력하신 이름 : " + name);
		System.out.println("국어점수 : " + kor + "점");
	}
}
