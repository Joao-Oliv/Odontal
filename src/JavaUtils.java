package src;

import java.io.IOException;

public class JavaUtils {
    
    public static void clearTerminal(){
        
         try {
            
            new ProcessBuilder("clear").inheritIO().start().waitFor();        
        } catch (InterruptedException | IOException e) {
            
            System.out.print("\033[H\033[2J\n");
            System.out.flush();        
        }
    } 

}
