public abstract class Course {
    private int id;
    private String name;
    private String author;
    private double rating;
    private int popularity;

    protected Course(int id, String name, String author, double rating, int popularity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.rating = rating;
        this.popularity = popularity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    @Override
    public String toString() {
        return "Course" + id + " {" + "id = " + id + ", name = '" + name + '\'' +
                ", author = '" + author + '\'' + ", rating = " + rating + ", popularity = " + popularity + ", ";
    }
}
