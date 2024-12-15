import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class VideoCourseRepository implements SearchableCourseRepository <VideoCourse> {
    private List<VideoCourse> courses = new ArrayList<>();

    @Override
    public void create(VideoCourse course) {
        courses.add(course);
    }

    @Override
    public void update(VideoCourse course, VideoCourse newCourse) {
        courses.set(courses.indexOf(course), newCourse);
    }

    @Override
    public void delete(VideoCourse course) {
        courses.remove(course);
    }

    public List<VideoCourse> getAll() {
        return courses;
    }

    @Override
    public List<VideoCourse> searchByName(String name) {
        return courses.stream().filter(course -> course.getName().contains(name)).collect(Collectors.toList());
    }

    @Override
    public List<VideoCourse> searchByAuthor(String author) {
        return courses.stream().filter(course -> course.getAuthor().contains(author)).collect(Collectors.toList());
    }

    @Override
    public List<VideoCourse> sortByRating() {
        return courses.stream().sorted(Comparator.comparingDouble(Course::getRating).reversed()).collect(Collectors.toList());
    }

    @Override
    public List<VideoCourse> sortByPopularity() {
        return courses.stream().sorted(Comparator.comparingInt(Course::getPopularity).reversed()).collect(Collectors.toList());
    }
}
