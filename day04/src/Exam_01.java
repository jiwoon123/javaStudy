import java.util.*;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		for(int i=1; i<=5; ++i) {
			System.out.print("국어점수를 입력 : ");
			int kor = in.nextInt();
			sum += kor;
		}
		
		System.out.printf("총점 : %d", sum);
		
		/*
		System.out.println(kor>=60 ? "합격" : "불합격");
		/*
		if (kor>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		/*
		System.out.print("이름을 입력 : ");
		String name = in.next();
		
		System.out.println("이름 : " + name);
		*/
	}
}
