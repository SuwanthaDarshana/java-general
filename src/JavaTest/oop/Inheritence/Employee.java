package JavaTest.oop.Inheritence;

public class Employee extends Person{
    private int employeeId;
    private String department;

    public Employee() {
        super("John");
        System.out.println("Employee Constructor");
        System.out.println();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //Method
//    void work() {
//        System.out.println("Employee is working");
//    }

    @Override
    void eat() {
        System.out.println("Employee is eating");
    }

    //OverLoading
    void speak(String story) {
        System.out.println("Employee is eating " + story);
    }

    //OverRiding
    public void drinkWater() {
        System.out.println("Employee is drinking water");
    }


}
