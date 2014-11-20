package algus;

public class Tervitus {

	public static void main(String[] args) {
		System.out.println("Tupsu tere :D");
		int vanus = 12;
		if (vanus < 7) {
			System.out.println("Tasuta");
		} else {
			if (vanus < 14) {
				System.out.println("Tupsupilet");
			} else {
				System.out.println("Täispilet");
			}
		}
		for(int i=0; i<vanus; i++){
			System.out.print("*");
		}
	}
}
