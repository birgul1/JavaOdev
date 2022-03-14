package miniProje1;

public class Main {

	public static void main(String[] args) {
		int number=23;
		int counter=0;
		
		if(number==1) {
			System.out.println("Sayı asal değildir.");
		}
		if(number<1) {
			System.out.println("Geçersiz");
		}
	
		for(int i=2; i<number; i++) {
			if(number%i==0) {
				counter++;
			}
		}
			if(counter==0) {
				System.out.println(number+" "+ "Asal sayıdır.");
				return;
			}else {
				System.out.println(number+" "+"Asal sayı değildir");
				return;
			}
		}

	}


