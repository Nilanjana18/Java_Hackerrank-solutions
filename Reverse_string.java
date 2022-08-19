import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int l=str.length();
        String reversestr="";
        for(int i=(l-1);i>=0;i--)
        {
            reversestr=reversestr+str.charAt(i);
        }
        if (str.toLowerCase().equals(reversestr.toLowerCase()))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
