package Lesson_18_OOP;

public class Person {

    private String fullName;
    private int age;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Person(){}

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    public void move() {
        System.out.println(fullName + " идет");


    }
}
