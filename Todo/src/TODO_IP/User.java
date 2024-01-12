package TODO_IP;

public class User {
   
   private String name;
   private String email;
   private String password;
   private String type;
   
   User(){};
   User(String name,String email,String password,String type)
   {
	 this.name = name;
	 this.email = email;
	 this.password = password;
	 this.type = type;
   }
   
   
   public String getName()
   {
	   return this.name;
   }
   public String getEmail()
   {
	   return this.email;
   }
   public String getPassword()
   {
	   return this.password;
   }
   
   public String getType()
   {
	   return this.type;
   }
   
   
   public void  setName(String name)
   {
	   this.name = name;
   }
   public void setEmail(String email)
   {
	   this.email = email;
   }
   public void setPassword(String password)
   {
	   this.password = password;
   }
   public void setType(String type)
   {
	   this.type = type;
   }
   
   @Override
   public String toString()
   {
	   return "[ name:"+this.name+" email:"+this.email+" account type:"+this.type+"]";
   }
   
}
