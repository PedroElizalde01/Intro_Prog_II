public class Date {
  private int dd;
  private int mm;
  public Date(int dd, int mm) {
    this.dd = dd;
    this.mm = mm;
  }
  public String dateToString(){
    return (dd + "/" + mm);
  }
}
