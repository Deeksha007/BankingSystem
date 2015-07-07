package banking;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Check_In
{
    static List<Check_In> users;
    static List<Exist> users1;
    String Nusername,myname, pwd;
    int age;
    char gender;
    public String getNusername() {
        return Nusername;
    }
    public void setNusername(String Nusername) {
        this.Nusername = Nusername;
    }
        
    Scanner sc2=new Scanner(System.in);
    public void Checked()       
    {
         users1 = new ArrayList<Exist>();
         users = new ArrayList<Check_In>();
         int exit=0;
        do
          { 
            System.out.println("This is a check_in page!");
            System.out.println();
            System.out.println("Press 'a' : new user");
            System.out.println("Press 'b' : Existing user.");
            System.out.println("Press 'c' : for checkout.");
            char ch2=sc2.next().charAt(0);
            
        switch(ch2)
        {
            
                case 'a':
                    {
                    System.out.println("fill the credentials : ");
                    Check_In obj9=new Check_In();
                    obj9.details(); 
                    users.add(obj9);
                    System.out.println();
                    choose();
                    
                    }
                    break;
                
               case 'b':
                    System.out.println("fill the credentials : ");     
                    Exist obj7=new Exist();
                    obj7.now();
                    users1.add(obj7);
                    System.out.println();
                    choose();
                   break;
                   
               case 'c':
                   exit=1;
                   System.out.println("You have successfully checked out!");
                   break;
                   
            default:
               System.out.println("Select a valid input! "); 
    }
          }while(exit!=1);
    }
   public void details()
    {  
       Scanner sc3=new Scanner(System.in);
        System.out.println("Username ");
        Nusername=sc3.nextLine();
        System.out.println("Age: ");
        age= sc3.nextInt();
        System.out.println("Gender: ");
        gender= sc3.next().charAt(0);
        sc3=new Scanner(System.in);
        System.out.println("Enter Password: ");
        pwd=sc3.nextLine();
    } 
   
    public void choose()
    {
        int exit=0;
        sc2=new Scanner(System.in);
        do
          { 
              System.out.println("Choose the account type.:");
               System.out.println("Press 'a' : Saving account.");
              System.out.println("Press 'b' : Current account.");
              System.out.print("Press 'c' to go back.");
              String x=sc2.next();
              if(x.length()>1)
              {
                   System.out.print("Input is not valid");
                  continue;
              }
                char ch4=x.charAt(0);
                Saving obj3 =new Saving();
                switch(ch4)
                {
                    case 'a':
                        obj3.save();
                        break;

                    case 'b':
                        obj3.save();
                        break;
                        
                    case 'c':
                    exit=1;
                        break;
                    
                    default:
                      System.out.println("Select a valid input! ");  
                }
           }
        while(exit!=1);
}
    public void showuserlist1()
    {
        System.out.println();
        System.out.println("List of new users:" );
             for (int i = 0; i < users.size(); ++i)
             {
                 System.out.println(i+" : "+""+users.get(i).Nusername);  
             }
            if(users.size()=='\0')
            {
                System.out.println("No user exist!");
            }
    }
    public void showuserlist2()
    {        
        System.out.println();
        System.out.println("List of existing users:");
             for (int i = 0; i < users1.size(); ++i)
             {
                System.out.println(i+" : "+""+users1.get(i).Eusername);
             }
             if(users1.size()=='\0')
            {
                System.out.println("No user exist!");
            }
    }         
    public void searchuser()
    {
        int exit=0;
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter the username you want to search");
        myname = sc2.nextLine();
       for(Check_In user:users)
       {
           if(user.getNusername().equals(myname))
           {
              System.out.println("Username found in new user list.");
           }
           else
           {
               exit=1;
               break;
           }
       }
       for(Exist user2:users1)
           {
               if(user2.getEusername().equals(myname))
                {
                    System.out.println("Username found in existing user list.");
                }
               else
               {
                   exit=2;
                   break;
               }
        }
       if(exit==1)
       { System.out.println("Username not found."); }
    }
}