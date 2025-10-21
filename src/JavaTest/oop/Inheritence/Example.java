package JavaTest.oop.Inheritence;

public class Example {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("John");
        employee.setAge(30);
        employee.setGender("Male");
        employee.setEmployeeId(123);
        employee.setDepartment("IT");

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee Gender: " + employee.getGender());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Department: " + employee.getDepartment());

        System.out.println("-----------------");

        employee.eat();
//        employee.work();





    }
}
