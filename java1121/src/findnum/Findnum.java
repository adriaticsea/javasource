package findnum;

import java.util.Scanner;

public class Findnum {
     //�ʵ�(����)
    int comNum;
    int userNum;
	
	//������
    Findnum() {};
	
    //�ż���(�Լ�)
    void makeComNum() {
    	
    	comNum=(int)(Math.random()*9)+1;
    	System.out.println(comNum);
    }
    
    void getUserNum() {
    	Scanner sc = new Scanner(System.in);
    	userNum=sc.nextInt();
    }
    
    void compareNum() {
    	makeComNum();
    	getUserNum();
    	
    	while(true) {
    		if  (comNum==userNum) {
        		System.out.println("�����Դϴ�.");
                break;        
    		} else {
        		System.out.println("������ �ƴմϴ�.");
        		getUserNum();
        	}
    	
    	}
    	
    	
    	
    	
    	
    }
    
    
}
