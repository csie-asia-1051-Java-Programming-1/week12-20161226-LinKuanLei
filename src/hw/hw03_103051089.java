package hw;

/*
 * Topic:斷詞在自然語言的研究上是個很重要的步驟，主要就是將關鍵字從句子中斷出，英文的斷詞較為簡單，就根據句子中的空格將英文字隔開。將輸入的句子進行斷詞，將斷出的關鍵字依照句子中的出現排序列印出。全部轉成小 寫，列印出的關鍵字不得重複，關鍵字間以一個空格隔開，最後一個關鍵字後面進行 換行。例如輸入 How do you do ，則輸出 how do you

 * Author: 103051089 林冠磊
 */
import java.util.Scanner;

public class hw03_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();        
        String data[] = str.split(" ");
        for(int i = 0; i < data.length; i++){
        	data[i] = data[i].toLowerCase();
        }
        int i = 0, j = 0;
        System.out.print(data[0] + " ");
        for (i = 1; i < data.length; i++) {
        	for (j = i - 1; j >= 0; j--) {
        		if (data[j].equals(data[i]))
        			break;
        		}
                if (j == -1) {
                    System.out.print(data[i]+" ");
                }
            }
            System.out.println();
        }	

}
