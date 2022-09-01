
public class Exam_07 {
	public static void main(String[] args) {
		
		int lotto[] = new int[45];
		int rank[] = new int[45];
		
		for(int k=1; k<=10000; ++k) {
			int com[] = new int[6];
			for(int i=0; i<6; ++i) {
				com[i] = (int)(Math.random()*45) + 1;
				for(int j=0; j<i; ++j) {
					if (com[i] == com[j]) {
						i--;
						break;
					}
				}
			}
			
			for(int i=0; i<6; ++i) {
				lotto[com[i]-1]++;
			}
		}
		
		for(int i=0; i<45; ++i) {
			for(int j=0; j<45; ++j) {
				if (lotto[i] < lotto[j]) {
					rank[i]++;
				}
			}
		}
		
		for (int i=0; i<6; ++i) {
			for(int j=0; j<45; ++j) {
				if (rank[j] == i) {
					System.out.println(j+1);
				}
			}
		}
		/*
		for(int i=0; i<45; ++i) {
			System.out.printf("%2d¹ø ==> %d, ¼øÀ§ : %d\n", i+1, lotto[i], rank[i]);
		}
		*/
	}
}
