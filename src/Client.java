package src;

import java.util.Scanner;

public class Client{

    private int    clientId;
    private String name;
    private int    age;
    private String notes;
    
    public void setClientId(int _clientId){
        
        this.clientId = _clientId;
    }

    public int getClientId(){
        
        return this.clientId;
    }

    public Client(){
        
        JavaUtils.clearTerminal();
        
        System.out.println("========================");
        System.out.println("Please select an option of cliente");
        System.out.println("========================");        
    }

    public void run(){
        
        Scanner scanner = new Scanner(System.in);
        int iterator = 0;
        
        do{            
            
            System.out.println("1.Create a client");
            System.out.println("2.See clients");
            System.out.println("3.Update client");
            System.out.println("4.Delete a client");
            System.out.println("0. Exit");
        
            iterator = scanner.nextInt();


        } while (iterator != 0);

        scanner.close();
    }    

    private  void navegator(int _iterator){

        switch (_iterator) {
            
            case 1:
                
                System.out.println("Create a client");
                break;
        
            default:

                System.out.println("Invalid choice, try again");
                break;
        }

    }

    public void create(int _iterator){


    }

}