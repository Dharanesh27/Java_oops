class EmployeeO{
    private double salary;
    private int id;

    void setSalary(double salary){
        this.salary = salary;
    }
    void setId(int id){
        this.id = id;
    }
    double getSalary(){
        return salary;
    }
    int getId(){
        return id;
    }
}
class Main{
    public static void main(String[] args) {
        EmployeeO emp1 = new EmployeeO();
        emp1.setSalary(200000);
        emp1.setId(123456);
        System.out.println("Employee ID : " +emp1.getId());
        System.out.println("Employee salary: " +emp1.getSalary());
    }
}
