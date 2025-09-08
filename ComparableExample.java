import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Use Comparable<T> for natural ordering of objects
class Student2 implements Comparable<Student2>{
    String name;
    int age;

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student2 s) {
        return this.age - s.age;    // Ascending order
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student2> students = new ArrayList<>();
        students.add(new Student2("Sumanth", 25));
        students.add(new Student2("Porus", 22));
        students.add(new Student2("Pavan", 28));

        Collections.sort(students); // uses compareTo
        System.out.println(students);
    }
}
