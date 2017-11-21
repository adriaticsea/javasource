package airplane;

public class Supersonicairplane extends Airplane {
	public static final int NORMAL =1;
	public static final int SUPERSONIC =2;
	
	public int flyMode = NORMAL;
	
	@Override
    public void fly() {
		if (flyMode == SUPERSONIC){
			//true
			System.out.println("SUPERSONIC MODE");
		} else {
			//false
			super.fly();

		}
	}

}
