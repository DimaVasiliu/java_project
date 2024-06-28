import java.util.Scanner;

class person {
    private String name;
    private String sex; 
    private String address;
    private int age;
    private String email;
    private String phone;

    Scanner input= new Scanner(System.in);

    public person() { } //empty constructors

    public person(String name, String sex, String address, int age, String email, String phone) {
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void print()
    {
       System.out.print("\n-------------------------"); 
       System.out.print("\nName: "+name); 
       System.out.print("\nAge: "+age); 
       System.out.print("\nPhone: "+phone); 
       System.out.print("\nGender: "+sex); 
       System.out.print("\nAddress: "+address); 
       System.out.print("\nEmail: "+email); 

    }

    public void input()
    {   
        System.out.print("\n-------------------------"); 
        System.out.print("\nEnter the name: ");
        name=input.nextLine();
        System.out.print("\nEnter the Age: ");
        age=input.nextInt();
        input.nextLine();  // clear the buffer
        System.out.print("\nEnter the Phone: ");
        phone=input.nextLine();
        System.out.print("\nEnter the Gender: ");
        sex=input.nextLine();
        System.out.print("\nEnter the Address: ");
        address=input.nextLine();
        System.out.print("\nEnter the Email: ");
        email=input.nextLine();
    }



}