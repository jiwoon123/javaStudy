import java.util.*;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("인원수를 입력 : ");
		int inwon = in.nextInt();
		
		String[] name = new String[inwon];
		int[] kor = new int[inwon];
		int[] eng = new int[inwon];
		int[] tot = new int[inwon];
		int[] rank = new int[inwon];
		
		for(int i=0; i<inwon; ++i) {
			System.out.print(i+1+"번째 이름 : ");
			name[i] = in.next();
			System.out.print(i+1+"번째 국어점수 : ");
			kor[i] = in.nextInt();
			System.out.print(i+1+"번째 영어점수 : ");
			eng[i] = in.nextInt();
			tot[i] = kor[i] + eng[i];
			rank[i] = 1;
		}
		
		for(int i=0; i<inwon; ++i) {			//i 나
			for(int j=0; j<inwon; ++j) {		//j 다른사람
				if (tot[i] < tot[j]) {
					rank[i]++;
				}
			}
		}
		
		for(int i=0; i<inwon; ++i) {
			System.out.printf("%s님의 총점은 %d점이고, 순위는 %d등 입니다.\n", 
												name[i], tot[i], rank[i]);
		}
	}
}












