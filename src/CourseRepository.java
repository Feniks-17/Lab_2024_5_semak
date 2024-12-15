import java.util.List;

public interface CourseRepository <T> {
    void create(T course);
    void update(T course, T newCourse);
    void delete(T course);
    List<T> getAll();
}
