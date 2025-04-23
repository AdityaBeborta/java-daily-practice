import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Student() {

    }

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}

public class Daily_23042025 {

    public static void main(String[] args) {
        /*
         * write a programme which will filter the marks of student which are greater than 30 and collect it in a list -- create a student object with name and mark
         * */
        Student s1 = new Student("Aditya", 99);
        Student s2 = new Student("Sriya", 55);
        Student s3 = new Student("John", 14);
        Student s4 = new Student("Denny", 1);

        List<Student> studentList = Arrays.asList(s1, s2, s3, s4);
        List<Student> studentsPromoted = studentList.stream().filter(student -> student.getMark() >= 30).collect(Collectors.toList());

        System.out.println("original data " + studentList);
        System.out.println("filtered data " + studentsPromoted);

    }
}
