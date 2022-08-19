import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input.close();
        String s=Integer.toString(n);
        if (n==Integer.parseInt(s))
        {
            System.out.print("Good job");
        }
        else
        {
            System.out.print("Wrong Answer");
        }
        }
    }
