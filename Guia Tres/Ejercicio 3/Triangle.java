public class Triangle extends Figure{
  private double base;
  private double height;

  public Triangle(double base, double height){
    this.base = base;
    this.height = height;
  }

  @Override
  public double perimeter(){
    return base + height;
  }

  @Override
  public double area(){
    return (base * height)/2;
  }

  @Override
  public double height(){
    return height;
  }

  @Override
  public double base(){
    return base;
  }

}
