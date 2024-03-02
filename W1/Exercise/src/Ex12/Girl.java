package Ex12;

public class Girl implements Comparable<Girl> {
    private String name;
    private int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Girl o) {
        int nameCompare = name.compareTo(o.name);
        return nameCompare==0?age-o.age:nameCompare;
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

    @Override
    public String toString() {
        return name + " ("+age+")";
    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Girl girl = (Girl) o;
//        if(this.age==girl.age)
//            return true;
//        if(this.name==girl.name)
//            return true;
//        if(this.age==girl.age || this.name==girl.name)
//            return true;
//        return true;

//       // return age == girl.age && Objects.equals(name, girl.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
}
