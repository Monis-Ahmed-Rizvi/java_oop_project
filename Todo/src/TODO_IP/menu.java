package TODO_IP;
import java.util.*;
public class menu {
	
	public static void main(String[] args) {
	 TaskFunctionImp t_obj = new TaskFunctionImp();
	 UserFunctionImp u_obj = new UserFunctionImp();
     visitorMenu v_obj  = new visitorMenu();
     Scanner sc = new Scanner(System.in);
     int ch = 0;
     String password,email;
     boolean status = false;
     User u;
     
     
     do {
    	 
    	 System.out.println("1 Login");
  	     System.out.println("2 register");
    	 System.out.println("0 Logout");
    	 
    	 ch = sc.nextInt();
    	 
    	 switch(ch)
    	 {
    	 
    	   
    	 case 1:
    		 
    		 if(u_obj.isEmpty() == true)
    		 {
    			 System.out.println("NO accounts available");
    		 }
    		 else
    		 {
    			 Scanner str1 = new Scanner(System.in);
    			 System.out.println("Enter a email");
    			 email = str1.nextLine();
    			 System.out.println("Enter the password");
    			 password = str1.nextLine();
    			 u = u_obj.login(email, password);
    			 
    			 if(u==null)
    			 {
    				 System.out.println("Account does not exist");
    			 }
    			 else
    			 {
    				 if(u.getType().equalsIgnoreCase("Visitor"))
    				 {
    					 visitorMenu vObj = new visitorMenu();
    					 vObj.visitor_Menu(t_obj, u_obj, u.getName());
    				 }
    				 else if(u.getType().equalsIgnoreCase("Client"));
    				 {
    					 System.out.println("client");
    					 clientMenu cObj = new clientMenu();
    					 cObj.client_Menu(t_obj, u_obj);
    				 }
    				
    				 
    			 }
    			 
    		 }
    		 break;
    	 case 2:
    		 if(u_obj.isFull() == true)
    		 {
    			 System.out.println("Error account couldnt be created ");
    		 }
    		 else
    		 {
    			 status = false;
    			 u = new User();
    			 Scanner str = new Scanner(System.in);
    			 System.out.println("Enter the name ");
    			 u.setName(str.nextLine());
    			 System.out.println("Enter the email ");
    			 u.setEmail(str.nextLine());
    			 System.out.println("Enter the password");
    			 u.setPassword(str.nextLine());
    			 System.out.println("Enter type of account");
    			 u.setType(str.nextLine()); 
    			 status = u_obj.register(u);
    			 
    			 if(status==true)
    			 {
    				 System.out.println("User registred");
    			 }
    			 else
    			 {
    				 System.out.println("User couldnt be regisred");
    			 }
    			 
    		 }
    		 
    		 
    		 
    		 
    	 case 0:
    		 System.out.println("Logging out");
    		 break;
    	 default:
    		 System.out.println("Invalid input");
    	 
    	 
    	 }
    	 
    	 
    	 
     }while(ch!=0);
     
     
     
	}
}
