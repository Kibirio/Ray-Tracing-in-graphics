package com.palmoncodes.utility;

public class Ray {
	
	public Point3D origin;
	public Vector3D direction;
	
	public Ray()
	{
		origin = new Point3D();
		direction = new Vector3D();
	}
	
	public Ray(Point3D origin, Vector3D direction) {
		this.origin = new Point3D(origin);
		this.direction = new Vector3D(direction);
	}
	
	
	

}
