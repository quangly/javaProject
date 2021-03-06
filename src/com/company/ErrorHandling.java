/*
 * This program reads numbers from a text file and then prints the average
 * It also has error handling for file io and divide by zero
 */
package com.company;
import java.io.*;
import java.util.*;
/**
 *
 * @author Quang Ly
 */
public class ErrorHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        String inputFileName;
        Scanner in = new Scanner(System.in);
        System.out.println("What is the file name: /Users/quangly/git/myJava/src/com/company/numbers.txt ");
        inputFileName = in.nextLine();
        Scanner inFile = null;
        double total = 0;
        int count = 0;
        try{
            inFile = new Scanner(new File(inputFileName));
            while(inFile.hasNextDouble())
            {
                total += inFile.nextDouble();
                count++;
            }
            System.out.printf("Total " + total);
            System.out.printf("\nCount "  +count);
            System.out.printf("\nThe average is: %8.2f",(total/count));
            System.out.println();
        }catch(FileNotFoundException file)
        {
            System.out.println("Input file was not found, try again.");
            //remove the comment below to print the stack trace
            //file.printStackTrace();
        }
        
        finally{
         try{
                inFile.close();
        }
         catch(NullPointerException e)
        {
            System.out.println("Null Pointer exception has occurred.");
        }   
        }
   }
    
}
