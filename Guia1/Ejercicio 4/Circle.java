public class Circle {
  private double radius;
  private Point2D center;

  public Circle (double radius, Point2D center) {
    this.radius = radius;
    this.center = center;
  }
  public String center(){
    return this.center.getDistance(this.center);
  }
  public double area(){
    double area = (Math.PI * (Math.pow(this.radius, 2)));
    return area;
  }
  public String contains(Point2D point){ //NO ANDA MUY BIEN ESTO CHE -Pedro
    double x1 = point.getX();
    double y1 = point.getY();
    double x2 = center.getX();
    double y2 = center.getY();
    double x = Math.pow((x2-x1),2);
    double y = Math.pow((y2-y1),2);
    double n = (Math.sqrt(x + y));
    if (n <= radius){
      return ("TRUE: " + n);
    }else{
      return ("FALSE: " + n);
    }

  }
  public double perimenter(){
    return (2 * Math.PI * this.radius);
  }
}
