package Ex8;

import java.util.Objects;

public class Girl {
    private String name;
    private int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " ("+age+")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) return false;
        Girl girl = (Girl) o;
        if(this.age==girl.age)
            return true;
        else return !this.name.equals(girl.name);
//        if(this.age==girl.age || this.name==girl.name)
//            return true;

        // return age == girl.age && Objects.equals(name, girl.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
