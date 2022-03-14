package diziler;

public class Main {

	public static void main(String[] args) {
//		int[] sayilar=new int[5];
//		sayilar[0]=10;
//		sayilar[1]=20;
//		sayilar[2]=25;
//		sayilar[3]=50;
//		sayilar[4]=80;
//		
//		
//		for(int i=0; i<sayilar.length; i++) {
//			System.out.println(sayilar[i]);
//		}
//		
//		for (int i : sayilar) {
//			System.out.println(sayilar[i]);

		double[] myList = { 1.2, 5.6, 7.8, 9.7 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;

			}
			total = total + number;
			System.out.println(number);

		}
		System.out.println("Toplam=" + total);
		System.out.println("En Büyük=" + max);

	}

}
