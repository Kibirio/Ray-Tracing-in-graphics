package com.palmoncodes.tracer;

import com.palmoncodes.utility.Color;
import com.palmoncodes.utility.Point2D;
import com.palmoncodes.utility.Point3D;
import com.palmoncodes.utility.Ray;
import com.palmoncodes.utility.Vector3D;

public class Tracer {

	public void trace(int x, int y) {

		for (int row = 0; row < Driver.sampler.samples; row++) {
			for (int col = 0; col < Driver.sampler.samples; col++) {
				Point2D point = Driver.sampler.sample(row, col, x, y);

				Ray ray = new Ray(new Point3D(Driver.world.viewPlane.size * (point.x),
						Driver.world.viewPlane.size * (point.y), 100), new Vector3D(0.0, 0.0, -1.0));
			}
		}

		double min = Double.MAX_VALUE;
		Color color = new Color();

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
