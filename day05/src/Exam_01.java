import java.util.*;
//5����� ���������� �Է¹޾� 5�� ������ ��� �����ϰ� ���� �˷��ִ� ���α׷�
public class Exam_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int kor[] = new int[5];
		int sum = 0;
		for(int i=0; i<5; ++i) {
			System.out.print(i+1+"��° �л� �������� : ");
			kor[i] = in.nextInt();
			sum += kor[i];
		}
		
		for(int i=0; i<5; ++i) {
			System.out.print(kor[i]+"\t");
		}
		System.out.println("�� : " + sum);
	}
}
