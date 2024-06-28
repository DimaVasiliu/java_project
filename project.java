import java.util.Scanner;

public class project {
    public static void main(String[] args) {
       crud_customer Crud_Customer=new crud_customer();
       Scanner input= new Scanner(System.in);
       while(true)
       {
        menu.main_menu();
        int choice=input.nextInt();
        if (choice==1)
            {   menu.customer_menu();
                int customer_choice=input.nextInt();
                if (customer_choice==1)
                {
                    Crud_Customer.insert(); 
                }
                if (customer_choice==2)
                {
                    Crud_Customer.retieve();
                }
                if (customer_choice==3)
                {
                    Crud_Customer.modify();
                }
                if (customer_choice==4)
                {
                    Crud_Customer.delete();
                }
            }
        if (choice==2)
            {menu.staff_menu();
                int staff_choice = input.nextInt();
                if (staff_choice == 1) { //fulltime staff
                    menu.fulltimestaff_menu();
                }
                if (staff_choice == 2) {//parttime staff
                    menu.parttimestaff_menu();

                }
            }
        if (choice==3)
            {}
        if (choice==4)
            {}
        if (choice==5)
            {break;}
       }//end of main while


       input.close();
    }  //end of main
}//end of project class
