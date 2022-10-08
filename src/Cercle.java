import java.awt.geom.Point2D;

public class Cercle {

	private Point center;
	private double radius;
	
	public Cercle(Point center, double radius) {
		
		this.center = center;
		this.radius = radius;
		
	}
	
	public double distanceBetwenCenters(Cercle cercle) {
		
		 double x1, x2, y1, y2; 
		 Point point;
		 
		 point = cercle.getCenter();
		 
		 x1 = this.center.getxPosition();
		 y1 = this.center.getyPosition();
		 
		 x2 = point.getxPosition();
		 y2 = point.getyPosition();
		
		return Point2D.distance(x1, y1, x2, y2);
	}
	
	public boolean equals(Cercle cercle) {
		//⦁ equals(altreCercle): Retorna true si dos cercles són iguals (si tenen el mateix centre i el mateix radi).
		boolean sameRadious, sameCercle, equals;
		double  x1, x2, y1, y2, ownRadious, otherRadious;
		Point point;
		 
		point = cercle.getCenter();
		ownRadious = this.getRadius();
		otherRadious = cercle.getRadius();
		 
		 x1 = this.center.getxPosition();
		 y1 = this.center.getyPosition();
		 
		 x2 = point.getxPosition();
		 y2 = point.getyPosition();
		 
		 sameCercle = ( x1 == x2 && y1 == y2 )? true : false;
		 sameRadious = ( ownRadious == otherRadious )? true : false;
		 
		 equals = ( sameCercle && sameRadious ) ? true : false;
		
		return equals;
	}
	
	public boolean contentrics() {
		//⦁ sonConcentrics(altreCercle): Retorna true si dos cercles són concèntrics (tenen igual centre).
		boolean equal = true;
		return equal;
	}
	
	public boolean sameRadian() {
		//⦁ tenenIgualRadi(altreCercle): Retorna true si dos cercles tenen el mateix radi.
		boolean equal = true;
		return equal;
	}
	
	public boolean aretangent() {
		//⦁ sonTangents(altreCercle): Retorna true si dos cercles són tangents.
		boolean equal = true;
		return equal;
	}
	
	public boolean areSecant() {
		//⦁ sonSecants(altreCercle): Retorna true si dos cercles són secants.
		boolean equal = true;
		return equal;
	}
	
	public boolean noTouched() {
		boolean equal = true;
		return equal;
	}
	
	public String showAllInfo(Cercle cercle) {
		
		double distance;
		boolean equals, concentrics, radian, tangent, secant, notTouch;
		String sEquals, sConcentrics, sRadian, sTangent, sSecant, sNotTouch, string;
		
		distance = this.distanceBetwenCenters(cercle);
		sEquals = (this.equals(cercle)) ? "Are equals" : "not equals";
		sConcentrics = (this.contentrics()) ? "Are concentrics" : "not concentrics";
		sRadian = (this.sameRadian()) ? "Has the same radious" : "Doesn't has the same radious";
		sTangent = (this.aretangent()) ? "Are tangen" : "Not are tangent";
		sSecant = (this.areSecant()) ? "Are Secant" : "Not are secant";
		sNotTouch = (this.noTouched()) ? "circles do not touch " : "circles touch each other  ";
		
		string = "Distance between cercles" + distance + "\n" + sEquals + "\n" + sConcentrics + "\n" + sRadian + "\n" + sTangent + "\n" + sSecant + "\n" + sNotTouch;
		return string;
	}
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
