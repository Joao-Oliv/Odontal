package src;

import java.util.Scanner;

public class Menu {
 
    public Menu(){
        
        System.out.println("================================");
        System.out.println("ODONTAL CLINIC SYSTEM");
        System.out.println("====================================");                         
    }

    public void menuChoice(){

        Scanner scanner = new Scanner(System.in);
        int     iterator = 0;

        do{
            
            System.out.println("1. Register New Patient");
            System.out.println("2. List All Patients");
            System.out.println("3. View / Manage Patient Details");
            System.out.println("4. Delete Patient");
            System.out.println("5. Exit");
            System.out.println("====================================");
            System.out.println("Select an option:");
        
            iterator = scanner.nextInt();
            
            this.navegator(iterator);

        } while(iterator != 5);

        scanner.close();
    }


    public void navegator(int _iterator){

        JavaUtils.clearTerminal( );

        switch (_iterator){
            
            case 1:

                System.out.println("1");
                break;

            case 2:
                System.out.println("2");
                break;

            case 3:
                System.out.println("3");
                break;

            case 4:
                System.out.println("4");
                break;
            
            case 5:

                System.out.println("Bye");
                break;    

            default:
                
                System.out.println("Invalid choice! Try again");
                break;
        }
    }
}
