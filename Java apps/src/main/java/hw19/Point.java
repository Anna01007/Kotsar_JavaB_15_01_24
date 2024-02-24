package hw19;

public class Point implements Cloneable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceTo(Point otherPoint) {
        int deltaX = this.x - otherPoint.x;
        int deltaY = this.y - otherPoint.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Calculation of the distance between two points
    public static double distance(Point pointOne, Point pointTwo) {
        int deltaX = pointOne.x - pointTwo.x;
        int deltaY = pointOne.y - pointTwo.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point otherPoint = (Point) obj;
        return this.x == otherPoint.x && this.y == otherPoint.y;
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // A method for creating a copy of an object
    @Override
    public Point clone() {
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException e) {
            // This occurs if the class does not support Cloneable (which in our case is not true)
            throw new InternalError(e);
        }
    }

    public static void main(String[] args) {
        // An example of using the Point class
        Point pointOne = new Point(3, 8);
        Point pointTwo = new Point(1, 5);

        System.out.println("Coordinates of pointOne: " + pointOne);
        System.out.println("Coordinates of pointTwo: " + pointTwo);

        System.out.println("Distance between pointOne and pointTwo: " + Point.distance(pointOne, pointTwo));

        Point copyOfPointOne = pointOne.clone();
        System.out.println("Copy of pointOne: " + copyOfPointOne);

        // Comparison of points
        System.out.println("Are pointOne and pointTwo equal? " + pointOne.equals(pointTwo));
        System.out.println("Are pointOne and copyOfPointOne equal? " + pointOne.equals(copyOfPointOne));
    }
}
