import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner=new Scanner(System.in);
    System.out.println("================================");
    for(int i=0;i<3;i++)
    {
    String s1=scanner.next();
    int n=scanner.nextInt();
    System.out.printf("%-15s%03d%n", s1, n );
    }
    System.out.println("================================");
    }
}
