package staff;

public abstract class Employee {

    private String name;
    private String NI;
    private double salary;

    public Employee(String name, String NI, double salary){
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNI() {
        return NI;
    }

    public void setNI(String NI) {
        this.NI = NI;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(double increase){
        this.salary += increase;
    }

    public double payBonus(){
        return salary/100;
    }

}
