package com.java.singtel;

import org.junit.Assert;

public class UnitTests {

	public static void main(String[] args) { 
		Animal myDuck =  new Duck();
		
		Assert.assertEquals(true,myDuck.walk());
		Assert.assertEquals(true,myDuck.fly());
		Assert.assertEquals(true,myDuck.sing());
		
		
		Animal myChicken =  new Chicken();
		
		Assert.assertEquals(true,myChicken.walk());
		Assert.assertEquals(true,myChicken.fly());
		Assert.assertEquals(true,myChicken.sing());
		
		Animal myRooster =  new Rooster();
		Assert.assertEquals(true,myRooster.walk());
		Assert.assertEquals(true,myRooster.fly());
		Assert.assertEquals(true,myRooster.sing());
		
		RoosterLang myRoosterDel =  new RoosterLang();
	
		Assert.assertEquals(true,myRooster.walk());
		Assert.assertEquals(true,myRooster.fly());
		Assert.assertEquals(true,myRooster.sing());

		Parrot myParrotWithDucks =  new Parrot();
		
		Assert.assertEquals(true,myParrotWithDucks.walk());
		Assert.assertEquals(true,myParrotWithDucks.fly());
		Assert.assertEquals(true,myParrotWithDucks.sing());
		
	}

}
