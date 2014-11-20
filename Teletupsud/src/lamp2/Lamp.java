package lamp2;

public class Lamp {
	boolean seisund = false;
	boolean logi = true;

	public Lamp(){
		this(false);
	}
	
	public Lamp(boolean algSeisund){
		seisund=algSeisund;
	}
	
	public boolean kysiSeisund(){
		return seisund;
	}
	
	public void on() {
		muudaSeisund(true);
	}

	public void off() {
		muudaSeisund(false);
	}

	private void muudaSeisund(boolean uusSeisund) {
		if (logi) {
			System.out.println("Seisund oli: " + this.toString());
		}
		if (seisund == uusSeisund && logi) {
			System.out.println("Seisund jääb samaks");
		} else {
			seisund = uusSeisund;
			if (logi) {
				System.out.println("Uus seisund: " + this.toString());
			}
		}
	}

	public void vahetaSeisund(){
	muudaSeisund(!seisund);
	}
	
	
	public String toString() {
		if (seisund) {
			return "Tuli põleb";
		}
		return "Tuli on kustus";
	}
}
