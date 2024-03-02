package be.kdg.screenreader;

public class Person {
    private int age;
    private String name;
    private char sex;

    public Person(String name, int age, char sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {return age; }

    public void setAge(int age) {this.age = age; }

    public String getName() {return name; }

    public void setName(String name) {this.name = name; }

    public char getSex() {return sex; }

    public void setSex(char sex) { this.sex = sex; }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name='" + name + '\'' +
                ", sex=" + sex +  '}';
    }
}