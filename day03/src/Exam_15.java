
public class Exam_15 {
	public static void main(String[] args) {
		for(int i=1; i<=9; ++i) {
			for(int dan=2; dan<=9; ++dan) {
				System.out.printf("%dX%d=%2d\t", dan, i, dan*i);
			}
			System.out.println();
		}
	}
}
