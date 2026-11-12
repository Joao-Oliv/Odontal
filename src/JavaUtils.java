package src;

import java.io.IOException;
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
        String  iterator = "N";
        boolean ret = false;
        boolean isCharValid = true;

        do {

            System.out.println("Would like to register another patient?");
            System.out.println("Y. Yes");
            System.out.println("N. No");

            try {

                iterator = scanner.next().toUpperCase();        
                ret      = iterator != "Y" ? true : false;
            }
            catch (Exception e){

                System.out.println("Invalid option, try again!");

                isCharValid = false;
            }

        } while (!isCharValid);

        scanner.close();

        return ret;
    } 

}
