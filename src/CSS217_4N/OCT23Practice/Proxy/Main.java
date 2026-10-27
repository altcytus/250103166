package CSS217_4N.OCT23Practice.Proxy;

public class Main {
    public static void main(String[] args) {
        ExamFile examFile = new ExamFileProxy("CSS217_4N.OCT23Practice.txt");

        Student a = new Student("Bob", true);
        Student b = new Student("John", false);

        examFile.open(a);
        examFile.open(a);
        examFile.open(b);
    }
}
