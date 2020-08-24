public class Point {
  private double x;
  private double y;

  public Point (double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getDistance(Point2D point2){
    double xcord = Math.pow((x - point2.getX()), 2);
    double ycord = Math.pow((y - point2.getY()), 2);
    double total = Math.sqrt(xcord + ycord);
    return total;
  }

  public Point2D add(Point2D point){
    double xcord = x + point.getX();
    double ycord = y + point.getY();
    Point2D point2 = new Point2D(xcord, y cord);
    return point2;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public void setX(double x){
    this.x = x;
  }

  public void setY(double y){
    this.y = y;
  }
  public double getDistanceToOrigin(Point2D point){
    double x = point.getX();
    double y = point.getY();
    double d = Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));
    return d;
  }
//  public void maxDistanceToOrigin(){}  PENSAR ESTE - PedroS
}