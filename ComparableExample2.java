
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample2 {
    public static void main(String[] args) {
        
        List<StudentComp> studs = new ArrayList<>();
        studs.add(new StudentComp("Sum", 21));
        studs.add(new StudentComp("Porus", 17));
        studs.add(new StudentComp("Pavan", 23));

        Collections.sort(studs);

        System.out.println(studs);
    }
}


class StudentComp implements Comparable<StudentComp> {
    String name;
    int age;

    public StudentComp(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(StudentComp stud) {
        return this.age - stud.age;
    }

    @Override
    public String toString() {
        return "StudentComp [name=" + name + ", age=" + age + "]";
    }

}