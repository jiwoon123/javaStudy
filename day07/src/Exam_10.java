import java.util.*;

class Student{
	String name;
	int kor;
	int eng;
	int tot;
	int rank;
	Student(String name, int kor, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = kor + eng;
		rank = 1;
	}
	void disp() {
		System.out.println(name+"���� ������ " + tot +"���̰�, ������ " + rank +"�� �Դϴ�.");
	}
}
public class Exam_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�л��� ���� �Է� : ");
		int inwon = in.nextInt();
		Student[] st = new Student[inwon];
		
		for(int i=0; i<inwon; ++i) {
			System.out.print(i+1+"��° �л��� �̸� : ");
			String name = in.next();
			System.out.print(i+1+"���� �л��� �������� : ");
			int kor = in.nextInt();
			System.out.print(i+1+"��° �л��� �������� : ");
			int eng = in.nextInt();
			st[i] = new Student(name, kor, eng);
		}
		
		for(int i=0; i<inwon; ++i) {
			for(int j=0; j<inwon; ++j) {
				if (st[i].tot < st[j].tot) {
					st[i].rank++;
				}
			}
		}
		
		for(int i=0; i<inwon; ++i) {
			st[i].disp();
		}
	}
}






