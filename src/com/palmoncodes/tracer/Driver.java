package com.palmoncodes.tracer;

import com.palmoncodes.scene.World;
import com.palmoncodes.utility.Image;

public class Driver {

	public static World world;
	public static Image image;
	public static Tracer tracer;
	
	public static void main(String[] args) {
		
		long start = System.nanoTime();
		
		world = new World(1600, 900, 1.0);
		image = new Image("Image.png");
		tracer = new Tracer();
		
		
		// create an for loop to traverse through the image height and width
		for (int y = 0; y < world.viewPlane.height; y++)
		{
			
			for (int x = 0; x < world.viewPlane.width; x++)
			{
				tracer.trace(x, y);
						
					}
				}
				
				
		image.write("PNG");
		
		long end = System.nanoTime();
		System.out.println("loop time :" + (end - start)/1000000000.0F);
		
		

	}

}

