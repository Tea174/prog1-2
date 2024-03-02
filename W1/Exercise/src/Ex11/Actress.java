package Ex11;

import java.util.Objects;

public class Actress implements Comparable<Actress>{
    private String name;
    private int birthYear;

    public Actress(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return name + " (" + birthYear+ ")";
    }

    //Make sure that actresses having the same name are considered as the same actress
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actress actress = (Actress) o;
        return Objects.equals(name, actress.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Actress o) {
        int compareBirthYear = birthYear - o.birthYear;
        return (compareBirthYear==0) ? compareBirthYear : name.compareTo(o.name);
    }

}
