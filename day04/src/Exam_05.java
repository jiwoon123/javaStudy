
public class Exam_05 {
	public static void main(String[] args) {
		int co = 0;
		for(int i=1; i<=9; ++i) {
			if (i<=5) {
				++co;
			}else {
				--co;
			}
			for(int k=1; k<=5-co; ++k) {
				System.out.print(" ");
			}
			for(int j=1; j<=co+(co-1); ++j) {//co*2-1
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
