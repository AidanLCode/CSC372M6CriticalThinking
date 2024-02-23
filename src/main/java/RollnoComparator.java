import java.util.Comparator;

public class RollnoComparator implements Comparator<Student> {

    //This method is used to compare the students based on roll number.
    @Override
    public int compare(Student r1, Student r2) {
        return Integer.compare(r1.rollno, r2.rollno);
    }
}
