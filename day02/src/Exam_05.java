import java.util.*;//import java.lang.*�� ���ϰ� �������� ��� �Է������Ѵ�.

public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�̸��� �Է� : ");
		String name = in.next();
		System.out.print("���������� �Է� : ");
		int kor = in.nextInt();
		System.out.print("���������� �Է� : ");
		int eng = in.nextInt();
		int tot = kor + eng;
		
		System.out.printf("%s���� ������ %d�� �Դϴ�.\n", name, tot);
		
	}
}





