/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laborator1;

import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Laborator1 {

    public static boolean prob1(int var, int k)
    {
        int varAux= var;
        int varK=0;
        while(var!=0)
        {
            varK= varK+(var%10)*(var%10);
            var=var/10;
        }
        if(varK!=k && varK<varAux)
            return prob1(varK, k);
        else if(varK>varAux || ((varK==1 || varK==0) && varK>k))
            return false;
        return true;
    }
    
    public static int prob2(int a, int b, int k)
    {
        int howMany= 0;
        for(int i=a; i<=b; i++)
        {
            if(prob1(i,k)==true)
            {
                howMany++;
            }
        }
        return howMany;
    }
    
    public static String prob3(int a, int b, int k)
    {
        String numbers="";
        for(int i=a; i<=b; i++)
        {
            if(prob1(i,k)==true)
            {
                numbers=numbers+i+" ";
            }
        }
        return numbers;
    }
    
    public static void main(String[] args) {
        long startTime= System.currentTimeMillis();
        Scanner input= new Scanner(System.in);
        
        //prob1
        /*int inProb1= input.nextInt();
        int inProb1k= input.nextInt();
        System.out.println(prob1(inProb1, inProb1k));*/
        
        //prob2
        /*int inProb2a= input.nextInt();
        int inProb2b= input.nextInt();
        int inProb2k= input.nextInt();
        System.out.println(prob2(inProb2a, inProb2b, inProb2k));*/
        
        //prob3
        /*int inProb3a= input.nextInt();
        int inProb3b= input.nextInt();
        int inProb3k= input.nextInt();
        System.out.println(prob3(inProb3a, inProb3b, inProb3k));*/
        
        //prob4
        long endTime= System.currentTimeMillis();
        System.out.println("Time used: " + (endTime-startTime) + "miliseconds");
        
        //System.out.println("Hello World!");
    }
}
