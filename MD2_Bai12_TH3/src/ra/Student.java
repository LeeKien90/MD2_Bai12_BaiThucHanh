package ra;

public class Student implements Comparable<Student> {
    private String studentName;
    private int age;
    private String address;

    public Student(String studentName, int age, String address) {
        this.studentName = studentName;
        this.age = age;
        this.address = address;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.getStudentName().compareTo(student.getStudentName());
    }

}
