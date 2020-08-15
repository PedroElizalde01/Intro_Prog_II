public class Point2D {
  private double x;
  private double y;

  public Point2D (double x, double y) {
    this.x = x;
    this.y = y;
  }
  public String getDistance(Point2D point) { // NO ENTIENDO BIEN ESTE- Pedro
    double x = point.getX();
    double y = point.getY();
    return ("("+x+" ; "+y+")");

  }
  //public double add(Point2D point){

  //}
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
  public double getDistanceToOrigin(Point2D point){
    double x = point.getX();
    double y = point.getY();
    double d = Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));
    return d;
  }
}
