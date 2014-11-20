package lamp2;
import java.util.*;

public class proov3 {

	public static int   mituLampiPoleb(List<Lamp>loetelu){
		int loendur = 0;
		for(Lamp pirn:loetelu){
			if(pirn.kysiSeisund() == true){
				loendur++;
			}
		}
		return loendur;
	}
	
	public static void main(String[] args) {
		List<Lamp> lambid=new ArrayList<Lamp>();
		lambid.add(new Lamp());
		lambid.add(new Lamp(true));
		lambid.add(new Lamp());
		for(Lamp pirn:lambid){
			System.out.println(pirn);
			
		}
		lambid.remove(0);
		System.out.println("----");
		for(Lamp pirn:lambid){
			System.out.println(pirn);
		}
		System.out.println("lampe kokku: " +lambid.size()+", põleb "+mituLampiPoleb(lambid)+"*");
	}

}
