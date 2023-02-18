package com.company;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        


        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        String s=sc.nextLine();
        int c;
        Scanner r=new Scanner(s);
        int i;
        do
        {
            c=0;
            String w=r.next();
            for(i=0;i<w.length();i++)
            {
                char m=w.charAt(i);
                if(m=='A'||m=='E'||m=='I'||m=='O'||m=='U'||m=='a'||m=='e'||m=='i'||m=='o'||m=='u')
                {

                    if (i==0)
                    {
                        System.out.print(w.substring(i)+" "+w.substring(0,i)+"1 ");
                    }
                    else
                    {
                        System.out.print(w.substring(i)+" "+w.substring(0,i)+"2 ");
                    }
                    i=w.length();c++;
                }
            }
            if(c==0)
            {
                System.out.print(w +" ");
            }
        }while (r.hasNext());
    }
}


