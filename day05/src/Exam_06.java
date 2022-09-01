import java.util.*;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int com[] = new int[6];
		int select[] = new int[6];
		
		for(int i=0; i<6; ++i) {
			com[i] = (int)(Math.random()*45) + 1;
			for(int j=0; j<i; ++j) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<6; ++i) {
			do {
				System.out.print(i+1+"번째 로또번호를 입력 : ");
				select[i] = in.nextInt();
			}while(select[i] < 1 || select[i] > 45);
			for(int j=0; j<i; ++j) {
				if (select[i] == select[j]) {
					i--;
					break;
				}
			}
		}
		
		int co = 0;
		for(int i=0; i<6; ++i) {
			for(int j=0; j<6; ++j) {
				if (com[i] == select[j]) {
					co++;
					break;
				}
			}
		}
		
		System.out.println("맞춘갯수 : " + co);
	}
}


















