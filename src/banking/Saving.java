package banking;
import java.util.Scanner;
public class Saving 
{
    double initialamt=0,depositamt,finalamt,wdraw;
    
   public void save()
    {
        int exit=0;
        Scanner sc3=new Scanner(System.in);
         
         
    do{
        System.out.println("Press 'a' to Credit amount.");
         System.out.println("Press 'b' to Debit amount.");
         System.out.println("Press 'c' to go back.");   
        char ch3;
       ch3 = sc3.next().charAt(0);
       
       switch(ch3)
       {
           
           case 'a':
           {
               System.out.println("Here you can deposit amount");
               
                       System.out.println("You had initial balance is: "+initialamt);
                       
                            System.out.println("Enter the amount you want to deposit: ");
                            try
                            {
                            depositamt=sc3.nextDouble();
                            finalamt=initialamt+depositamt;
                            System.out.println("Amount deposited successfully!");
                            System.out.println(" Your New Balance is: "+finalamt); 
                            
                            initialamt=finalamt;
                            }
                            catch(Exception e)
                            { 
                                System.out.println("Please a provide a vlaid input."); 
                            }
                       }
                       
                       break;
            
            case 'b':
               System.out.println("Here you can withdraw the amount");
                    System.out.println("Your current balance is: "+finalamt);
                    System.out.println("Enter the amount you want to withdraw: ");
                    wdraw =sc3.nextDouble();
                    finalamt=finalamt-wdraw;
                    if(finalamt<0)
                    {
                        System.out.println("You do not have enough amount to withdraw!");
                        break;
                    }
                    System.out.println("Amount debited successfully!");
                    System.out.println(" Your new Balance is: "+finalamt);
               break;   
               
                
            case 'c':
                exit=1;
                break;
                
           default:
               System.out.println("Enter the valid input!");
              break;
       }
        }
        while(exit!=1);
    } 
}