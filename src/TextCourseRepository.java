import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TextCourseRepository implements SearchableCourseRepository <TextCourse> {
    private List<TextCourse> courses = new ArrayList<>();

    @Override
    public void create(TextCourse course) {
        courses.add(course);
    }

    @Override
    public void update(TextCourse course, TextCourse newCourse) {
        courses.set(courses.indexOf(course), newCourse);
    }

    @Override
    public void delete(TextCourse course) {
        courses.remove(course);
    }

    @Override
    public List<TextCourse> getAll() {
        return courses;
    }

    @Override
    public List<TextCourse> searchByName(String name) {
        return courses.stream().filter(course -> course.getName().contains(name)).collect(Collectors.toList());
    }

    @Override
    public List<TextCourse> searchByAuthor(String author) {
        return courses.stream().filter(course -> course.getAuthor().contains(author)).collect(Collectors.toList());
    }

    @Override
    public List<TextCourse> sortByRating() {
        return courses.stream().sorted(Comparator.comparingDouble(Course::getRating).reversed()).collect(Collectors.toList());
    }

    @Override
    public List<TextCourse> sortByPopularity() {
        return courses.stream().sorted(Comparator.comparingInt(Course::getPopularity).reversed()).collect(Collectors.toList());
    }
}
