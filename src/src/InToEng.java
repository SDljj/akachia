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
    	String[] ichi1 = {"eleven","twelve","thirteen","fourteen","sixteen","fifteen","sixteen","seventeen","eighteen","ninteen","twenty"}; 	
    	e = ichi1[n-10];
    	}else if(20<n && n<100) {
    		String[] ni = {"zero","teen","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    		String[] sa = {" ","one","two","three","four","five","six","seven","eight","nine","ten"};
    		int q = n%10;
    		String w = ni[n/10]+" "+sa[q];
    		e = w;   		
    	}else if(n==100) {
    		e = "one hundred";
    	}else if(n>100 && n<1000) {
    		String[] r = {"zero","teen","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    		String[] o = {" ","one","two","three","four","five","six","seven","eight","nine","ten"};
    		int u = n%10;
    		int cx = (n-((n/100)*100))/10;
    		//System.out.println(cx);
    		String f = o[n/100]+" hundred"+" "+r[cx]+" "+o[u];
    		//String f = r[n/100]+" hundred";
    		//String f = r[n/100]+" hundred"+o[n/10];
    		e = f;
    	}else if(n==1000) {
    		e = "thousand";
    	}else if(n>1000 && n<2000){
    		String[] z = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"}; 
    		String[] y = {"zero","teen","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    	    String[] sa = {" ","one","two","three","four","five","six","seven","eight","nine","ten"};
    	    
    	    int q=n%10;
    		int ue=(n-((n/100)*100))/10;
    		int oo=(n-((n/1000)*1000))/100;
    		
    		
    		
    		String xy =z[oo]+" "+y[ue]+" "+sa[q];
    		e = xy;   	
    		
    	}else if(n>1999 && n<10000) {
    	
    		String[] y = {"zero","teen","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    	    String[] sa = {" ","one","two","three","four","five","six","seven","eight","nine","ten"};
    	    
    
    		//System.out.println(cx);
    		//String f = o[n/100]+" hundred"+" "+r[cx]+" "+o[u];
    		//String f = r[n/100]+" hundred";
    		//String f = r[n/100]+" hundred"+o[n/10];
    		//e = f;
    	
    		int q=n%10;
    		int ue=(n-((n/100)*100))/10;
    		int oo=(n-((n/1000)*1000))/100;
    		int yz=(n-((n/10000)*10000))/1000;
    		
    		String ai = y[yz]+" "+sa[oo]+" "+y[ue]+" "+sa[q];
    		e = ai;   	
    		
    	}else if(n==10000) {
    		e="ten-thousand";
    		
    	}
        return e;
    }
	
}

   
