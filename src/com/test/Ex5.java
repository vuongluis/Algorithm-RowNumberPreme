package com.test;

import java.util.Scanner;

import com.exception.SoAmException;
import com.main.Number;

@SuppressWarnings("all")
public class Ex5 {
	public static void main(String[]args){
		boolean cont = false;
		String outStr = "";
		do{
			try{
				System.out.print("Vui lòng nhập số: ");
				int n = Integer.parseInt(new Scanner(System.in).nextLine());
				if(n < 0){
					throw new SoAmException("Số âm không hợp lệ!");
				}
				for(int i = 0; i < n;i++){
					if(new Number().checkPrime(i)){
						outStr += i+" ";
					}
				}
				System.out.println("Dãy số nguyên tố < "+n+" : "+new String(outStr).substring(0, outStr.length()-1));
			}catch(NumberFormatException ex){
				System.out.print(ex.getMessage());
				cont = true;
			}catch(SoAmException exx){
				System.out.print(exx.getMessage());
				cont = true;
			}
			System.out.print("\n");
		}while(cont);
	}
}
