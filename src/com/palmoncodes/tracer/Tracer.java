package com.palmoncodes.tracer;

import com.palmoncodes.utility.Color;
import com.palmoncodes.utility.Point2D;
import com.palmoncodes.utility.Point3D;
import com.palmoncodes.utility.Ray;
import com.palmoncodes.utility.Vector3D;

public class Tracer {
	
	public void trace(int x, int y)
	{
//		double min = Double.MAX_VALUE;
		
		boolean hit = false;
		Color color = new Color(0.0F, 0.0F, 0.0F);
		
		
//		for (int i = 0; i < Driver.world.objects.size(); i++)
//		{
			for (int row =0; row < Driver.sampler.samples;row++)
			 {
				 for (int col =0;col < Driver.sampler.samples;col++)
				 {
					 Point2D point = Driver.sampler.sample(row, col, x, y);
					 Ray ray = Driver.projection.createRay(point);
					 
					 double min = Double.MAX_VALUE;
					 Color tempColor = Driver.world.background;
					 
					 
					 for (int i = 0; i < Driver.world.objects.size(); i++)
					 {
						 double temp = Driver.world.objects.get(i).hit(ray);
						 
						 if( temp != 0.0 && temp < min)
						 {
							 min = temp;
							 hit = true;
							 tempColor = Driver.world.objects.get(i).color;
					 }
			}
//					 color.add(tempColor);
		}
			 
				 color.divid(Driver.sampler.samples*Driver.sampler.samples);
				 if (hit)
					Driver.image.buffer.setRGB(x, Driver.world.viewPlane.height-y-1, color.toInteger());
				 else
					 Driver.image.buffer.setRGB(x, Driver.world.viewPlane.height-y-1, Driver.world.background.toInteger());
		
		
//		for (int i =0; 1 < Driver.world.objects.size(); i++)
//		{
//			double temp = Driver.world.objects.get(i).hit(ray);
//			if(temp != 0.0 && temp < min)
//			{
//				color = Driver.world.objects.get(i).color;
//				min = temp;
//			}
//		}
		
		
//		Color color = new Color(0.0F, 0.0F, 0.0F);
//		
//		for (int row=0; row < 8; row++)
//		{
//			for (int col =0; col < 8; col++)
//			{
//				
//				
//				Ray ray =  new  Ray(new Point3D(.25*(x-Driver.world.viewPlane.width/2+(col+random.nextFloat())/8), .25*(y-world.viewPlane.height/2+(row+random.nextFloat())), 70), new Vector3D(0.0, 0.0, -0.1));
//				
//				if (sphere.hit(ray) != 0.0)
//				{
//					color.add(sphere.color);
//				}
//				else
//				{
//					
//				}
//	}
//		}
	}

	}
}
