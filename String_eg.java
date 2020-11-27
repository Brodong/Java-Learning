/***********************************************
 ♡      Filename : String_eg.java
 ♡ 
 ♡   Description : ---
 ♡        Author : Li Xudong
 ♡       Contact : 757264690@qq.com
 ♡       Created : 2020-11-27
************************************************/
public class String_eg{
    public static void main(String[] args)
    {
        String ini_s = "aBcDeFgHiJkLmN";
        System.out.println("The length is "+ini_s.length());
        System.out.println("The first char is : "+ini_s.charAt(0));
        System.out.println("Upper case : "+ini_s.toUpperCase());
        System.out.println("Lower case : "+ini_s.toLowerCase());
        System.out.println("replace a to 1 : "+ini_s.replace('a', '1'));
        System.out.println("substring is : "+ini_s.substring(1, 3));
    }
}
