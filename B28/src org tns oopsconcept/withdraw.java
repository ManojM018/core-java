package org.tns.oopsconcept;

public class Cube {
	static void volume(int a)
	{
		int volume=(a*a*a);
		System.out.println("Volume of cube is "+volume);
		
	}
	static void volume(int l,int b,int h)
	{
		int volume=(l*b*h);
		System.out.println("Volume of cuboid is "+volume);
		
	}
	static void volume(float pi,int r)
	{
		float volume=((4/3)*pi*r*r*r);
		System.out.println("Volume of sphere is "+volume);
	}
	public static void main(String[] args) {
		volume(8);
		volume(3,5,8);
		volume(5,9);
	}

}
