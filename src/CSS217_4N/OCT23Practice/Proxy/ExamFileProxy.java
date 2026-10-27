package CSS217_4N.OCT23Practice.Proxy;

public class ExamFileProxy implements ExamFile {
    private String fileName;
    private RealExamFile realFileName;
    public ExamFileProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void open(Student student) {
        System.out.println("Student: " + student.getName());
        if(!student.isAccess()){
            System.out.println("Access Denied: " + student.getName());
            return;
        }

        if (realFileName == null) {
            realFileName = new RealExamFile(fileName);
        }
        realFileName.open(student);

    }
}
