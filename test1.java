package test1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static java.lang.Math.sqrt;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        test1();
        test2();
        test3();

    }

    public static void test1(){
        Scanner in=new Scanner(System.in);
        System.out.println("please enter five numbers");//type of  value
        int[]a=new int[5];
        a[0]=in.nextInt();
        a[1]=in.nextInt();
        a[2]=in.nextInt();
        a[3]=in.nextInt();
        a[4]=in.nextInt();
        //sort
        int temp=0;
        for(int i=0;i<5;i++)
            for(int j=0;j<4-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        for(int k=0;k<=4;k++)
            System.out.println(a[k]);

    }
    public static void test2(){
        for(int b=101;b<301;b+=2)
        {

            int c=2;
            for(;c<=(int)sqrt(b);c++)
                if(b%c==0)
                    break;
            if(c>(int)sqrt(b))//判断上面额循环式自动结束还是强制退出，强制退出那么就不是素数
                System.out.println(b);
        }
    }
    public static void test3(){
        String h="helloword";
        int length=h.length();
        HashSet s=new HashSet();
        s.add(h);
        if(s.size()!=length)
        {
            System.out.println("There are the same characters in the string");
        }
        else {
            System.out.println("There are no same character in the string");
        }


    }
}


