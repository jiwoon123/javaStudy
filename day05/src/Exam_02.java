import java.util.*;
public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("인원수를 입력 : ");
		int inwon = in.nextInt();
		
		String[] name = new String[inwon];
		String[] tel = new String[inwon];
		
		for(int i=0; i<name.length; ++i) {
			System.out.print(i+1+" 사람 이름 : ");
			name[i] = in.next();
			System.out.print(i+1+" 사람 전화번호 : ");
			tel[i] = in.next();
		}
		
		for(int i=0; i<name.length; ++i) {
			System.out.printf("%s 님의 전화번호 : %s\n",name[i], tel[i]);
		}
	}
}





