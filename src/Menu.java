package src;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    
    private List<Client> patientList;
    private Client client;

    public Menu(){
        
        System.out.println("================================");
        System.out.println("ODONTAL CLINIC SYSTEM");
        System.out.println("====================================");                         
    }

    public void run(){

        Scanner scanner = new Scanner(System.in);
        int     iterator = 0;

        patientList = new ArrayList<>();

        do{             
            System.out.println("1. Register New Patient");
            System.out.println("2. List All Patients");
            System.out.println("3. View / Manage Patient Details");
            System.out.println("4. Delete Patient");
            System.out.println("0. Exit");
            System.out.println("====================================");
            System.out.println("Select an option:");
        
            iterator = scanner.nextInt();
            
            this.navegator(iterator);
        } while(iterator != 0);

        scanner.close();
    }


    public void navegator(int _iterator){

        JavaUtils.clearTerminal( );

        client = new Client();
        
        switch (_iterator){            
            case 1:
                client.create(patientList);
                break;

            case 2:

                client.showPatients(patientList);
                break;

            case 3:
                System.out.println("3");
                break;

            case 4:
                System.out.println("4");
                break;
            
            case 0:

                System.out.println("Bye");
                break;    

            default:
                
                System.out.println("Invalid choice! Try again");
                break;
        }
    }
}
