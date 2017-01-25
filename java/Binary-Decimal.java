import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class Main{

     public static void main (String str[]) throws IOException {

         // c 2017 Michael Smith
         
         Scanner scan = new Scanner(System.in);
         System.out.println("Type some binary.");
         String binary = scan.nextLine();
         String text = "";
         String process[] = new String[binary.length()];
         int counter = 0;
         
         System.out.println(process[0]);
         
         for ( int i = 0; i < binary.length(); i++ ) {
             if ( binary.charAt(i) != 32 ) {
                 if ( process[counter] != null ) {
                     process[counter] += binary.charAt(i) + "";
                 } else {
                     process[counter] = binary.charAt(i) + "";
                 }
             } else {
                 counter += 1;
             }
         }
         
         System.out.println(process[0].charAt(7) + "\n" + counter);
         counter = 0;
         
         // TODO: Fix java.lang.NullPointerException on lines 37, 42, 45, 48, 51, 54, 57, and 60
         for ( int i = 0; i < process.length; i++ ) {
             if ( process[i].charAt(0) == 1 ) {
                 counter += 128;
                 System.out.println(counter);
             }
             if ( process[i].charAt(1) == '1' ) {
                 counter += 64;
             }
             if ( process[i].charAt(2) == '1' ) {
                 counter += 32;
             }
             if ( process[i].charAt(3) == '1' ) {
                 counter += 16;
             }
             if ( process[i].charAt(4) == '1' ) {
                 counter += 8;
             }
             if ( process[i].charAt(5) == '1' ) {
                 counter += 4;
             }
             if ( process[i].charAt(6) == '1' ) {
                 counter += 2;
             }
             if ( process[i].charAt(7) == '1' ) {
                 counter += 1;
                 process[i] = Integer.toString(counter);
                 counter = 0;
             } else {
                 process[i] = Integer.toString(counter);
                 counter = 0;
             }
         }
         System.out.println(process);
       
     }

}
