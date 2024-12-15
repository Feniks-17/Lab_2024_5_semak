import java.util.List;

public interface SearchableCourseRepository <T> extends SortableCourseRepository <T> {
    List<T> searchByName(String name);
    List<T> searchByAuthor(String author);
}

