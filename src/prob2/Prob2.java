package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		
		//scan
		Scanner sc = new Scanner(System.in);
		System.out.print("금액: ");
		int price = sc.nextInt();
		System.out.println();
		
		//print
		int num;
		int residue = price;
		
		num = residue/50000;
		residue = residue-num*50000;
		System.out.println("오만 원권: "+num+"매");	
		
		num = residue/10000;
		residue = residue-num*10000;
		System.out.println("만 원권: "+num+"매");
		
		
		num = residue/5000;
		residue = residue-num*5000;
		System.out.println("오천 원권: "+num+"매");
		
		num = residue/1000;
		residue = residue-num*1000;
		System.out.println("천 원권: "+num+"매");
		
		num = residue/500;
		residue = residue-num*500;
		System.out.println("500원 동전: "+num+"개");
		
		num = residue/100;
		residue = residue-num*100;
		System.out.println("100원 동전: "+num+"개");
		
		num = residue/50;
		residue = residue-num*50;
		System.out.println("50원 동전:"+num+"개");
		
		num = residue/10;
		residue = residue-num*10;
		System.out.println("10원 동전:"+num+"개");
		
		System.out.println("1원 동전:"+residue+"개");
		
	}
}


