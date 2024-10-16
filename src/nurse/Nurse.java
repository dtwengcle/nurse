package nurse;

import java.util.Scanner;


public class Nurse {
    
    static config conf = new config();
    
    public static void addNurse(){
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Id : ");
        int id = sc.nextInt();
        System.out.print("fname: ");
        String fn = sc.next();
        System.out.print("lname: ");
        String ln = sc.next();
        System.out.print("department: ");
        String dept = sc.next();
        System.out.print("contact_number: ");
        String tel  = sc.next();
        System.out.print("shift: ");
        String shift = sc.next();

        String sql = "INSERT INTO members (n_id, n_fname, n_lname, n_dept, n_contact_number, n_shift) VALUES (?, ?, ?, ?, ?)";


        conf.addRecord(sql, id, fn, ln, dept, tel, shift);
    }
    
      private void viewNurse(){
        config conf = new config();
        
        String qry = "SELECT * FROM nurse";
        String[] headers = {"ID", "Fname", "Lname", "Department", "Contact_number", "Shift"};
        String[] column = {"n_id", "n_fname", "n_lname", "n_department", "n_contact_number", "n_shift"};

        conf.viewRecords(qry, headers, column);
    
  
        
        
    }
      
       public void updateNurse() {
                 Scanner sc = new Scanner(System.in);
                 config conf = new config();
                 
                 System.out.println("Id : ");
                 String id = sc.next();               
                 System.out.println("Fname: ");
                 String fn = sc.next();
                 System.out.println("Lname: ");
                 String ln = sc.next();
                 System.out.println("Department: ");
                 String dept = sc.next();
                 System.out.println("Contac_number: ");
                 String tel = sc.next();
                 System.out.println("Shift: ");
                 String shift = sc.next();
                
                 
                 String qry = "UPDATE nusrse SET n_fname = ?, n_lname = ?, n_department = ?, n_contact_number = ? , n_shift = ? WHERE m_id = ?";
                 
                
                 conf.updateRecord(qry, id, fn, ln, dept, tel, shift);
             }
       
        public void deleteNurse(){
                 Scanner sc = new Scanner(System.in);
                 System.out.println("Enter ID to delete");
                 int id = sc.nextInt();
                 
                 String qry = "DELETE FROM nurse WHERE m_id = ? ";
                 config conf = new config();
                 conf.deleteRecord(qry, id);
                 
             }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response;

        
        do{
                
        System.out.println("1. ADD");
        System.out.println("2. VIEW");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        
        System.out.println("Enter action: ");
        int action = sc.nextInt();
        
        
        
          NURSE nurse = new NURSE();
        
        switch(action){
            case 1:
                nurse.addNurse();
                break;
                
            case 2:
                nures.viewNurse();  
                break;
            case 3:
                nurse.viewNusre();
                nurse.updateNusre();
              
                break;
            case 4:
                nurse.viewNusre();
                nurse.deleteNurse();
                nurse.viewNurse();
                
                break;
            case 5:
                System.out.println("Existing.....");
                break;
            default:
                System.out.println("Invalid action.Please try again.");
                
        }
        System.out.println("Do you want to continue? (yes/no): ");
        response = sc.next();
    }while(response.equalsIgnoreCase("yes"));
         System.out.println("Thank You, See you soones!");
         
         sc.close(); 
         
    } 
    
        






