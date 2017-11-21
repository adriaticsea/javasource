package goliat;

public class GAll {

	public static void main(String[] args) {
		
		GtoA ga= new GtoA() {
			public void attackAir() {
				System.out.println("attackAir");
			}
		};
        ga.attackAir();
	}

}
