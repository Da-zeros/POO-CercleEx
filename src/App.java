
public class App {

	public static void main(String[] args) {
		
		Point point1 = new Point(10.0, 20.0);
		Cercle cercle1 = new Cercle(point1, 20.0);
		
		System.out.println(cercle1.showAllInfo(cercle1)); 
	}
	
	
}
