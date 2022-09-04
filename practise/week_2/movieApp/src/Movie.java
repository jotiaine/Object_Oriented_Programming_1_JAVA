public class Movie extends Show {
  private int movieLengthMin;

  // Constructor
  public Movie(String title, int publishYear, String[] directors, String[] actors,
      double grade, String critic, int movieLengthMin) {
    super(title, publishYear, directors, actors, grade, critic);
    this.movieLengthMin = movieLengthMin;
  }

  // Getter
  public int getMovieLengthMin() {
    return movieLengthMin;
  }

  // Setter
  public void setMovieLengthMin(int movieLengthMin) {
    this.movieLengthMin = movieLengthMin;
  }
}
