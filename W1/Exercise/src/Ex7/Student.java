package Ex7;

public class Student implements Comparable <Student> {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("%-20s -> %5.2f",name ,score );
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(score,o.score) ;
    }
}
