package lamp1;

public class Lamp {
	boolean sees = false;

	public void on() {
		sees = true;
	}

	public void off() {
		sees = false;
	}

	public String toString() {
		if (sees) {
			return "Tuli p�leb*";
		}
		return "Tuli on kustus";
	}
}
