package Projection;

import com.palmoncodes.utility.Point2D;
import com.palmoncodes.utility.Ray;

public abstract class Projection {

	public abstract Ray createRay(Point2D point);

}
