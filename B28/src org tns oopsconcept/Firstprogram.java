package org.tns.oopsconcept;
public class Firstprogram {
	int year_of_purchase;
	String make;
	int model;
	double cost;
	public void display1()
	{
		System.out.println("year_of_purchase"+2001);
		System.out.println("make"+"Suzuki");
	}
	void disp2()
	{
		System.out.println("model"+1999);
		System.out.println("cost"+500000);
	}

	public static void main(String[] args) {
		
         Firstprogram ob1=new Firstprogram();
         ob1.display1();
         ob1.disp2();
	}


}
