import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InteractiveCourseRepository implements SearchableCourseRepository <InteractiveCourse> {
    private List<InteractiveCourse> courses = new ArrayList<>();

    @Override
    public void create(InteractiveCourse course) {
        courses.add(course);
    }

    @Override
    public void update(InteractiveCourse course, InteractiveCourse newCourse) {
        courses.set(courses.indexOf(course), newCourse);
    }

    @Override
    public void delete(InteractiveCourse course) {
        courses.remove(course);
    }

    @Override
    public List<InteractiveCourse> getAll() {
        return courses;
    }

    @Override
    public List<InteractiveCourse> searchByName(String name) {
        return courses.stream().filter(course -> course.getName().contains(name)).collect(Collectors.toList());
    }

    @Override
    public List<InteractiveCourse> searchByAuthor(String author) {
        return courses.stream().filter(course -> course.getAuthor().contains(author)).collect(Collectors.toList());
    }

    @Override
    public List<InteractiveCourse> sortByRating() {
        return courses.stream().sorted(Comparator.comparingDouble(Course::getRating).reversed()).collect(Collectors.toList());
    }

    @Override
    public List<InteractiveCourse> sortByPopularity() {
        return courses.stream().sorted(Comparator.comparingInt(Course::getPopularity).reversed()).collect(Collectors.toList());
    }
}
