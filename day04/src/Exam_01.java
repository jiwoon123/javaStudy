import java.util.*;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		for(int i=1; i<=5; ++i) {
			System.out.print("���������� �Է� : ");
			int kor = in.nextInt();
			sum += kor;
		}
		
		System.out.printf("���� : %d", sum);
		
		/*
		System.out.println(kor>=60 ? "�հ�" : "���հ�");
		/*
		if (kor>=60) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
		/*
		System.out.print("�̸��� �Է� : ");
		String name = in.next();
		
		System.out.println("�̸� : " + name);
		*/
	}
}
