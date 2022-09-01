import java.util.*;//import java.lang.*만 안하고 나머지는 모두 입력해줘한다.

public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("이름을 입력 : ");
		String name = in.next();
		System.out.print("국어점수를 입력 : ");
		int kor = in.nextInt();
		System.out.print("영어점수를 입력 : ");
		int eng = in.nextInt();
		int tot = kor + eng;
		
		System.out.printf("%s님의 총점은 %d점 입니다.\n", name, tot);
		
	}
}





