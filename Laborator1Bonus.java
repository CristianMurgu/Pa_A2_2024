/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laborator1bonus;

import java.util.Scanner;
/**
 *
 * @author admin
 */

public class Laborator1Bonus {
    public static int[][] wheelGraph(int n)
    {
        int matrix[][]= new int[n][n];
        for(int i=1;i<n;i++)
        {
            matrix[0][i]=matrix[i][0]=1;
        }
        for(int i=1;i<n;i++)
        {
            matrix[i][i-1]=1;
            matrix[i-1][i]=1;
        }
        matrix[n-1][1]=matrix[1][n-1]=1;
        return matrix;
    }
    
    public static int[] getGrades(int ma[][], int n)
    {
        int grades[]= new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                grades[i]+=ma[i][j];
            }
        }
        return grades;
    }
    
    public static int cycles(int n)
    {
        int cycles=1; //the cycle without the hub node
        for(int i=1;i<=n-2;i++)
        {
            cycles+=(n-1);
            
        }
        return cycles;
    }
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int num=input.nextInt();
        /*int matrix[][]=wheelGraph(num);
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print('\n');
        }*/
        System.out.print(cycles(num));
    }
}
