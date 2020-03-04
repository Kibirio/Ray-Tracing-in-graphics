package com.palmoncodes.tracer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;
import javax.imageio.ImageIO;

import com.palmoncodes.geometry.Sphere;
import com.palmoncodes.scene.World;
import com.palmoncodes.utility.Color;
import com.palmoncodes.utility.Image;
import com.palmoncodes.utility.Point3D;
import com.palmoncodes.utility.Ray;
import com.palmoncodes.utility.Vector3D;
public class Driver {

	public static World world;
	public static Image image;
	
	public static void main(String[] args) {
		
		long start = System.nanoTime();
		
		world = new World(1600, 900, 1.0);
		image = new Image("Image.png");
		
		Random random = new Random();
		
		
		// create an image 
		File image = new File("Image.png");
		
		// create a buffered image
		BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		
		Sphere sphere = new Sphere(new Point3D(0.0, 0.0,0.0), 60.0, new Color(1.0F, 0.0F, 0.0F));
		// create an for loop to traverse through the image height and width
		for (int y = 0; y < height; y++)
		{
			
			for (int x = 0; x < width; x++)
			{
				Color color = new Color(0.0F, 0.0F, 0.0F);
				
				for (int row=0; row < 8; row++)
				{
					for (int col =0; col < 8; col++)
					{
						
						
						Ray ray =  new  Ray(new Point3D(.25*(x-width/2+(col+random.nextFloat())/8), .25*(y-height/2+(row+random.nextFloat())), 70), new Vector3D(0.0, 0.0, -0.1));
						
						if (sphere.hit(ray) != 0.0)
						{
							color.add(sphere.color);
						}
						else
						{
							
						}
						
					}
				}
				
				color.divide(64);
				bufferedImage.setRGB(x, y, toInteger());
				
//				bufferedImage.setRGB(x, y, random.nextInt());
				if (sphere.hit(ray) != 0.0)
				{
					bufferedImage.setRGB(x, y, sphere.color.toInteger());
				}
				else
				{
					bufferedImage.setRGB(x, y, 0);
				}
			}
		}
		
		image.write("PNG");
		
		long end = System.nanoTime();
		System.out.println("loop time :" + (end - start)/1000000000.0F);
		
		

	}

}

