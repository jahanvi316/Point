public class ColoredPoint extends Point implements Colored {
    private String color;
    public ColoredPoint(int a, int b, String c){
      super(a, b);
      color = c;
    }
    public String toString() {
        return getColor() + "(" + getX() + ", " + getY() + ")";
    }
    
    public String getColor(){
      return color;
      }
    
     public boolean equals(Object o) {
     
        if (o instanceof  ColoredPoint) {
            ColoredPoint other = (ColoredPoint) o;
            return getX() == other.getX() && getY() == other.getY() && color.equals(other.getColor());
        } else {  
            return false;
        }
    }   

}