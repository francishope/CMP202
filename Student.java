package USER;
public class Student extends User {
    String matricNo = "bhu/22/04/05/0045";
    String admissionNo = "12345678";
    String registerCourse() {
        if (matricNo.equals("") || admissionNo.equals("")) {
            return "You cant register now ";
        } else {
            return "You have registered your courses";
        }
    }
    String checkResults() {
        if (matricNo.equals("") || admissionNo.equals("")) {
            return "Cannot check your result. Are you sure you're a student?";
        } else {
            return "You score is 8 A and 1 B";
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "collins Ade";
        student.password = "1234567";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
    }
}
