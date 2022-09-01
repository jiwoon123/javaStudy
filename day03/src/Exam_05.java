/*
 * 	임의의 수를 하나 입력받아
	그수가 3의 배수인지, 5의 배수인지,
	3과 5의 배수인지, 3과 5의 배수가 아닌지를
	알려주는 프로그램
 */
import java.util.*;
public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("임의의 수를 입력 : ");
		int su = in.nextInt();
		
		if (su%3 == 0) {
			if (su%5 == 0) {
				System.out.println("입력하신 수는 3과 5의 배수입니다.");
			}else {
				System.out.println("입력하신 수는 3의 배수입니다.");
			}
		}else if (su%5 == 0) {
			System.out.println("입력하신 수는 5의 배수입니다.");
		}else {
			System.out.println("입력하신 수는 3과 5의 배수가 아닙니다.");
		}
	}
}




