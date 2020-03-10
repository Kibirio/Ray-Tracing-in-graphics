package com.palmoncodes.utility;

public class Vector3D {
	public double x, y, z;
	
	public Vector3D()
	{
		x = 0.0;
		y = 0.0;
		z = 0.0;
	}

	public Vector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector3D(Vector3D vector)
	{
		x = vector.x;
		y = vector.y;
		z = vector.z;
	}
	
	public Vector3D add(Vector3D vector)
	{
		return new Vector3D(x + vector.x, y + vector.y, z + vector.z);
	}
	
	public Vector3D mult(double scalar)
	{
		return new Vector3D(x*scalar, y*scalar, z*scalar);
	}
	
	public Vector3D sub(Vector3D vector)
	{
		return new Vector3D(x -vector.x, y - vector.y, z - vector.z);
	}


	public double dot(Point3D point)
	{
		return x * point.x + y * point.y + z * point.z;
	}
	
	public double dot(Vector3D vector)
	{
		return x * vector.x + y * vector.y + z * vector.z;
	}
	
	public double dot(Normal normal)
	{
		return x*normal.x + y*normal.y + z*normal.z;
	}
	
	public void normalize()
	{
		double magnitude = Math.sqrt(x*x + y*y + z*z);
		
		x /= magnitude;
		y /= magnitude;
		z /= magnitude;
	}
	
}
