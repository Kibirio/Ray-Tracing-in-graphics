package com.palmoncodes.utility;

public class Color {

	public float r, g, b;
	
	public Color()
	{
		r = 0.0F;
		g = 0.0F;
		b = 0.0F;
	}

	public Color(float r, float g, float b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public Color(Color color)
	{
		r = color.r;
		g = color.g;
		b = color.b;
	}

	public void add(Color color)
	{
		r += color.r;
		g += color.g;
		b += color.b;
	}
	
	public void divide(int scalar)
	{
		r /= scalar;
		g /= scalar;
		b /= scalar;
	}
	
	// convert color to an integer  value
	public int toInteger()
	{
		return (int)(r*255) <<16 | (int)(g*255) <<8| (int) (b*255);
	}
	
	
}
