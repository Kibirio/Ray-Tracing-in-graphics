package com.palmoncodes.tracer;

import com.palmoncodes.scene.World;
import com.palmoncodes.utility.Image;

import Projection.Projection;
import sampling.Sampler;

public class Driver {

	public static World world;
	public static Image image;
	public static Sampler sampler;
	public static Tracer tracer;
	public static Projection projection;

	public static void main(String[] args) {

		world = new World(1600, 900, 1.0);
		image = new Image("image.png");
		tracer = new Tracer();

		long start = System.nanoTime();

		for (int y = 0; y < world.viewPlane.height; y++) {

			for (int x = 0; x < world.viewPlane.width; x++) {

				tracer.trace(x, y);
			}
		}

		image.write("PNG");

		long end = System.nanoTime();
		System.out.println("loop time :" + (end - start) / 1000000000.0F);

	}

}
