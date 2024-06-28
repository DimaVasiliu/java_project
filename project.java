import java.util.Scanner;

public class project {
    public static void main(String[] args) {
       crud_customer Crud_Customer=new crud_customer();
       crud_parttimestaff Crud_parttimestaff = new crud_parttimestaff();
       crud_fulltimestaff Crud_fulltimestaff = new crud_fulltimestaff();
       Scanner input= new Scanner(System.in);
       while(true)
       {
        menu.main_menu();
        int choice=input.nextInt();
        if (choice==1)
            {   menu.customer_menu();
                int customer_choice=input.nextInt();
                if (customer_choice==1) Crud_Customer.insert();
                if (customer_choice==2) Crud_Customer.retrieve();
                if (customer_choice==3) Crud_Customer.modify();
                if (customer_choice==4) Crud_Customer.delete();
            }
        if (choice==2)
            {menu.staff_menu();
                int staff_choice = input.nextInt();
                if (staff_choice == 1) { //fulltime staff
                    menu.fulltimestaff_menu();
                    int fts_choice = input.nextInt();
                    if (fts_choice==1) Crud_fulltimestaff.insert();
                    if (fts_choice==2) Crud_fulltimestaff.retrieve();
                    if (fts_choice==3) Crud_fulltimestaff.modify();
                    if (fts_choice==4) Crud_fulltimestaff.delete();
                }
                if (staff_choice == 2) {//parttime staff
                    menu.parttimestaff_menu();
                    int pts_choice = input.nextInt();
                    if (pts_choice==1) Crud_parttimestaff.insert();
                    if (pts_choice==2) Crud_parttimestaff.retrieve();
                    if (pts_choice==3) Crud_parttimestaff.modify();
                    if (pts_choice==4) Crud_parttimestaff.delete();
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
