import java.util.ArrayList;

public class Main {

    // 10 new student objects ready to be sorted.
    public static void main(String[] args) {
        Student student1 = new Student(199702, "Aidan", "1501 SE 15th Pl");
        Student student2 = new Student(200003, "Bella", "501 NE 10th St");
        Student student3 = new Student(199587, "Daniel", "555 House Land St");
        Student student4 = new Student(198792, "Cameron", "24 Place Street St");
        Student student5 = new Student(200354, "Abe", "3303 Real Road St");
        Student student6 = new Student(199309, "Homer", "678 Neighborhood St");
        Student student7 = new Student(198992, "Marge", "3407 New Life St");
        Student student8 = new Student(200192, "Lisa", "10 New Terrace Pt");
        Student student9 = new Student(199200, "Bart", "501 SE 110th St");
        Student student10 = new Student(199966, "Maggie", "86 SE 3rd Blvd");

        // Add the students to a new Array:
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);

        // Create a new instance of the RollnoComparator class:
        RollnoComparator rollnoComparator = new RollnoComparator();

        // Sort the array of students using the MergeSort class:
        MergeSort.mergeSort(students, rollnoComparator);

        // Print the results to the screen:
        for (Student student : students) {
            System.out.println(student.toString());
        }



    }
}
