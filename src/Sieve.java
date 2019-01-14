import java.util.ArrayList;

public class Sieve {

	public static ArrayList<Integer> sieve(Integer a) {
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int p = 0; p <= a;++p) {
			b.add(p);
		}
		int j = 0;
		double t = Math.sqrt(a);
		for(int p= 2; p <= (Math.floor(t)); ++p) {
			if(b.get(p) != 0) {
				j = p*p;
			}
			while(j <= a) {
				if(b.indexOf(j) == -1) {
					j = j +p;
				}
				else {
				b.set(b.indexOf(j),0);
				j = j + p;
				}
			}
		}
		ArrayList<Integer> fin = new ArrayList<Integer>();
		for(int i = 0; i < b.size(); ++i) {
			if(!(b.get(i).equals(0) || b.get(i).equals(1))) {
				fin.add(b.get(i));
			}
		}
		return fin;
	}
}

