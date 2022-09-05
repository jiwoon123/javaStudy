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
		System.out.println(name+"님의 총점은 " + tot +"점이고, 순위는 " + rank +"등 입니다.");
	}
}
public class Exam_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("학생의 수를 입력 : ");
		int inwon = in.nextInt();
		Student[] st = new Student[inwon];
		
		for(int i=0; i<inwon; ++i) {
			System.out.print(i+1+"번째 학생의 이름 : ");
			String name = in.next();
			System.out.print(i+1+"번쨰 학생의 국어점수 : ");
			int kor = in.nextInt();
			System.out.print(i+1+"번째 학생의 영어점수 : ");
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






