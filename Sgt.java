class Student {
    int id;
    String name;
    String dept;

    Student(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
    }
}

class UndergraduateStudent extends Student {
    int semester;
    double cgpa;

    UndergraduateStudent(int id, String name, String dept, int semester, double cgpa) {
        super(id, name, dept);
        this.semester = semester;
        this.cgpa = cgpa;
    }

    void display() {
        super.display();
        System.out.println("Semester: " + semester);
        System.out.println("CGPA: " + cgpa);
    }
}

class PostgraduateStudent extends Student {
    String specialization;
    String researchTopic;

    PostgraduateStudent(int id, String name, String dept, String specialization, String researchTopic) {
        super(id, name, dept);
        this.specialization = specialization;
        this.researchTopic = researchTopic;
    }

    void display() {
        super.display();
        System.out.println("Specialization: " + specialization);
        System.out.println("Research Topic: " + researchTopic);
    }
}

public class Sgt{
    public static void main(String[] args) {
        UndergraduateStudent u1 = new UndergraduateStudent(101, "Ravi", "CSE", 5, 8.75);
        u1.display();

        PostgraduateStudent p1 = new PostgraduateStudent(201, "Anita", "ECE", "AI", "Computer Vision");
        p1.display();

        Student s1 = new Student(102, "Kiran", "ISE");
        s1.display();

        UndergraduateStudent u2 = new UndergraduateStudent(103, "Rahul", "CSE", 7, 9.10);
        u2.display();
    }
}