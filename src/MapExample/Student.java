package MapExample;

import java.util.HashMap;
import java.util.Map;

public class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}

class HashMapExample1{
    public static void main(String[] args) {
        Map<Integer,Student> studentMap = new HashMap<>();

        Student student1 = new Student(1,"John");
        Student student2 = new Student(2,"Alice");

        studentMap.put(student1.rollNo, student1);
        studentMap.put(student2.rollNo,student2);

        System.out.println(studentMap);
    }
}
