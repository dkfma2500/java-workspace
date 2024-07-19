package section15.practice.p02;

import java.security.PublicKey;
import java.util.Objects;

class Student {
String name;
int studentNumber;

Student(String name, int studentNumber) {
    this.name = name;
    this.studentNumber = studentNumber;
}

@Override
public boolean equals(Object obj){
    if(this == obj) {
        return true;
    }

    //if(obj == null || getClass() != obj.getClass()) {
    //    return false;
    //}
    if (!(obj instanceof Student)) {
        return false;
    }

    Student person = (Student) obj;
    return studentNumber == person.studentNumber && name.equals(person.name);

}

@Override
public int hashCode() {
    return Objects.hash(name, studentNumber); 
}
}

public class Practice1502 {
    public static void main(String[] args) {
        Student student = new Student("김일남", 1);
        Student student1 = new Student("김일남", 1);
        Student student2 = new Student("김이남", 2);

        System.out.println(student.equals(student1));
        System.out.println(student.equals(student2));
    }
}
