/**
 * @ author  ashishKumar
 * @ since 16-03-2024 09:08 pm
 */
public class Student implements StudentPrototype {
    private String name;
    private String rollNo;
    private String subject;

    public Student(String name, String rollNo, String subject) {
        this.name = name;
        this.rollNo = rollNo;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    @Override
    public Student clone() {
        return new Student(name,rollNo,subject);
    }
}
