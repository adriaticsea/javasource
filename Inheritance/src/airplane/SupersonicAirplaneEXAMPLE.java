package airplane;

public class SupersonicAirplaneEXAMPLE {

	public static void main(String[] args) {
         Supersonicairplane sa = new Supersonicairplane();
         //sa �ν��Ͻ�
         
         sa.takeOff();
         sa.land();
         sa.fly();
         sa.flyMode =2;
         //sa.flyMode = Supersonicairplane.SUPERSONIC;
         sa.fly();
         sa.flyMode = Supersonicairplane.NORMAL;
         sa.fly();
         

	}

}
