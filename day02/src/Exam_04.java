import java.util.*;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Ű���忡 �Էµ� �ڷḦ in���� ó���ϰڴ�
		
		System.out.print("�̸��� �Է� : ");
		String name = in.next();//���ڿ��� ó��, ����, ��, �ٰ���
		System.out.print("���������� �Է� : ");
		int kor = in.nextInt();//������ �Է¹�����... �������� �ƴϸ� �����߻�!!
		System.out.print("����� �Է� : ");
		double avg = in.nextDouble();//�Ǽ�(����)�ڷ��� �Է¹�����.. 
		
		
		System.out.println("�Է��Ͻ� �̸� : " + name);
		System.out.println("�������� : " + kor + "��");
	}
}
