/**
 * @ author  ashishKumar
 * @ since 16-03-2024 07:32 pm
 */
public class MainClass {
    public static void main(String[] args) {
        Student student= new Student("ashish","432","english");
        System.out.println(student);
        Student clone= student.clone();
        System.out.println(clone);
    }
}
