import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
    Integer empId;
    String empName;

    public Employee(Integer empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}

public class Daily_02052025_5 {
    //create an employee class -- create objects -- add it to arraylist and sort it based on empId in Descending order
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(54, "John"));
        empList.add(new Employee(4, "Rob"));
        empList.add(new Employee(5, "Bob"));
        System.out.println("Original employee list before sorting " + empList);
        Collections.sort(empList, (e1, e2) -> e2.empId.compareTo(e1.empId));
        System.out.println("After sorting the employee list in Descending order of employee id " + empList);
    }
}
