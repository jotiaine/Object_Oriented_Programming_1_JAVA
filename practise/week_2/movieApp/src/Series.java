public class Series extends Show {
  private int episodes;

  public Series(String title, int publishYear, String[] directors, String[] actors,
      double grade, String critic, int episodes) {
    super(title, publishYear, directors, actors, grade, critic);
    this.episodes = episodes;
  }

  public int getEpisodes() {
    return episodes;
  }
}
