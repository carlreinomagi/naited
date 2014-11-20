package lamp2;

public class proov2 {

	public static void tryki(Lamp[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.println(i + " " + m[i]);
		}
	}

	public static void main(String[] args) {
		Lamp[] lambid = new Lamp[2];
		lambid[0] = new Lamp(true);
		lambid[1] = new Lamp();
		for (Lamp pirn : lambid) {
			System.out.println(pirn);
		}
		for (Lamp pirn : lambid) {
			pirn.vahetaSeisund();
		}
		tryki(lambid);
	}

}
