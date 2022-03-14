package loopDemos;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i+"*"+j+"="+(i*j)+"");
			}
			System.out.println();

		}
		System.out.println("for döngüsü bitti");
		
		
		
		
		int i=1;
		while(i<100) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("while döngüsü bitti");
		
	
		
		int j=3;
		do {
			System.out.println(j);
			j+=2;
		}while(j<100);
	System.out.println("Do while bitti");

	

	}
}