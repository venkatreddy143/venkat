package studentmarks;

public class Marks {
    public Subject telugu;
    public Subject hindi;

    @Override
    public String toString() {
        return "Marks{" +
                "telugu=" + telugu +
                ", hindi=" + hindi +
                ", english=" + english +
                ", maths=" + maths +
                ", science=" + science +
                ", social=" + social +
                '}';
    }

    public Subject english;
    public Subject maths;
    public Subject science;
    public Subject social;





}
