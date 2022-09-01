import java.util.*;
public class Exam_13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력 : ");
		int su1 = in.nextInt();
		System.out.print("두번째 수를 입력 : ");
		int su2 = in.nextInt();
		
		if (su1 > su2) {
			int imsi = su1;
			su1 = su2;
			su2 = imsi;
		}
		int gcd = 1;
		if (su2 % su1 == 0) {
			gcd = su1;
		}else{
			for(int i=2; i<=su1/2; ++i) {
				if (su1 % i == 0 && su2 % i == 0) {
					gcd = i;
				}
			}
		}
		
		System.out.printf("%d와 %d의 최대공약수 : %d\n", su1, su2, gcd);
	}
}
