public class SimpleCurrencyCalculator {
  private double euros;
  private double usd;
  private double gbp;
  private double chf;
  private double jpy;

  public SimpleCurrencyCalculator(double euros) {
    this.euros = euros;
    this.usd = euros;
    this.gbp = euros * 0.86;
    this.chf = euros * 0.98;
    this.jpy = euros * 139.71;
  }

  public double getEuros() {
    return euros;
  }

  public double getUsd() {
    return usd;
  }

  public double getGbp() {
    return gbp;
  }

  public double getChf() {
    return chf;
  }

  public double getJpy() {
    return jpy;
  }

  public void setEuros(double euros) {
    this.euros = euros;
  }

  public void setUsd(double usd) {
    this.usd = usd;
  }

  public void setGbp(double gbp) {
    this.gbp = gbp;
  }

  public void setChf(double chf) {
    this.chf = chf;
  }

  public void setJpy(double jpy) {
    this.jpy = jpy;
  }

  public void convert() {
    System.out.println("You have " + usd + " USD");
    System.out.println("You have " + gbp + " GBP");
    System.out.println("You have " + chf + " CHF");
    System.out.println("You have " + jpy + " JPY");
  }
}
