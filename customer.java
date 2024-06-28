public class customer extends person{
    private double bootcampfees;

    public customer(){}

    public customer(String name, String sex, String address, int age, String email, String phone, double bootcampfees) 
    {
        super(name, sex, address, age, email, phone);
        this.bootcampfees = bootcampfees;
    }

    public double getBootcampfees() {
        return bootcampfees;
    }

    public void setBootcampfees(double bootcampfees) {
        this.bootcampfees = bootcampfees;
    }

    @Override
    public void print()
    {
     super.print();
     System.out.println("\nBoot camp fees : "+ bootcampfees);
    }
    @Override
    public void input()
    {
       super.input();
       System.out.print("\nEnter Boot camp fees : ");
       bootcampfees=input.nextDouble();
    }

}
