public class Show {
  protected String title;
  protected int publishYear;
  protected String[] directors;
  protected String[] actors;
  protected double grade;
  protected String critic;

  public Show(String title, String[] directors, String[] actors, double grade, String critic) {
    this.title = title;
    this.director = directors;
    this.actors = actors;
    this.grade = grade;
    this.critic = critic;
  }

  // Getters
  public String getTitle() {
    return title;
  }

  public int getPublishYear() {
    return publishYear;
  }

  public String getDirectors() {
    return directors;
  }

  public String[] getActors() {
    return actors;
  }

  public double getGrade() {
    return grade;
  }

  public String getCritic() {
    return critic;
  }

  // Setters
  public void setTitle(String title) {
    this.title = title;
  }

  public void setPublishYear(int publishYear) {
    this.publishYear = publishYear;
  }

  public void setDirectors(String[] directors) {
    this.directors = directors;
  }

  public void setActors(String[] actors) {
    this.actors = actors;
  }

  public void setGrade(double grade) {
    this.grade = grade;
  }

  public void setCritic(String critic) {
    this.critic = critic;
  }

  public void getShowInfo() {
    System.out.println("Show: " + title + " | Published: " + publishYear + " | Directors: " + directors + " | Actors: "
        + actors + " | Grade: " + grade + " | Critic: " + critic);
  }
}
