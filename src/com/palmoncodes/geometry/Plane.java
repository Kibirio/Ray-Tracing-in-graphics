package com.palmoncodes.geometry;


import com.palmoncodes.utility.Color;
import com.palmoncodes.utility.Normal;
import com.palmoncodes.utility.Point3D;
import com.palmoncodes.utility.Ray;


public class Plane extends GeometryObject{
	
	Point3D point;
	Normal normal;
	
	public Plane(Point3D point, Normal normal, Color color)
	{
		this.point = new Point3D(point);
		this.normal = new Normal(normal);
		this.color = new Color(color);
	}
	
	public double hit(Ray ray)
	{
//		(p-a)*n =0;
//		(a+td-a)*n=0;
//		o*n + td*n - a*n=0;
//		td*n + (o-a)*n =0;
//		td*n = (a-o)*n;
//		t = (a-o)*n/d*n; 
				
		double t = point.sub(ray.origin).dot(normal)/ray.direction.dot(normal);
		
		if (t > 10E-9) {
			return t;
		}else
		{
			return 0.0;
		}
	}

}
