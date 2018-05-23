package src;

import java.util.Scanner;

public class InToEng {

    // メインメソッド
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();     
        System.out.println(translateEng(input));    
}

   