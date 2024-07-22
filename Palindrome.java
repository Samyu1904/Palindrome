/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindrome;

/**
 *
 * @author samyu
 */
import java.util.*;
public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a, sum=0,org ;
       int n= 14641;
       org =n;
       while(n>0)
       {
           a= n%10;
           sum=(sum*10)+a;
           n=n/10;
       }
       if(sum != org )
       {
           System.out.println("Given Number is  notPalindrome");
       }
       else
       {
           System.out.println("number a palindrome");
       }
    }
}
