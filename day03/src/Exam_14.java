import java.io.*;

public class Exam_14 {
	public static void main(String[] args) throws IOException {
		//System.out.print("단수를 입력 : ");
		//int dan = System.in.read() - 48;
		
		for(int dan=2; dan<=9; ++dan) {
			for(int i=1; i<=9; ++i) {
				System.out.printf("%d X %d = %d\n", dan, i, dan*i);
			}
		}
		
	}
}
