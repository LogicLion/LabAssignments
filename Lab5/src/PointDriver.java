import java.util.Scanner;

public class PointDriver {
	
	public static void main(String[] args) {
		final int pointsInPolygon = 4;

		// Declare an array of Point objects here called "points"
		Point[] points = new Point[pointsInPolygon];
		
		System.out.println("Welcome to the Points program!\n");
		
		readPointArray(points);
		System.out.println();
		printPolygonAndPerimeter(points);
	}
	
	public static void readPointArray(Point[] points) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < points.length; i++) {
			System.out.print("Enter Point " + (i+1) +": ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();

			// Create a Point from x and y and put it in the array
			Point newPoint = new Point(x,y);
			points[i] = newPoint;
		}
	}
	
	public static void printPolygonAndPerimeter(Point[] points) {
		double perimeter = 0.0;
		
		for (int i = 0; i < points.length; i++) {
			double xdiff = points[i].getX() - points[(i+1)%points.length].getX();
			double ydiff = points[i].getY() - points[(i+1)%points.length].getY();
			// Compute the distance between point i and point i+1
			// (Use the modulus operator so that when (i+1) == points.length, you access point zero)
			double distance = Math.sqrt((Math.pow(xdiff, 2) + Math.pow(ydiff, 2)));
			// Add the length to the perimeter
			perimeter += distance;
			// Print a line displaying the two Points and their distance
			System.out.println("Distance between " + points[i].toString() + " and " + points[(i+1)%points.length].toString() + "=" + distance);
		}
		
		System.out.println("\nPerimeter length = " + perimeter);
	}

	
}