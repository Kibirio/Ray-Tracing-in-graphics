package com.palmoncodes.utility;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.palmoncodes.tracer.Driver;

public class Image {

	public BufferedImage buffer;
	public File image;
	
	public Image(String fileName)
	{
		image = new File(fileName);
		buffer =  new BufferedImage(Driver.world.viewPlane.width, Driver.world.viewPlane.height, BufferedImage.TYPE_INT_RGB);
	}
	
	public void write(String fileType)
	{
		try {
			ImageIO.write(buffer, fileType, image);
		} catch (IOException e) {
			System.out.println("Image could not write image");
			System.exit(1);
		}
	}
}
