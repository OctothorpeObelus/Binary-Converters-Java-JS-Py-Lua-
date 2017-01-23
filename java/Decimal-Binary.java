import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class Main{

     public static void main (String str[]) throws IOException {

         // c 2017 Michael Smith
         
         Scanner scan = new Scanner(System.in);
         int decimal = scan.nextInt();
         String binary = "";
         int[] bits = { 128, 64, 32, 16, 8, 4, 2, 1 };
         while ( decimal > 0 ) {
         for (int i = 0; i < bytes.length; i++) {
           if (decimal < 256) {
             if (decimal >= bits[i]) {
               decimal -= bits[i];
                 binary += "" + 1 + "";
             } else {
                 binary +="" + 0 + "";
             }
           } else {
               decimal -= 255;
               binary += "" + 11111111 + " ";
           }
         }
         System.out.println(binary);
       }
       
     }

}
