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
     String e = null;
     if(-1<n && n<11) {
     String[] ichi = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
     e = ichi[n];
     }else if(10<n && n<21) {
     String[] ichi1 = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen","twenty"};  
     e = ichi1[n-11];
    
    }else if(20<n && n<31){
    	String[] ichi2= {"twenty-one","twenty-two","twenty-three","twenty-four","twenty-five","twenty-six","twenty-seven","twenty-eight","twenty-nine","thirty"};
    	e = ichi2[n-21];
    
    }else if(30<n && n<41){
	String[] ichi3= {"thirty-one","thirty-two","thirty-three","thirty-four","thirty-five","thirty-six","thirty-seven","thirty-eight","thirty-nine","fourty"};
	e=ichi3[n-31];
   
    }else if(40<n && n<51){
    	String[] ichi4= {"fourty-one","fourty-two","fourty-three","fourty-four","fourty-five","fourty-six","fourty-seven","fourty-eight","fourty-nine","fifty"};
    	e=ichi4[n-41];
    }else if(50<n && n<61){
    	String[] ichi5= {"fifty-one","fifty-two","fifty-three","fifty-four","fifty-five","fifty-six","fifty-seven","fifty-eight","fifty-nine","sixty"};
    	e=ichi5[n-51];
    }else if(60<n && n<71){
    	String[] ichi6= {"sixty-one","sixty-two","sixty-three","sixty-four","sixty-five","sixty-six","sixty-seven","sixty-eight","sixty-nine","seventy"};
    	e=ichi6[n-61];
     }else if(70<n && n<81){
    	String[] ichi7= {"seventy-one","seventy-two","seventy-three","seventy-four","seventy-five","seventy-six","seventy-seven","seventy-eight","seventy-nine","eighty"};
    	e=ichi7[n-71];
     }else if(80<n && n<91){
    	String[] ichi8= {"eighty-one","eighty-two","eighty-three","eighty-four","eighty-five","eighty-six","eighty-seven","eighty-eight","eighty-nine","ninety"};
    	e=ichi8[n-81];
        
     }else if(90<n && n<101){
        	String[] ichi9= {"ninety-one","ninety-two","ninety-three","ninety-four","ninety-five","ninety-six","ninety-seven","ninety-eight","ninety-nine","one-hundred"};
        	e=ichi9[n-91];
    }
     return e;
    }
}