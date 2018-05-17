package src;

import java.util.Scanner;

public class InToEng {

    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String[] ichi = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
    	String e = ichi[n];
    	//StringBuffer number = null;
    	//String input = number.toString();
        return e;
    }
}