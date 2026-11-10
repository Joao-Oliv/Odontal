package src;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Client{

    private List<Client> patientList;
    private int    clientId;
    private String name;
    private int    age;
    private String notes;
    
    public int getClientId() { return this.clientId; } 
    public String getName()  { return this.name; }
    public int getAge()      { return this.age; }
    public String getNotes() { return this.notes; }

    public void setClientId(int _clientId) { this.clientId = _clientId; }
    //public void setName(String _name)      { this.name     = _name; }
    //public void setAge(int _age)           { this.age      = _age; }
    public void setNotes(String _notes)    { this.notes    = _notes; } 

    public void run(){
                
        patientList = new ArrayList<>();

    }    

    public void create(){
        
            Scanner scanner = new Scanner(System.in);                        

            JavaUtils.clearTerminal();  

            do
            {
                System.out.println("1. Register a patient");
                System.out.println("Please insert the patient data:");
                System.out.print("Name: ");                        
                this.setName(scanner);
                
                System.out.print("Age: ");
                this.setAge(scanner);

                System.out.print("Notes: ");
                this.setNotes(scanner.next());
                this.setClientId(patientList.size() + 1);

                patientList.add(this);      
                
                System.out.println("Client added successfully!");

            } while (JavaUtils.confirmMenu());

        scanner.close();
    }

    public void showPatients(){
        
        if (patientList.isEmpty()) { 
            
            System.out.println("There is not client yet");            
            return;

        }
        else {
            
            for (int i = 1; i < patientList.size(); i++) {
                
                System.out.println(patientList.get(i).getClientId());
                System.out.println(patientList.get(i).getName());  
                System.out.println(patientList.get(i).getAge());
                System.out.println(patientList.get(i).getNotes());          
        
            }
        }
    }

    public void setName(Scanner _scanner) {

        boolean validName = false;

        if (_scanner != null) {

            do {
        
                try {

                    this.name = _scanner.next();                    
                    validName = true;

                } catch (Exception e) {

                    System.out.println("Warning: Invalid characteres, try again!");
                }

            } while (!validName);
        }
    }

    public void setAge(Scanner _scanner) {

        boolean validAge = false;

        if (_scanner != null) {

            do {
        
                try {

                    this.age = _scanner.nextInt();                    
                    validAge = true;

                } catch (Exception e) {

                    System.out.println("Warning: Invalid age, try again!");                
                    
                    _scanner.nextLine();
                }

            } while (!validAge);
        }
    }

    public void setNotes(Scanner _scanner) {

        boolean validName = false;

        if (_scanner != null) {

            do {
        
                try {

                    this.notes = _scanner.next();                    
                    validName = true;

                } catch (Exception e) {

                    System.out.println("Warning: Invalid note, try again!");
                }

            } while (!validName);
        }
    }
}