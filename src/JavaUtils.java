package src;

import java.io.IOException;
import java.lang.reflect.GenericSignatureFormatError;
import java.util.Scanner;

public class JavaUtils {
    
    public static void clearTerminal(){
        
         try {
            
            new ProcessBuilder("clear").inheritIO().start().waitFor();        
        
        } catch (InterruptedException | IOException e) {
            
            System.out.print("\033[H\033[2J\n");
            System.out.flush();        
        
        }
    } 

    public static boolean confirmMenu(){

        Scanner scanner = new Scanner(System.in);
        boolean ret = false;
        int     iterator = 0;

        do {

            System.out.println("Would like to leave?");
            System.out.println("1. Yes");
            System.out.println("0. No");

            try {

                iterator = scanner.nextInt();
        
            }
            catch (Exception e){

                iterator = 1;
                System.out.println("Invalid option, try again!");

            }

        } while (iterator != 1);

        return ret;
    } 

}
