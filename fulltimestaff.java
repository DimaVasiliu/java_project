public class fulltimestaff extends person {
    
    private double salary;
    public fulltimestaff() {}
    public fulltimestaff(double salary) {
        this.salary = salary;
    }
    public fulltimestaff(String name, String sex, String address, int age, String email, String phone, double salary) {
        super(name, sex, address, age, email, phone);
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void print()
    {
        super.print();
        System.out.print("\nSalary: "+salary); 
    }
    @Override
    public void input()
    {
        super.input();
        System.out.print("\nEnter the Salary: ");
        salary=input.nextDouble();
    }

}
