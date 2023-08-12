
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student> {

    private String name;
    private int age;

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
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

    @Override
    public int compareTo(Student o) {

        if (o.getage() > this.getage()) {
            return 1;
        } else if (o.getage() < this.getAge()) {
            return -1;
        }

        return 0;

    }

    private int getage() {
        return age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}
class CustomStudentSortByage {

    public static void main(String[] args) {

        List<Student> stu = new ArrayList<>();

        stu.add(new Student("Munish", 27));
        stu.add(new Student("Adarsh", 22));
        stu.add(new Student("Pranav", 24));
        stu.add(new Student("Prem",19));
        stu.add(new Student("Shatyendra",26));
        stu.add(new Student("Dinendra",30));
        stu.add(new Student("Akash",15));
        stu.add(new Student("Rajshi",18));
        stu.add(new Student("Aditya",13));

        System.out.println("Before sorting custom list of students : ");
        Iterator<Student> it = stu.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Collections.sort(stu);

        System.out.println("After sorting custom list of students in natural order: ");
        it = stu.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Collections.sort(stu, Collections.reverseOrder());

        System.out.println("After sorting custom list of students in ascending order: ");
        it = stu.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
