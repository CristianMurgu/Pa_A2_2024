/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laborator1base;

/**
 *
 * @author admin
 */
public class Laborator1base {

    public static int digit(int value)
    {
        int digitSum=0;
        while(value!=0)
        {
            digitSum=digitSum+value%10;
            value=value/10;
        }
        if(digitSum%100==digitSum%10)
            return digitSum;
        else
            return digit(digitSum);
    }
    public static void main(String[] args) {
        int n = (int) (Math.random() * 1_000_000);
        n= n * 3;
        String[] languages={"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        String hexNum= "FF";
        String binNum= "10101";
        int decimal1= Integer.parseInt(hexNum,16);
        int decimal2= Integer.parseInt(binNum,2);
        n=n+decimal1+decimal2;
        n=n*6;
        int result= digit(n);
        System.out.println(result);
        System.out.println("Willy-nilly, this semester I will learn " + languages[result]);
    }
}
