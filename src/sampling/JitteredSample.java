package sampling;

import java.util.Random;

import com.palmoncodes.tracer.Driver;
import com.palmoncodes.utility.Point2D;

public class JitteredSample extends Sampler {
	
	
	public Random random;
	
	public JitteredSample(int samples)
	{
		this.samples =  samples;
		random = new Random();
	}
	public Point2D sample(int row , int col, int x, int y)
	{
		Point2D point = new Point2D();
		
		point.x = x-Driver.world.viewPlane.width/2+(col+random.nextFloat())/samples;
		point.y = y-Driver.world.viewPlane.height/2+(row+random.nextFloat())/samples;
		
		return point;
	}

}
