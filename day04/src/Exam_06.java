
public class Exam_06 {
	public static void main(String[] args) {
		int co = 6;
		for(int i=1; i<=9; ++i) {
			if (i<=5) {	
				--co;
			}else {
				++co;
			}
			for(int j=1; j<=co; ++j) {
				System.out.print("*");
			}
			for(int k=1; k<=(6-co)+(6-co)-1; ++k) {
				System.out.print(" ");
			}
			for(int j=1; j<=co; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
