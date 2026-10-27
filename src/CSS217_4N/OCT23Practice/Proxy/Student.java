package CSS217_4N.OCT23Practice.Proxy;

public class Student {
    private String name;
    private boolean access;


    public Student(String name, boolean access) {
        this.name = name;
        this.access = access;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }
}
