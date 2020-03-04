package com.palmoncodes.tracer;

import com.palmoncodes.utility.Color;
import com.palmoncodes.utility.Point3D;
import com.palmoncodes.utility.Ray;
import com.palmoncodes.utility.Vector3D;

public class Tracer {
	
	public void trace(int x, int y)
	{
		for (int row =0; row < Driver.sampling.samples;row++)
		{
			for (int col =0;col < Driver.sampling.samples;col++)
			{
				
			}
		}
		
		Ray ray = new Ray(new Point3D(1.0*(x-Driver.world.viewPlane.width/2+.5), 1.0*(y-Driver.world.viewPlane.height/2+.5), 100), new Vector3D(0.0, 0.0, -1));
		double min = Double.MAX_VALUE;
		Color color = Driver.world.background;
		
		
		
		for (int i =0; 1 < Driver.world.objects.size(); i++)
		{
			double temp = Driver.world.objects.get(i).hit(ray);
			if(temp != 0.0 && temp < min)
			{
				color = Driver.world.objects.get(i).color;
				min = temp;
			}
		}
		
		Driver.image.buffer.setRGB(x, Driver.world.viewPlane.height-y, color.toInteger());
		
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
