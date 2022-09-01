import java.util.*;
public class Exam_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("무기를 선택 : 1.칼  2.권총  3.주먹  4.소총 : ");
		int select = in.nextInt();
		int a = 5;
		switch(select) {
		//byte, short, char, int, String
		case 1 : System.out.println("칼을 선택하셨습니다."); break;
		case 2 : System.out.println("권총을 선택하셨습니다."); break;
		case 3 : System.out.println("주먹을 선택하셨습니다."); break;
		case 4 : System.out.println("소총을 선택하셨습니다."); break;
		default : System.out.println("잘못입력하셨습니다.");
		}
		/*
		if (select == 1) {
			System.out.println("칼을 선택하셨습니다.");
		}else if (select == 2) {
			System.out.println("권총을 선택하셨습니다.");
		}else if (select == 3) {
			System.out.println("주먹을 선택하셨습니다.");
		}else if (select == 4) {
			System.out.println("소총을 선택하셨습니다.");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		*/
	}
}
