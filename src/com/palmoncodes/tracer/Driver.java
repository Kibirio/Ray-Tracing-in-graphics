package com.palmoncodes.tracer;

import com.palmoncodes.scene.World;
import com.palmoncodes.utility.Color;
import com.palmoncodes.utility.Image;

import sampling.RegularSample;
import sampling.Sampler;

public class Driver {

	public static World world;
	public static Image image;
	public static Sampler sampler;
	public static Tracer tracer;

	public static void main(String[] args) {

		world = new World(1600, 900, 1.0);
		image = new Image("image.png");
		tracer = new Tracer();
		sampler = new RegularSample(8);

		int width = 1600;
		int height = 900;

		long start = System.nanoTime();

//		BufferedImage buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
//
//		Sphere sphere = new Sphere(new Point3D(0.0, 0.0, 0.0), 60.0, new Color(1.0F, 0.0F, 0.0F));

		for (int y = 0; y < world.viewPlane.height; y++) {

			for (int x = 0; x < world.viewPlane.width; x++) {
				Color color = new Color(0.0F, 0.0F, 0.0F);

				for (int row = 0; row < 8; row++) {
					for (int col = 0; col < 8; col++) {

//						Ray ray = new Ray(
//								new Point3D(0.25 * (x - world.viewPlane.width / 2 + (col + random.nextFloat()) / 8),
//										0.25 * (y - world.viewPlane.height / 2 + (row + random.nextFloat()) / 8), 70),
//								new Vector3D(0.0, 0.0, -1.0));
//
//						if (sphere.hit(ray) != 0.0) {
//							color.add(sphere.color);
//						} else {
//
//						}

						tracer.trace(x, y);
					}
				}

			}
		}

		image.write("PNG");

		long end = System.nanoTime();
		System.out.println("loop time :" + (end - start) / 1000000000.0F);

	}

}
