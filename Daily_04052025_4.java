import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class SoftwareEngineer {
    private String name;
    private int age;
    private String branch;

    public SoftwareEngineer(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", branch='" + branch + '\'' +
                '}';
    }
}

public class Daily_04052025_4 {
    public static void checkEligibility(Predicate<SoftwareEngineer> softwareEngineerPredicate, SoftwareEngineer[] softwareEngineers) {
        List<SoftwareEngineer> seList = new ArrayList<>();
        for (SoftwareEngineer currentSE : softwareEngineers) {
            if (softwareEngineerPredicate.test(currentSE)) {
                seList.add(currentSE);
            }
        }
        System.out.println("The eligible students for the role Software Engineer are " + seList);
    }

    public static void main(String[] args) {
        SoftwareEngineer[] softwareEngineers = {new SoftwareEngineer("Aditya", 45, "CSE"), new SoftwareEngineer("Sriya", 18, "ECE")};
        Predicate<SoftwareEngineer> softwareEngineerPredicate = softwareEngineer -> softwareEngineer.getBranch().equals("CSE");
        checkEligibility(softwareEngineerPredicate, softwareEngineers);
    }
}
