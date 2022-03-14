package friendsNumber;

public class Main {

	public static void main(String[] args) {
		int sayi1=221;
		int sayi2=284;
		int tpl1=0;
		int tpl2=0;
		
		for(int i=1; i<sayi1; i++) {
			if(sayi1%i==0) {
				tpl1=tpl1+i;
			}
		}
		for(int i=1; i<sayi2; i++) {
			if(sayi2%i==0) {
				tpl2=tpl2+i;
			}
		}
		if(sayi1==tpl2&&sayi2==tpl1) {
			System.out.println("2 sayı arkadaştır.");
		}else {
			System.out.println("2 sayı arkadaş değildir.");
		}

	}

}
