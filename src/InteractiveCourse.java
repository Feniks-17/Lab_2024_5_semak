import java.util.List;

public class InteractiveCourse extends Course {
    private List<String> interactiveElements;

    public InteractiveCourse(int id, String name, String author, double rating, int popularity, List<String> interactiveElements) {
        super(id, name, author, rating, popularity);
        this.interactiveElements = interactiveElements;
    }

    public List<String> getInteractiveElements() {
        return interactiveElements;
    }

    public void setInteractiveElements(List<String> interactiveElements) {
        this.interactiveElements = interactiveElements;
    }

    @Override
    public String toString() {
        return "Interactive" +  super.toString() + "interactiveElements = " + interactiveElements + "}";
    }
}
