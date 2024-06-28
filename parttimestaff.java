public class parttimestaff extends person{
    private int nhour;
    private double rate;

    public parttimestaff() {}

    public parttimestaff(String name, String sex, String address, int age, String email, String phone, int nhour,
            double rate) {
        super(name, sex, address, age, email, phone);
        this.nhour = nhour;
        this.rate = rate;
    }

    public int getNhour() {
        return nhour;
    }

    public void setNhour(int nhour) {
        this.nhour = nhour;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void print()
    {
      super.print();
      System.out.print("\nNumber of hours worked: "+nhour); 
      System.out.print("\nHourly rate: "+rate); 
    }

    public void input()
    {
        super.input();
        System.out.print("\nEnter the number of hours worked: ");
        nhour=input.nextInt();
        System.out.print("\nEnter the Hourly rate: ");
        rate=input.nextDouble();
    }


}
