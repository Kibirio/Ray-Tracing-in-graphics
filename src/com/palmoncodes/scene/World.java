package com.palmoncodes.scene;

import java.util.ArrayList;

import com.palmoncodes.geometry.GeometryObject;
import com.palmoncodes.geometry.Plane;
import com.palmoncodes.geometry.Sphere;
import com.palmoncodes.utility.Color;
import com.palmoncodes.utility.Normal;
import com.palmoncodes.utility.Point3D;

public class World {

	public ViewPlane viewPlane;
	public ArrayList<GeometryObject> objects;
	public Color background;

	public World(int width, int height, double size) {
		viewPlane = new ViewPlane(width, height, size);
		background = new Color(0.0F, 0.0F, 0.0F);

		objects = new ArrayList<GeometryObject>();
		objects.add(new Sphere(new Point3D(0.0, 0.0, 0.0), 50, new Color(1.0F, 0.0F, 0.0F)));
		objects.add(new Sphere(new Point3D(-150.0, 0.0, 0.0), 50, new Color(0.0F, 1.0F, 0.0F)));
		objects.add(new Sphere(new Point3D(150.0, 0.0, 0.0), 50, new Color(0.0F, 0.0F, 1.0F)));
		objects.add(new Plane(new Point3D(0.0, 0.0, 0.0), new Normal(0.0, 1.0, 0.2), new Color(1.0F, 1.0F, 0.0F)));

	}

}
