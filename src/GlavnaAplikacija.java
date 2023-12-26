
public class GlavnaAplikacija {
	public static void main(String[] args) {
		Broevi broevi = new Broevi(5, 10);
		int rezultat = broevi.getBroj1() + broevi.getBroj2();
		System.out.println("Збирот на броевите е: " + rezultat);
	}
}
