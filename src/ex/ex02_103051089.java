package ex;
/*
 * Topic: 給定一字串，請將此字串中，每個字元的 ASCII 編碼數值進行加總，輸出其編碼數 值總和。舉例來說，若輸入之字串為 “abcdefghij” 共 10 個字元，其 ASCII 編碼依序為 “97 98 99 100 101 102 103 104 105 106” ，則編碼總和輸出為 1015 。
 * Date: 2016/12/26
 * Author: 103051089 林冠磊
 */

import java.util.Scanner;

public class ex02_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		int [] sum = new int[n];
		for(int i = 0; i < n; i++){
			String str = sc.nextLine();
			char[] data = str.toCharArray();
			
			for(char val : data){
				sum[i] += (int)val;
			}
			
		}
		for(int val : sum){
			System.out.println(val);
		}
	}

}
