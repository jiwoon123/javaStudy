import java.util.*;

public class Exam_13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int comsu = (int)(Math.random()*100) + 1;
		int co = 0;
		
		while(true) {
			System.out.print("수를 입력 : ");
			int su = in.nextInt();
			co++;
			if (su == comsu) break;
			else if (su < comsu) System.out.println("up");
			else System.out.println("down");
		}
		
		System.out.println(co+"번만에 맞추셨습니다.");
	}
}











