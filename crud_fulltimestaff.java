import java.util.ArrayList;
import java.util.Scanner;

public class crud_fulltimestaff {
    private ArrayList<fulltimestaff> fts_data= new ArrayList<>();
    Scanner input=new  Scanner(System.in);

    public crud_fulltimestaff()
    {
        fulltimestaff f1=new fulltimestaff("Dima", "Male", "London", 32, "example@gmail.com", "0011", 30, 33.0);
        fulltimestaff f2=new fulltimestaff("Lily", "Female", "London", 28, "example@gmail.com", "01010", 30, 40.0);
        fulltimestaff f3=new fulltimestaff("Iura blyadi", "Male", "London", 23, "example@gmail.com", "01200", 23, 30.0);
        fts_data.add(f1);
        fts_data.add(f2);
        fts_data.add(f3);
    }

    public void insert()
    {
        fulltimestaff new_data= new fulltimestaff("Iura blyadi", "Male", "London", 23, "example@gmail.com", "01200", 23, 30.0);
        new_data.input();
        fts_data.add(new_data);
        System.out.println("\n Full time staff data added successfully....");
    }

    public void modify()
    {
        try{
            System.out.println("\n Please input the phone of FT staff to modify: ");
            String search_phone=input.nextLine();
            boolean found=false;
            for (fulltimestaff x : fts_data) {
                if (x.getPhone().equals(search_phone))
                {
                    found=true;
                    x.print();
                    fulltimestaff modified_data= new fulltimestaff(search_phone, "Male", "London", 23, "example@gmail.com", "01200", 23, 30.0);
                    modified_data.input();
                    fts_data.add(modified_data);
                    fts_data.remove(x);
                    System.out.println("\n FT staff data modified successfully....");
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

    public void retrieve()
    {
        System.out.println("Enter the phone number of the FT staff ");
        String entered_phone=input.nextLine();
        boolean found=false;
        for (fulltimestaff x : fts_data) {
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
        System.out.println("Enter the phone number of the FT staff: ");
        String entered_phone=input.nextLine();
        boolean found=false;
        for (fulltimestaff x : fts_data) {
            if (x.getPhone().equals(entered_phone))
            {
                found=true;
                x.print();
                System.out.print("\nAre you sure to delete (yes/no)");
                String response=input.nextLine();
                if (response.toLowerCase().equals("yes"))
                {
                    fts_data.remove(x);
                    System.out.print("\nData got deleted successfully");
                }
                break;
            }
        }
        if (found==false)
        {System.out.println("\nSorry not found.");}
    }

}

