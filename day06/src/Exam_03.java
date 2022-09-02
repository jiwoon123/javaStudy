
public class Exam_03 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		
		int co = 1;
		for(int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
				arr[i][j] = co;
				++co;
			}
		}
		
		for(int i=4; i>=0; --i) {
			for(int j=0; j<=4; ++j) {
				System.out.printf("%2d\t", arr[j][i]);
			}
			System.out.println();
		}
		/*
		for(int i=4; i>=0; --i) {
			for(int j=4; j>=0; --j) {
				System.out.printf("%2d\t", arr[i][j]);
			}
			System.out.println();
		}
		/*
		for(int i=0; i<=4; ++i) {
			for(int j=4; j>=0; --j) {
				System.out.printf("%2d\t", arr[j][i]);
			}
			System.out.println();
		}
		/*
		for(int i=0; i<=4; ++i) {
			for(int j=0; j<=4; ++j) {
				System.out.printf("%2d\t", arr[i][j]);
			}
			System.out.println();
		}
		*/
	}
}
