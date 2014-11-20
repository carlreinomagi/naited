package lamp2;

public class Proov1 {

	public static void main(String[] args) {
		Lamp pirn1 = new Lamp(true);
		System.out.println(pirn1);
		pirn1.on();
		System.out.println(pirn1);
		pirn1.on();
		Lamp pirn2=new Lamp();
		pirn2.vahetaSeisund();
	}

}
