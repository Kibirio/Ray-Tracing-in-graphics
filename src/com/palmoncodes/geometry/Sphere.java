package com.palmoncodes.geometry;

import com.palmoncodes.utility.Color;
import com.palmoncodes.utility.Point3D;
import com.palmoncodes.utility.Ray;

public class Sphere extends GeometryObject {

	public Point3D center;
	public double radius;

	public Sphere(Point3D center, double radius, Color color) {

		this.center = new Point3D(center);
		this.radius = radius;
		this.color = new Color(color);
	}

	public double hit(Ray ray) {
//		(p-c)*(p-c) = r^2;
//		(o+td-c)*(o+td-c)-r^2=0;
//		(d*d)t^2 + (2(o-c)*d)t + (o-c)*(o-c)-r^2 = 0;

		double a = ray.direction.dot(ray.direction);
		double b = 2 * ray.origin.sub(center).dot(ray.direction);
		double c = ray.origin.sub(center).dot(ray.origin.sub(center)) - radius * radius;
		double discriminant = b * b - 4 * a * c;

		if (discriminant < 0.0)
			return 0.0;
		else {
			double t = (-b - Math.sqrt(discriminant)) / (2 * a);

			if (t > 10E-9) {
				return t;
			} else {
				return 0.0;
			}
		}

	}

}
