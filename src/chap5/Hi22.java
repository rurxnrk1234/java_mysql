package chap5;

import java.util.Scanner;

public class Hi22 {

	public static void main(String[] args) {
		boolean run = true;
		int PepoleNum = 0;
		int scores[] = null;
		Scanner scanner = new Scanner(System.in);
		
            while(run) {
            	System.out.println("1.이호재 | 2.김윤호 | 3.허성백");
				System.out.println("고객> ");
            	
            	int selectNo = Integer.parseInt(scanner.nextLine());
            	
            	if(selectNo == 1) {
            		System.out.print("질문 : ");
            		PepoleNum = Integer.parseInt(scanner.nextLine());
					scores = new int[PepoleNum];
            		System.out.println("1.접근성 용이 | 2.고객응대서비스| 3.편의시설 | 4.상품의 다양성");
					PepoleNum = Integer.parseInt(scanner.nextLine());
            		scores = new int[PepoleNum];
            		System.out.println("1.매우만족 | 2.만족 | 3.보통 | 4.불만족 | 5.매우 불만족");
					PepoleNum = Integer.parseInt(scanner.nextLine());
/*             	}else if(selectNo == 2) {
            		System.out.print("고객> ");
            		PepoleNum = Integer.parseInt(scanner.nextLine());
            		scores = new int[PepoleNum];
            		System.out.print("김윤호> ");
            		scores = new int[PepoleNum];
            		System.out.print("고객만족도> ");
            		scores = new int[PepoleNum];
            		System.out.println("만족");    */
/*             	}else if(selectNo == 3) {
            		System.out.print("고객> ");
            		PepoleNum = Integer.parseInt(scanner.nextLine());
            		scores = new int[PepoleNum];
            		System.out.print("허성백> ");
            		scores = new int[PepoleNum];
            		System.out.print("고객만족도> ");
            		scores = new int[PepoleNum];
            		System.out.println("보통");    */

            		run = false;
            }
}
        } 
	}