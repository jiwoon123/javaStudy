
public class Exam_18 {
	public static void main(String[] args) {
		int co = 6;
		for(int i=1; i<=9; ++i) {
			if (i<=5) {	//1, 2, 3, 4, 5
				--co;
			}else {		//6, 7, 8, 9
				++co;
			}
			for(int j=1; j<=co; ++j) {
				System.out.print(j);
			}
			System.out.println();
		}
		/*
		int co = 0;
		for(int i=1; i<=9; ++i) {
			if (i<=5) {	//1, 2, 3, 4, 5
				++co;
			}else {		//6, 7, 8, 9
				--co;
			}
			for(int j=1; j<=co; ++j) {
				System.out.print(j);
			}
			System.out.println();
		}
		*/
	}
}
