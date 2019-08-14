# Point
Includes coordinates points, with X, Y, and  color properties via interfaces, client files, and various other files


Colored.java
  Interface file that includes a String getColored() 
  
ColoredPoint.java
  File that extends Point.java file and implements Colored.java
  toString() 
    Method that prints out the color via the getColor() method and X and Y coordinates of the point via the getX() and getY() methods respectively
  getColor()
    Method that returns the String color
  equals(Object O)
    Boolean method that compares two points by checking if the object is a ColoredPoint. If so, it checks if the x and y coordinates and color are equal. Returning true if so and false otherwise. 
    
ColoredPointClient.java
  Clinet file that create two points and check if they are equal
  
Point.java
  File that implements Comparable<Point>
  Contains two constructors: one with parameters of X and Y that allow to set the X and Y coordinates, and the second with no parameters that default both the X and Y to zero
  getX() 
    Method that returns X coordinate
  getY()
    Method that returns Y coordinate
  toString()
    Method that prints the coordinate in the following, replaces X and Y with the X and Y coordinate values as such:
      (X, Y)
  compareTo(Point pt)
    Method that compares distance between two points via X coordinate. If they are equal, compares Y coordinates
