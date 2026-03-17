public class Movie {

    private String title;
    private String director;
    private int open;
    private String mainActor;
    private float rankPoint;

    public Movie(String title, String director, int open, String mainActor, float rankPoint) {
        this.title = title;
        this.director = director;
        this.open = open;
        this.mainActor = mainActor;
        this.rankPoint = rankPoint;
    }

    public float getRankPoint() {
        return rankPoint;
    }

    public void setRankPoint(float rankPoint) {
        this.rankPoint = rankPoint;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return String.format("제목 : %s\n" +
                "감독 : %s\n" +
                "개봉 : %d\n" +
                "주연 : %s\n" +
                "평점 : %.1f", title, director, open, mainActor, rankPoint);

    }
}
