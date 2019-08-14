public class coloredPointClient{
   public static void main(String[] args){
      ColoredPoint one = new ColoredPoint(1, 2, "blue");
      ColoredPoint two = new ColoredPoint(1, 2, "blue");
      
      System.out.println(one);
      System.out.println(two);
      System.out.println(one.equals(two));
   }
}