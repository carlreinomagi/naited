package algus;

public class Massiivid {
	public static int summa(int[] arvud){
		int abi=0;
		for(int arv:arvud){
			abi+=arv;
		}
		return abi;
	}
	
	
	public static int[] uusTagurpidi(int[] vana){
		int[] uus=new int[vana.length];
		for(int i=0; i<vana.length; i++){
			uus[uus.length-1-i]=vana[i];
		}
		return uus;
	}
	
	public static void tryki(int[] m){
		for(int arv:m){
			System.out.println(arv);
		}
	}
	
	public static void main(String[] args) {
		int[] m=new int[3];
		m[0]=17;
		m[1]=23;
		m[2]=45;
		for(int i=0; i<m.length; i++){
			System.out.println(m[i]);
		}
		for(int arv:m){
			System.out.println(arv);
		}
		System.out.println(summa(m));
		int[] m2=uusTagurpidi(m);
		tryki(m2);
	}

}
