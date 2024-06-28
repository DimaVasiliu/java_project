import java.util.ArrayList;
import java.util.Scanner;

public class crud_parttimestaff {
    private ArrayList<parttimestaff> pts_data= new ArrayList<parttimestaff>();
    Scanner input=new  Scanner(System.in);

    public crud_parttimestaff()
    {
        parttimestaff s1=new parttimestaff();
        parttimestaff s2=new parttimestaff();
        parttimestaff s3=new parttimestaff();
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
        if (found==false)
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
                System.out.print("\nAre you sure to delete (yes/no)");
                String response=input.nextLine();
                if (response.toLowerCase().equals("yes"))
                {
                    pts_data.remove(x);
                    System.out.print("\nData got deleted successfully");
                }
                break;
            }
        }
        if (found==false)
        {System.out.println("\nSorry not found.");}
    }

}
