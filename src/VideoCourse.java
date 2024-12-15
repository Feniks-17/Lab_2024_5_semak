public class VideoCourse extends Course {
    private String videoUrl;
    private int duration; //длительность

    public VideoCourse(int id, String name, String author, double rating, int popularity, String videoUrl, int duration) {
        super(id, name, author, rating, popularity);
        this.videoUrl = videoUrl;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    public String toString() {
        return "Video" + super.toString() + "videoUrl = '" + videoUrl + '\'' + ", duration = " + duration + " min}";
    }
}
