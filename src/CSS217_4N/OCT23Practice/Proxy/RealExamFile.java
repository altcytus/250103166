package CSS217_4N.OCT23Practice.Proxy;

public class RealExamFile implements ExamFile {
    private String fileName;

    @Override
    public void open(Student student) {
        System.out.println("Opening file: " + fileName);
        System.out.println();
    }

    public RealExamFile(String fileName) {
        this.fileName = fileName;
        System.out.println("Loading Exam File");
    }
}
