public class TextCourse extends Course {
    private String text;
    private int wordCount;

    public TextCourse(int id, String name, String author, double rating, int popularity, String text, int wordCount) {
        super(id, name, author, rating, popularity);
        this.text = text;
        this.wordCount = wordCount;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    @Override
    public String toString() {
        return "Text" + super.toString() + "text = '" + text + '\'' + ", wordCount = " + wordCount + "}";
    }
}
