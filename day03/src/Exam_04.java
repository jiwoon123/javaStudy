/*
 * ������ �� 3���� �Է¹޾� ū����� �����ϱ�
 */
import java.util.*;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("ù��°���� �Է� : ");
		int su1 = in.nextInt();
		System.out.print("�ι�°���� �Է� : ");
		int su2 = in.nextInt();
		System.out.print("����°���� �Է� : ");
		int su3 = in.nextInt();
		//����ū���� su1�� �ֱ�
		if (su2>su1 && su2>=su3) {
			//su2>=su3�� ������ �� ���� : su2�� su3�� ����, �Ѵ� su1���� ũ�ٸ�...
			int imsi = su1;
			su1 = su2;
			su2 = imsi;
		}else if (su3>su1 && su3>su2) {
			int imsi = su1;
			su1 = su3;
			su3 = imsi;
		}
		//�ι�° ū���� su2�� �ֱ�
		if (su3 > su2) {
			int imsi = su2;
			su2 = su3;
			su3 = imsi;
		}
		
		System.out.printf("%d >= %d >= %d\n", su1, su2, su3);
	}
}










