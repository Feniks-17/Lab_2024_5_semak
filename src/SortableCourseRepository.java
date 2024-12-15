import java.util.List;

public interface SortableCourseRepository <T> extends CourseRepository <T> {
    List<T> sortByRating();
    List<T> sortByPopularity();
}
