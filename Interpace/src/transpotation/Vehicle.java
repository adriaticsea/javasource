package transpotation;

public interface Vehicle {
       //�ʵ� ��� [static final] �������� 
	
	   //�߻� �ż���[abstract] ��������
	      
	   public abstract void run();
	   
	   //update
	   default void electCharge() {
		   System.out.println("���� ���Դϴ�.");
	   }
}
