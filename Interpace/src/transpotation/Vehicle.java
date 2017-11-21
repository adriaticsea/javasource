package transpotation;

public interface Vehicle {
       //필드 상수 [static final] 생략가능 
	
	   //추상 매서드[abstract] 생략가능
	      
	   public abstract void run();
	   
	   //update
	   default void electCharge() {
		   System.out.println("충전 중입니다.");
	   }
}
