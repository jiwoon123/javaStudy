import java.util.*;

public class Exam_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int kor;
		while(true) {
			System.out.print("���������� �Է� : ");
			kor = in.nextInt();
			if (kor>=0 && kor<=100) break;
		}
		
		/*
		do {
			System.out.print("���������� �Է� : ");
			kor = in.nextInt();
		}while(kor<0 && kor>100);
		*/
		System.out.println("�Է��Ͻ� �������� : " + kor +"��");
	}
}
