abstract class EmployeeA{
    abstract void calculateSalary();
}
class Developer extends EmployeeA{
    @Override
    public void calculateSalary(){
        System.out.println("Salary of Developer");
    }    
}
class Manager extends EmployeeA{
    @Override
    public void calculateSalary(){
        System.out.println("Salary of Employee");
    }
}
class Main{
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.calculateSalary();
        Developer d1 = new Developer();
        d1.calculateSalary();
    }
}