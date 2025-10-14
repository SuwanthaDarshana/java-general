package JavaTest.oop.Intertence;

public class Person {
    private String name;  //properties
    private int age;
    private String gender;

    public Person() {
        System.out.println("Person Constructor");
    }

    public  Person(String name) {
        System.out.println("Person Constructor with name " + name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    /// Method
    void eat() {
        System.out.println("Person is eating");
    }


}
