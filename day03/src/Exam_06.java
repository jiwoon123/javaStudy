/*
 * 	������ �� 2���� ��������ڸ� �Է¹޾�
	�� ������ ��� �����ϴ� ���α׷�
 */
import java.util.*;
import java.io.*;
public class Exam_06 {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		
		System.out.print("ù��°���� �Է� : ");
		int su1 = in.nextInt();
		System.out.print("�ι�°���� �Է� : ");
		int su2 = in.nextInt();
		System.out.print("��������ڸ� �Է� : ");
		char op = (char)System.in.read();
		
		if (op=='+') {
			System.out.printf("%d %c %d = %d\n", su1, op, su2, su1+su2);
		}else if (op=='-') {
			System.out.printf("%d %c %d = %d\n", su1, op, su2, su1-su2);
		}else if (op=='*') {
			System.out.printf("%d %c %d = %d\n", su1, op, su2, su1*su2);
		}else if (op=='/') {
			System.out.printf("%d %c %d = %d\n", su1, op, su2, su1/su2);
		}else if (op=='%') {
			System.out.printf("%d %c %d = %d\n", su1, op, su2, su1%su2);
		}else {
			System.out.println("�Է��Ͻ� �����ڴ� ��� �����ڰ� �ƴմϴ�.");
		}
	}
}








	