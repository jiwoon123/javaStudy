import java.util.*;

public class Exam_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� �Է� : ");
			int min = in.nextInt();
			if (min == 0) break;
			else if (min < 0) System.out.println("������ ���� �� �����ϴ�.");
			else System.out.printf("%d�ð� %d�� �Դϴ�.\n", min/60, min%60);
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}
}
