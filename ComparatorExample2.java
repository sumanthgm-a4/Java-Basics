import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample2 {
    public static void main(String[] args) {
        
        List<StudentNew> students = new ArrayList<>();
        students.add(new StudentNew("Sumanth", 25));
        students.add(new StudentNew("Porus", 22));
        students.add(new StudentNew("Pavan", 28));

        // Comparator<StudentNew> nameComparator = (s1, s2) -> s1.name.compareTo(s2.name);

        Collections.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));

        System.out.println(students);
    }
}

class StudentNew {
    String name;
    int age;

    public StudentNew(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return name + " - " + age;
    }
}