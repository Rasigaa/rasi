import java.io.*;
import java.util.*;
public class Guvi1{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int i,j=0;
        String a=s.next();
        String b="aeiouAEIOU";
        for(i=0;i<b.length();i++)
        {
            if(a.charAt(0)==b.charAt(i))
        j++;
        }
        if(j==0)
            System.out.print("constant");
            else
            System.out.print("vowel");
    }
}

