package findnum;

import java.util.Scanner;

public class Findnum {
     //필드(변수)
    int comNum;
    int userNum;
	
	//생성자
    Findnum() {};
	
    //매서드(함수)
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
        		System.out.println("정답입니다.");
                break;        
    		} else {
        		System.out.println("정답이 아닙니다.");
        		getUserNum();
        	}
    	
    	}
    	
    	
    	
    	
    	
    }
    
    
}
