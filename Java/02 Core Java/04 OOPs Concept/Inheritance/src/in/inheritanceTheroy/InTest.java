package in.inheritanceTheroy;

public class InTest {

	public static void main(String[] args) {
		Vehicle vh = new Vehicle();
		vh.commute();
		
		TwoWheeler tw = new TwoWheeler();
		tw.commute();
		System.out.println(vh.getClass());
		System.out.println(vh.hashCode());
		System.out.println(vh.toString());
		
	}

}
