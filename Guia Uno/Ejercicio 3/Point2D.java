public class Point2D {
  private float x;
  private float y;

  public Point2D (float x, float y) {
    this.x = x;
    this.y = y;
  }
  public float getDistance(Point2D point) { // NO ENTIENDO BIEN ESTE- Pedro
    x = this.x;
    y = this.y;

  }
  public float add(Point2D point){

  }
  public float getX(){
    return x;
  }
  public float getY(){
    return y;
  }
  public float getDistanceToOrigin(Point2D point){
    x = point.getX();
    y = point.getY();
    n = (Math.pow((x-0)) + Math.pow((y-0)));
    d = Math.sqr(n);
    return d;
  }
}
