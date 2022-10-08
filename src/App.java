import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x1, y1, r1, x2, y2, r2;
		
		System.out.println("Introduce Point 1 x coordinate");
		x1 = sc.nextDouble();
		System.out.println("Introduce Point 1 y coordinate");
		y1 = sc.nextDouble();
		System.out.println("Introduce first Cercle radious");
		r1 = sc.nextDouble();
		
		System.out.println("Introduce Point 2 x coordinate");
		x2 = sc.nextDouble();
		System.out.println("Introduce Point 2 y coordinate");
		y2 = sc.nextDouble();
		System.out.println("Introduce second Cercle radious");
		r2 = sc.nextDouble();
		
		Point point1 = new Point(x1, y1);
		Point point2 = new Point(x2, y2);
		
		Cercle cercle1 = new Cercle(point1, r1);
		Cercle cercle2 = new Cercle(point2, r2);
		
		System.out.println(cercle1.showAllInfo(cercle2)); 
	}
	
	
}
