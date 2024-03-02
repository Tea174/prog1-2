package Ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Students  {
    private List<Student> students;

    public Students(List<Student> students) {
        this.students = new ArrayList<>(students);
    }
    public void sortByScore(boolean ascending) {
        Collections.sort(students);
        if (!ascending) {
            Collections.reverse(students);
        }
    }

    public Student getHighScore() {
       return Collections.max(students);
    }

    public Student getLowScore() {
      return   Collections.min(students);
    }


}
