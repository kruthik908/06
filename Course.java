public class Course {
    String semester;
    String[] courseName;
    int[] marks;
    Course(String semester, String[] courseName, int[] marks) {
        this.semester = semester;
        this.courseName = courseName;
        this.marks = marks;
    }
    void displayCourse() {
        System.out.println("Semester: " +semester);
        for (int i = 0; i < courseName.length; i++) { 
            System.out.println("Course: " +courseName[i]+ " Marks: "+marks[i]);
        }
    }



    public static void main(String[] args) {
        String[] courseNames = {"OOPS", "JAVA", "C++"};
        int[] marks = {85, 90, 88};
        Course courseObj = new Course("Sem 1", courseNames, marks);
        courseObj.displayCourse();
    }
}
