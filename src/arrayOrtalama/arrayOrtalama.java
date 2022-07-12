package arrayOrtalama;

public class arrayOrtalama {

	public static void main(String[] args) {
	
		int [] list = { 1,2,3,4,5};
		double sum = 0.0;
		
		for (int i = 0 ; i < list.length; i++ ) {
			sum += list[i] ;
			
		}
		
		double ortalama = sum /list.length;
		System.out.println(ortalama);
	}

}
