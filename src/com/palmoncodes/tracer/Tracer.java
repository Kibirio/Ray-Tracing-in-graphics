package com.palmoncodes.tracer;

import com.palmoncodes.utility.Color;
import com.palmoncodes.utility.Point3D;
import com.palmoncodes.utility.Ray;
import com.palmoncodes.utility.Vector3D;

public class Tracer {

	public void trace(int x, int y) {

		double min = Double.MAX_VALUE;
		Color color = Driver.world.background;

		Ray ray = new Ray(new Point3D(1.0 * (x - Driver.world.viewPlane.width / 2 + .5),
				1.0 * (y - Driver.world.viewPlane.height / 2 + .5), 100), new Vector3D(0.0, 0.0, -1.0));

		for (int i = 0; i < Driver.world.objects.size(); i++) {

			double temp = Driver.world.objects.get(i).hit(ray);
			if (temp != 0.0 && temp < min) {
				color = Driver.world.objects.get(i).color;
				min = temp;
			}
		}

		Driver.image.buffer.setRGB(x, Driver.world.viewPlane.height - y - 1, color.toInteger());

	}
}
