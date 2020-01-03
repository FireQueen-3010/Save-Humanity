/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fire_queen.diksha.hackerrank_test;

/**
 *
 * @author user
 */

    import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SaveHumanity {

    /*
     * Complete the virusIndices function below.
     */
     static void virusIndices(String p, String v) {
        int matchFound=0;
        String trial="";
        for(int i=0;i<=(p.length()-v.length());i++)
        {
               int count=0;
        for(int j=i;j<=(i+v.length()-1);j++)
                {
                    if(p.charAt(j)!=v.charAt(j-i))
                    count++;
                    if(count>1)
                    break;
                }
                if(count<=1)
                {
                   System.out.print(i+" ");
                matchFound++;
                }
        }
       if(matchFound==0)
       System.out.println("No Match!");
       else
       System.out.println();
   }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] pv = scanner.nextLine().split(" ");

            String p = pv[0];

            String v = pv[1];

            virusIndices(p, v);
        }
    }
}
    
