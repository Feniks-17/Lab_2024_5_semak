import java.util.List;

public class Main {
    public static void main(String[] args) {
        VideoCourseRepository videoCourseRepository = new VideoCourseRepository();
        VideoCourse videoCourse1 = new VideoCourse(1, "Java Basics", "John Doe", 4.5, 2000,
                "http://example.com/java-basics", 120);
        VideoCourse videoCourse2 = new VideoCourse(2, "Advanced Java", "Jane Smith", 4.8, 1000,
                "http://example.com/advanced-java", 180);
        VideoCourse videoCourse3 = new VideoCourse(3, "JavaScript", "Yura Vvedenskii", 5.0, 10000,
                "http://example.com/javascript", 150);
        videoCourseRepository.create(videoCourse1);
        videoCourseRepository.create(videoCourse2);
        System.out.println("Вывод всех созданных курсов:");
        List<VideoCourse> videoCourseList1 = videoCourseRepository.getAll();
        for (VideoCourse video : videoCourseList1) {
            System.out.println(video);
        }

        System.out.println();

        videoCourseRepository.update(videoCourse1, videoCourse3);
        videoCourseRepository.delete(videoCourse2);
        videoCourseRepository.create(videoCourse1);
        System.out.println("Вывод всех курсов после обновления и удаления:");
        List<VideoCourse> videoCourseList2 = videoCourseRepository.getAll();
        for (VideoCourse video : videoCourseList2) {
            System.out.println(video);
        }

        System.out.println();

        videoCourseRepository.create(videoCourse2);
        List<VideoCourse> videoCourseList3 = videoCourseRepository.searchByName("JavaSc");
        System.out.println("Поиск по имени, начинающегося с JavaSc: ");
        for (VideoCourse video : videoCourseList3) {
            System.out.println(video);
            }

        System.out.println();

        List<VideoCourse> videoCourseList4 = videoCourseRepository.sortByRating();
        System.out.println("Сортировка по рейтингу: ");
        for (VideoCourse video : videoCourseList4) {
            System.out.println(video);
        }
    }
}