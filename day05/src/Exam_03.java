import java.util.*;
public class Exam_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[10];
		int sum = 0;
		for(int i=0; i<arr.length; ++i) {
			System.out.print(i+1+"��° ���� �Է� : ");
			arr[i] = in.nextInt();
			sum += arr[i];
		}
		
		for(int i=0; i<arr.length; ++i) {
			System.out.print(arr[i] +"\t");
		}
		System.out.printf("\n���� : %d, ��� : %.2f\n", sum, sum/10.0);
	}
}
