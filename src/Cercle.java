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
 
		 sameCercle = ( this.contentrics(cercle) )? true : false;
		 sameRadious = (this.sameRadious(cercle) )? true : false;
		 
		 equals = ( sameCercle && sameRadious ) ? true : false;
		
		return equals;
	}
	
	
	public boolean contentrics(Cercle cercle) {
		//⦁ sonConcentrics(altreCercle): Retorna true si dos cercles són concèntrics (tenen igual centre)
		boolean sameCercle;
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
		
		return  sameCercle;
	}
	
	public boolean sameRadious( Cercle cercle) {
		//⦁ tenenIgualRadi(altreCercle): Retorna true si dos cercles tenen el mateix radi.
		double  ownRadious, otherRadious;
		boolean sameRadious;
		
		ownRadious = this.getRadius();
		otherRadious = cercle.getRadius();
		
		sameRadious = ( ownRadious == otherRadious )? true : false;
		
		return sameRadious;
	}
	
	public boolean aretangent(Cercle cercle) {
		double distance, x1, x2, y1, y2, r1, r2;
		boolean extTangent, intTangent, tangent;
		
		Point point;
		
		point = cercle.getCenter();
		
		 x1 = this.center.getxPosition();
		 y1 = this.center.getyPosition();
		 
		 x2 = point.getxPosition();
		 y2 = point.getyPosition();
		 
			
		r1 = this.getRadius();
		r2 = cercle.getRadius();
		
		distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		
		extTangent = (distance == (r1+r2)) ? true : false;
		intTangent = (distance == Math.abs(r1-r2)) ? true : false;
	   
		tangent = ( extTangent || intTangent ) ? true : false;
		
		return tangent;
	}
	
	public boolean areSecant(Cercle cercle) {
		
		double distance, x1, x2, y1, y2, r1, r2;
		boolean secant;
		
		Point point;
		
		point = cercle.getCenter();
		
		 x1 = this.center.getxPosition();
		 y1 = this.center.getyPosition();
		 
		 x2 = point.getxPosition();
		 y2 = point.getyPosition();
		 
			
		r1 = this.getRadius();
		r2 = cercle.getRadius();
		
		distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		
		//⦁ sonSecants(altreCercle): Retorna true si dos cercles són secants.
		secant = (distance < (r1+r2) && distance > Math.abs(r1-r2));
		boolean equal = true;
		return equal;
	}
	
	public boolean noTouched(Cercle cercle) {
		
		boolean intersect, touched ,noTouched;
		double  x1, x2, y1, y2, r1, r2;
		Point point;
		 
		point = cercle.getCenter();
		
		r1 = this.getRadius();
		r2 = cercle.getRadius();
		 
		 x1 = this.center.getxPosition();
		 y1 = this.center.getyPosition();
		 
		 x2 = point.getxPosition();
		 y2 = point.getyPosition();
		
		double d = Math.sqrt((x1 - x2) * (x1 - x2)
                + (y1 - y2) * (y1 - y2));
		
		intersect = (d < r1 + r2)? true : false ; 
        touched =  (d == r1 + r2)? true : false ; 
		
        noTouched = ( !intersect && !touched ) ? true : false ;
        
        return noTouched;
        
	}
	
	public String showAllInfo(Cercle cercle) {
		
		double distance;
		boolean equals, concentrics, radian, tangent, secant, notTouch;
		String sEquals, sConcentrics, sRadian, sTangent, sSecant, sNotTouch, string;
		
		distance = this.distanceBetwenCenters(cercle);
		sEquals = (this.equals(cercle)) ? "Are equals" : "not equals";
		sConcentrics = (this.contentrics(cercle)) ? "Are concentrics" : "not concentrics";
		sRadian = (this.sameRadious(cercle)) ? "Has the same radious" : "Doesn't has the same radious";
		sTangent = (this.aretangent(cercle)) ? "Are tangen" : "Not are tangent";
		sSecant = (this.areSecant(cercle)) ? "Are Secant" : "Not are secant";
		sNotTouch = (this.noTouched(cercle)) ? "circles do not touch " : "circles touch each other";
		
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
