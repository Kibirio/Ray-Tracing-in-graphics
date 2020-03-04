package sampling;

import com.palmoncodes.tracer.Driver;
import com.palmoncodes.utility.Point2D;

public class RegularSample extends Sampler{
	
	public RegularSample(int samples)
	{
		this.samples = samples;
	}
	
	public Point2D sample(int row, int col, int x, int y)
	{
		Point2D point = new Point2D();
		point.x = x-Driver.world.viewPlane.width/2+(col+0.5)/samples;
		point.y = y-Driver.world.viewPlane.height/2+(row+0.5)/samples;
		
		return point;
	}

}
