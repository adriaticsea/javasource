package baseball;

import java.util.Scanner;

public class BBgame {
	    int[] numbers = new int[3];
	    int[] inputNums = new int[3];
	    
	    
	    void makeNum() {
	    	for(int i=0; i<numbers.length;i++) {
	    		numbers[i]=(int)(Math.random()*9);
	    		System.out.print(numbers[i]+", ");
	    	}
	    }
	    
	    void inputNum() {
	         Scanner sc = new Scanner(System.in);
	         System.out.println("");
	         System.out.println("첫번째 숫자를 넣으세요");
	         int inputNum1= sc.nextInt();
	
	         System.out.println(inputNum1+"이 아닌 두번째 숫자를 넣으세요");
	         int inputNum2= sc.nextInt();
	         
	         System.out.println(inputNum1+"와 "+inputNum2+"가 아닌 세번째 숫자를 넣으세요");
	         int inputNum3= sc.nextInt();
	         
	         inputNums[0]=inputNum1;
	         inputNums[1]=inputNum2;
	         inputNums[2]=inputNum3;
	         
	    }
	    
	   
	    void compareNum() {
			makeNum();
			
			while (true) {
				int strike = 0;
				int ball = 0;
				inputNum();
				
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if (numbers[i] == inputNums[j] && i == j) {
							strike = strike + 1;
						} else if (numbers[i] == inputNums[j] && i != j) {
							ball = ball + 1;
						}
					}
				}

				if (strike == 3) {
					System.out.println("정답입니다.");
					break;
				} else {
					System.out.println(strike + "strike, " + ball + "ball \n");
				}
			}
		}
	      
	     
	          
	       
	       
}
