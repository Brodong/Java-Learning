/***********************************************
 ♡      Filename : Scanner_eg.java
 ♡ 
 ♡   Description : ---
 ♡        Author : Li Xudong
 ♡       Contact : 757264690@qq.com
 ♡       Created : 2020-11-27
************************************************/
import java.util.Scanner;

public class Scanner_eg{
    public static void main(String[] args)
    {
        int age;
        double score;
        Scanner scan = new Scanner(System.in);
        age = scan.nextInt();
        score = scan.nextDouble();
        System.out.println("Age=" + age);
        System.out.println("Score=" + score);
    }
}
