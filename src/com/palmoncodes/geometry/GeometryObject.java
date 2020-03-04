package com.palmoncodes.geometry;

import com.palmoncodes.utility.Color;
import com.palmoncodes.utility.Ray;

public abstract class GeometryObject {
	
	public Color color;
	
	public abstract double hit(Ray ray);

}
