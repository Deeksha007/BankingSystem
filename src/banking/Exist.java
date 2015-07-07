package banking;
import java.util.Scanner;
public class Exist 
{
    String Eusername,pwd1;
    
    //Creating setter and getter methods of instance variables.
    public String getEusername() {
        return Eusername;
    }
    public void setEusername(String Eusername) {
        this.Eusername = Eusername;
    }
    public void now()
    {
        
        int exit=0;
        do
        {
            Scanner sc2=new Scanner(System.in);
            sc2=new Scanner(System.in);
            System.out.println("Enter Username: "); 
            Eusername=sc2.nextLine();
            System.out.println("Enter Password: ");
            pwd1=sc2.nextLine();
            exit=1;
        }
        while(exit!=1);//To exit the loop.
   }
}