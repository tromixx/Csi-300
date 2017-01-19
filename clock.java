Clock
/**
*Ex1
*Created by Tomy on 1/12/17
*/
public class Clock 
{
		//instance variable declaration
		private int hours; //0-23
		private int minutes; //0-59
		private int seconds; //0-59
		
		//Constructor declaration
		//Constructor is used to initialize objects
		
		//Behaviors: Constructs a clock with the specified hours,
		//min and seconds
		//
		public Clock(int myhours, int myminutes, int myseconds)
		{
			hours = myhours;
			minutes = myminutes;
			seconds = myseconds;
		}	
		//Constructs a clock with the specified hours and minutes
		//seconds are set 0
		//two methods with the same name is called overloading
		public Clock(int myhours, int myminutes)
		{
			hours = myhours;
			minutes = myminutes;
			seconds = 0;
		}	
		//Constructs a clock whose hours, minutes and seconds are set to 0
		//default constructor
		public clock()
		{
			//this will call constructor with three parameter
			this(myhours:0, myminutes:0, myseconds:0);
		}
		
		//converts this object into a string for display
		public String toString(){
			return makeTwoDigits(hours) + ";"+
					makeTwoDigits(minutes)+":"+
					makeTwoDigits(seconds);
		}
		
		//convert an integers to string form, adding a leading zero
		//if the number has only one digit
		//helper method is usually declared as private
		//private meands this method is internal this class
		private static String makeTwoDigits(int n)
		{
			//n is single digit
			if (n <= 9)	
				return "0" + n;
			
		}
		
		
}
