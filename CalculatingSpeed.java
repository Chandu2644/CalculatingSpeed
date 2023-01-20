package com.calculatingspeed;
import java.util.Scanner;
class DataSet
{
	double distance;
	double time;
	double speed;
	double a,b;
}
class UserInput extends DataSet
{
	double input1(double a)
	{
		
		return a;	
	}
	double input2(double b)
	{
		
		return b;
	}
	
	
}
class Measure extends UserInput
{
	double input( double a,double b)
	{
		distance=a;
		time=b;
		speed= distance/time;
		return speed;
	}
}
class CalculatingSpeed extends Measure
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		CalculatingSpeed sr=new CalculatingSpeed();
		System.out.println("Enter the Distance in Kilometers");
		double d=sr.input1(s.nextDouble());
		System.out.println("Enter the time in Hours");
		double t=sr.input2(s.nextDouble());
		double ref=sr.input(d,t);
		System.out.println("Distance="+d+" "+"Km");
		System.out.println("Time="+t+" "+"Hourse");
		
		System.out.println("Speed is="+ref+" "+"Km/h");

	}

}


	
