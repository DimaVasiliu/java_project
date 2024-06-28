import java.util.ArrayList;
import java.util.Scanner;

public class crud_customer {
    private ArrayList<customer> customer_data= new ArrayList<customer>();
    Scanner input=new  Scanner(System.in);

    public crud_customer()
    {
    customer c1=new customer("Dima", "Male", "London", 32, "dima@gmail.com", "333", 230.45);
    customer c2=new customer("Lily", "Female", "London", 28, "lily@gmail.com", "222", 330.5);
    customer c3=new customer("poppy", "Female", "London", 42, "poppy@gmail.com", "333", 450.2);
    customer_data.add(c1);
    customer_data.add(c2);
    customer_data.add(c3);   
    }

    public void insert()
    {
       customer new_data= new customer(); 
       new_data.input();
       customer_data.add(new_data);
       System.out.println("\n Customer data added successfully....");
    }

    public void modify()
    {
       try{
        System.out.println("\n Please input the phone of the record to modify: ");
        String search_phone=input.nextLine();
        boolean found=false;
        for (customer x : customer_data) {
            if (x.getPhone().equals(search_phone))
            {
                found=true;
                x.print();
                customer modified_data= new customer(); 
                modified_data.input();
                customer_data.add(modified_data);
                customer_data.remove(x);
                System.out.println("\n Customer data modified successfully....");
                break;
            }
        }  
        if (found==false)
            {System.out.println("\nSorry not found");}       
       }
       catch(Exception ex)
       {
        System.out.println("\nSomething went wrong");
       }
    }

    public void retieve()
    {
        System.out.println("Enter The phone number of the customer ");
        String entered_phone=input.nextLine();
        boolean found=false;
        for (customer x : customer_data) {
            if (x.getPhone().equals(entered_phone))
            {
                found=true;
                x.print();
                break;
            }
        }  
        if (found==false)
            {System.out.println("\nSorry not found");}
    }

    public void delete()
    {
        System.out.println("Enter The phone number of the customer ");
        String entered_phone=input.nextLine();
        boolean found=false;
        for (customer x : customer_data) {
            if (x.getPhone().equals(entered_phone))
            {
                found=true;
                x.print();
                System.out.print("\nAre you sure to delete (yes/no)");
                String response=input.nextLine();
                if (response.toLowerCase().equals("yes"))
                 {
                    customer_data.remove(x);
                    System.out.print("\nData got deleted successfully");
                 }
                break;
            }
        }  
        if (found==false)
            {System.out.println("\nSorry not found");}
    }

}
