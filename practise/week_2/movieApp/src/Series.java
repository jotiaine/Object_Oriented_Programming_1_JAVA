public class Series extends Show {
  private int episodes;

  public Series(String title, int publishYear, int episodes, String[] directors, String[] actors, double grade,
      String critic) {
    super(title, publishYear, episodes, directors, actors, grade, critic);
    this.episodes = episodes;
  }

  public int getEpisodes() {
    return episodes;
  }
}
