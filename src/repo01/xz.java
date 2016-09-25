package repo01;
import java.util.Scanner;
public class xz {
/*
 * Topic: 
 * Date: 2016/09/19
 * Author: 105021059  王俊鑌
 *1. 假設我們要用二進制來表示 n 種狀態，請寫一個程式來計算記錄這 n 種狀態
 *需要多少位元 (例如: n = 3 則需要 2bits)  (log(n)/log(2)
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(Math.ceil(Math.log(n)/Math.log(2)+0.09));
		
	}

}
 
	



