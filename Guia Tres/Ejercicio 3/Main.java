public class Main{
  	public static void main(String[] args){
      Rectangle rec = new Rectangle(5, 10);
      System.out.println(rec.perimeter());
      System.out.println(rec.area());
      System.out.println(rec.diagonal());
      System.out.println(rec.base());
      System.out.println(rec.height());

      Triangle tri = new Triangle(4, 12);
      System.out.println(tri.perimeter());
      System.out.println(tri.area());
      System.out.println(tri.diagonal());
      System.out.println(tri.base());
      System.out.println(tri.height());

      Circle cir = new Circle(6);
      System.out.println(cir.perimeter());
      System.out.println(cir.area());
      System.out.println(cir.diagonal());
    }
}
