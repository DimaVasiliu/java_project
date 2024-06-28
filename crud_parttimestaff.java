import java.util.ArrayList;
import java.util.Scanner;

public class crud_parttimestaff {
    private final ArrayList<parttimestaff> pts_data= new ArrayList<>();
    Scanner input=new  Scanner(System.in);

    public crud_parttimestaff()
    {
        parttimestaff s1=new parttimestaff("Dima", "Male", "London", 32, "example@gmail.com", "0011", 30, 33.0);
        parttimestaff s2=new parttimestaff("Lily", "Female", "London", 28, "example@gmail.com", "01010", 30, 40.0);
        parttimestaff s3=new parttimestaff("Iura blyadi", "Male", "London", 23, "example@gmail.com", "01200", 23, 30.0);
        pts_data.add(s1);
        pts_data.add(s2);
        pts_data.add(s3);
    }

    public void insert()
    {
        parttimestaff new_data= new parttimestaff();
        new_data.input();
        pts_data.add(new_data);
        System.out.println("\n Part time staff data added successfully....");
    }

    public void modify()
    {
        try{
            System.out.println("\n Please input the phone of PT staff to modify: ");
            String search_phone=input.nextLine();
            boolean found=false;
            for (parttimestaff x : pts_data) {
                if (x.getPhone().equals(search_phone))
                {
                    found=true;
                    x.print();
                    parttimestaff modified_data= new parttimestaff();
                    modified_data.input();
                    pts_data.add(modified_data);
                    pts_data.remove(x);
                    System.out.println("\n PT staff data modified successfully....");
                    break;
                }
            }
            if (!found)
            {System.out.println("\nSorry not found");}
        }
        catch(Exception ex)
        {
            System.out.println("\nSomething went wrong");
        }
    }

    public void retrieve()
    {
        System.out.println("Enter the phone number of the PT staff ");
        String entered_phone=input.nextLine();
        boolean found=false;
        for (parttimestaff x : pts_data) {
            if (x.getPhone().equals(entered_phone))
            {
                found=true;
                x.print();
                break;
            }
        }
        if (!found)
        {System.out.println("\nSorry not found.");}
    }

    public void delete()
    {
        System.out.println("Enter the phone number of the PT staff: ");
        String entered_phone=input.nextLine();
        boolean found=false;
        for (parttimestaff x : pts_data) {
            if (x.getPhone().equals(entered_phone))
            {
                found=true;
                x.print();
                System.out.print("\nAre you sure to delete (yes/no): ");
                String response=input.nextLine();
                if (response.equalsIgnoreCase("yes"))
                {
                    pts_data.remove(x);
                    System.out.print("\nData got deleted successfully.");
                }
                break;
            }
        }
        if (!found)
        {System.out.println("\nSorry not found.");}
    }

}
