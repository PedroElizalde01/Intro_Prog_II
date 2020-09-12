public class Rectangle{
  private int base;
  private int height;

  public Rectangle(int base, int height){
    this.base = base;
    this.height = height;
  }
  public int calculateArea(){
    int area = (this.base * this.height);
    return area;
  }
}
