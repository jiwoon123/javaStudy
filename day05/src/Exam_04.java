import java.util.*;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�ο����� �Է� : ");
		int inwon = in.nextInt();
		
		String[] name = new String[inwon];
		int[] kor = new int[inwon];
		int[] eng = new int[inwon];
		int[] tot = new int[inwon];
		int[] rank = new int[inwon];
		
		for(int i=0; i<inwon; ++i) {
			System.out.print(i+1+"��° �̸� : ");
			name[i] = in.next();
			System.out.print(i+1+"��° �������� : ");
			kor[i] = in.nextInt();
			System.out.print(i+1+"��° �������� : ");
			eng[i] = in.nextInt();
			tot[i] = kor[i] + eng[i];
			rank[i] = 1;
		}
		
		for(int i=0; i<inwon; ++i) {			//i ��
			for(int j=0; j<inwon; ++j) {		//j �ٸ����
				if (tot[i] < tot[j]) {
					rank[i]++;
				}
			}
		}
		
		for(int i=0; i<inwon; ++i) {
			System.out.printf("%s���� ������ %d���̰�, ������ %d�� �Դϴ�.\n", 
												name[i], tot[i], rank[i]);
		}
	}
}












