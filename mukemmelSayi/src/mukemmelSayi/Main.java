package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int sayi=29;
		int tpl=0;
		for(int i=1; i<sayi; i++) {
			if(sayi%i==0) {
				tpl +=i;
			}
		}
			if(sayi==tpl) {
				System.out.println("Mükemmel sayı");
				return;
			}else {
				System.out.println("Mükemmel sayı değildir");
				return;
			}
			
		}

	}


