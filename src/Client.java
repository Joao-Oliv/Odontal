package src;

import java.util.List;
import java.util.Scanner;

public class Client{

    private int    clientId;
    private String name;
    private int    age;
    private String notes;
    
    public int getClientId() { return this.clientId; } 
    public String getName()  { return this.name; }
    public int getAge()      { return this.age; }
    public String getNotes() { return  this.notes; }


    public void setClientId(int _clientId) { this.clientId = _clientId; }
    public void setName(String _name)      { this.name     = _name; }
    public void setAge(int _age)           { this.age      = _age; }
    public void setNotes(String _notes)    { this.notes    = _notes; } 

    public Client(){
        
        JavaUtils.clearTerminal();
        
        // System.out.println("========================");
        // System.out.println("Please select an option of cliente");
        // System.out.println("========================");          
    }

    public void run(){
        
        // Scanner scanner = new Scanner(System.in);
        // int iterator = 0;
        
        // do{            
            
        //     System.out.println("1. Create a client");
        //     System.out.println("2. See clients");
        //     System.out.println("3. Update client");
        //     System.out.println("4. Delete a client");
        //     System.out.println("0. Exit");
        
        //     iterator = scanner.nextInt();


        // } while (iterator != 0);

        // scanner.close();
    }    

    public void create(List<Client> _patientList){
        if (_patientList != null) {
            Scanner scanner = new Scanner(System.in);            

            JavaUtils.clearTerminal();  
            System.out.println("1. Register a patient");
            System.out.println("Please insert the patient data:");
            System.out.println("Name : ");                        
            this.setName(scanner.next());
            
            System.out.println("Age: ");
            this.setAge(scanner.nextInt());

            System.out.println("Notes: ");
            this.setNotes(scanner.next());

            _patientList.add(this);

            System.out.println("Patient created sucessfully!");

            //scanner.close();
        }        
    }

    public void showPatients(List<Client> _patientList){
        if (_patientList.isEmpty()) { 
            System.out.println("There is not client yet");
            return;
        }
        else {
            for (int i = 1; i < _patientList.size(); i++) {
                System.out.println(_patientList.get(i).getName());
            }
        }

    }
}