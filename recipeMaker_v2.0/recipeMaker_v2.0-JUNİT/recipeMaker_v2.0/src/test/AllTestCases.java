package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AllTestCases {
	
	@Test
	public void test1() // Test1 test the setFoodName function of the food class
	{
		Food testFood = new Food();
		assertEquals("Mercimek",testFood.setFoodName("Mercimek"));
	}
	@Test
	public void test2()	// Test2 test the getFoodName function of the food class
	{
		Food testFood = new Food();
		testFood.setFoodName("Mercimek");
		assertEquals("Mercimek",testFood.getFoodName());
	}
	@Test
	public void test3() // Test3 test the setUniqeID function of the food class
	{
		Food testFood = new Food();
		assertEquals(1234,testFood.setUniqeID(1234));
	}
	@Test
	public void test4() // Test4 test the getUniqeID function of the food class
	{
		Food testFood = new Food();
		testFood.setUniqeID(1234);
		assertEquals(1234,testFood.getUniqeID());
	}
	@Test
	public void test5() // Test5 the default constructor function of the food class set the default value for foodName attribute
	{
		Food testFood = new Food();
		assertEquals("unknown",testFood.getFoodName());	
	}
	@Test
	public void test6() // Test6 the default constructor function of the Recipes class set the default value for recipeName attribute
	{	
		Recipes testRecipes = new Recipes();
		assertEquals("Unknown",testRecipes.RecipeName);	
	}
	@Test
	public void test7() // Test7 the default constructor function of the Food class set the default value for uniqueID attribute
	{
		Food testFood = new Food();
		assertEquals(0,testFood.getUniqeID());
	}
	@Test
	public void test8() // Test8 the default constructor function of the Recipes class set the default value for uniqueID attribute
	{
		Recipes testRecipes = new Recipes();
		assertNotNull(testRecipes.includedMeteryals);
	}
	@Test
	public void test9()	// Test9 the setRecipeName function of the Recipes class set recipeName attribute
	{
		Recipes testRecipes = new Recipes();
		assertEquals("Mercimek",testRecipes.setRecipeName("Mercimek"));
	}
	@Test
	public void test10() // Test10 the getRecipeName function of the Recipes class get recipeName attribute
	{
		Recipes testRecipes = new Recipes();
		testRecipes.RecipeName="Mercimek";
		assertEquals("Mercimek",testRecipes.getRecipeName());
	}
	@Test
	public void test11() // Test11 does the addMeteryal function of the Recipes class add a Food object 
	{
		Recipes testRecipes = new Recipes();
		Food theFoodObjectWillBeAdded= new Food();
		assertEquals(theFoodObjectWillBeAdded,testRecipes.addMeteryal(theFoodObjectWillBeAdded));
	}
	@Test
	public void test12() // Test12 does the getMeterial function of the Recipes class get the food object at given position
	{
		Recipes testRecipes = new Recipes();
		Food theFoodObjectWillBeAdded= new Food();
		testRecipes.addMeteryal(theFoodObjectWillBeAdded);
		assertEquals(theFoodObjectWillBeAdded,testRecipes.getMeteryal(0));
	}
	@Test
	public void test13() // Test13 does the getIncludedMeterial function of the Recipes class get a ArrayList that holds Food objects
	{
		Recipes testRecipes = new Recipes();
		Food theFoodObjectWillBeAdded= new Food();
		ArrayList<Food> testList = new ArrayList<Food>();
		testList.add(theFoodObjectWillBeAdded);
		testRecipes.includedMeteryals=testList;
		assertEquals(testList,testRecipes.getIncludedMeteryals());
	}
	@Test
	public void test14() // Test14 does the setIncludedMeterial function of the Recipes class set includedMeteryals;
	{
		Recipes testRecipes = new Recipes();
		Food theFoodObjectWillBeAdded= new Food();
		ArrayList<Food> testList = new ArrayList<Food>();
		testList.add(theFoodObjectWillBeAdded);
		assertEquals(testList,testRecipes.setIncludedMeteryals(testList));
	}
	@Test
	public void test15() // Test15 does the makeRecipe function of the mainTestClass class make a new Recipe;
	{
		mainTestClass mainClass = new mainTestClass();
		ArrayList<String> meterials = new ArrayList<String>();
		meterials.add("Menemen");
		meterials.add("sogan");
		meterials.add("patates");
		meterials.add("yumurta");
		assertNotNull(mainClass.makeRecipe(meterials));
	}
	@Test
	public void test16() // Test16 does the findTheRecipe function of the mainTestClass class find given object in the given list;
	{
		mainTestClass mainClass = new mainTestClass();
		ArrayList<Recipes> myRecipe=new ArrayList<Recipes>();
		ArrayList<String> meterials = new ArrayList<String>();
		meterials.add("Menemen");
		meterials.add("sogan");
		meterials.add("patates");
		meterials.add("yumurta");
		Recipes newRecipe =	mainClass.makeRecipe(meterials);
		myRecipe.add(newRecipe);
		assertEquals(newRecipe,mainClass.findTheRecipe(myRecipe, "Menemen"));
	}
	@Test
	public void test17() // Test17 may the setUniqueID function of the Food Class return wrong value 
	{
		Food testFood = new Food();
		assertNotEquals("mert",testFood.setUniqeID(15));
	}
	@Test
	public void test18() // Test18 does getInput function of the mainTestClass return a not null object 
	{
		mainTestClass mainClass = new mainTestClass();
		assertNotNull(mainClass.getInput());
	}
	@Test
	public void test19() // Test19 does displayAllrecipes function of the mainTestClass return true 
	{
		mainTestClass mainClass = new mainTestClass();
		ArrayList<Recipes> myRecipe=new ArrayList<Recipes>();
		ArrayList<String> meterials = new ArrayList<String>();
		meterials.add("Menemen");
		meterials.add("sogan");
		meterials.add("patates");
		meterials.add("yumurta");
		Recipes newRecipe =	mainClass.makeRecipe(meterials);
		myRecipe.add(newRecipe);
		assertEquals(true, mainClass.displayAllrecipes(myRecipe));
	}
	@Test
	public void test20() // Test20 does the main function of the mainTestClass terminated successfully
	{
		mainTestClass mainClass = new mainTestClass();
		assertEquals(0, mainClass.main(null));
	}
}
