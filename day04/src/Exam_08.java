
public class Exam_08 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(true) {//i<=100
			sum += i;
			++i;
			if (i>100) break;
		}
		/*
		while(i<=100) {
			sum += i;
			++i;
		}
		
		/*
		for(int i=1; i<=100; ++i) {
			sum += i;
		}
		*/
		System.out.println("1~100까지의 합 : " + sum);
	}
}
