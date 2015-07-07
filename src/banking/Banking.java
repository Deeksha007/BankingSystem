package banking;
import java.util.Scanner;

public class Banking
{
    public static void main(String[] args)
    {
       Scanner sc1=new Scanner(System.in); 
       System.out.println("Welcome to the Banking management System!");
       int exit1=0;
     do{  
       
       System.out.println("Press 'a' for Check_In.");
       System.out.println("Press 'b' for User indetails.");
       char ch1=sc1.next().charAt(0);
       Check_In obj1=new Check_In();
       switch(ch1)
       {
           case 'a':
                obj1.Checked();
           break;  
               
           case 'b':
                exit1=1;
                Banking obj=new Banking();
                obj.info();
           break; 
               
           default:
                System.out.println("Please enter a valid input.");  
               
       }
     
     }
     while(exit1!=1);
     
}
    int exit=0;
    public void info()
     {
         Scanner sc2=new Scanner(System.in);
         Check_In obj2=new Check_In();
         char ch2;
     do
     {  
        System.out.println();
        System.out.println("To get the list of users checked_in, press: a");
        System.out.println("To search a particular user, press: b");  
        System.out.println("To get the list of existing users checked_in, press: c"); 
        System.out.println("For going back to main menu, press: e");
        ch2=sc2.next().charAt(0);
     switch(ch2)
        {
         case 'a':
             obj2.showuserlist1();
            break;
         
         case 'b':
             obj2.searchuser();
            break;
             
         case 'c':
             obj2.showuserlist2();
            break;
                
         case 'e':
             System.out.println("U hv successfully made all the transactions!");
             exit=1;   
            break;
             
         default:
             System.out.println("Please enter valid input!");
        }
      }
     while(exit!=1);
    }
}