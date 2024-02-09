package StudentMarks;

public class Subject {
    public int marks;
    public String name;
    public String result;

    @Override
    public String toString() {
        return "Subject{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
