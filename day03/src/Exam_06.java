/*
 * 	임의의 수 2개와 산술연산자를 입력받아
	그 연산자 대로 실행하는 프로그램
 */
import java.util.*;
import java.io.*;
public class Exam_06 {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫번째수를 입력 : ");
		int su1 = in.nextInt();
		System.out.print("두번째수를 입력 : ");
		int su2 = in.nextInt();
		System.out.print("산술연산자를 입력 : ");
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
			System.out.println("입력하신 연산자는 산술 연산자가 아닙니다.");
		}
	}
}








	