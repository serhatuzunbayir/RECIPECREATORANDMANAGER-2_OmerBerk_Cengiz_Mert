package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AllTestCases {

	@Test
	public void test() 
	{
		//fail("Not yet implemented");
		mainTestClass myTestUnit = new mainTestClass();
		Food testFood = new Food();// Test Case 4
		assertEquals("menemen",testFood.setFoodName("menemen")); // Test Case 1
		assertEquals(212064,testFood.setUniqeID(212064));// Test Case 3
		assertEquals(212064,testFood.getUniqeID()); // Test Case 2
		/// These are for test case 10
		Recipes recipe = new Recipes();
		/// These are for test case 10
		recipe.setRecipeName("dolma");
		assertEquals("dolma",recipe.getRecipeName());// Test Case 5
		assertEquals("yeniMenemen",recipe.setRecipeName("yeniMenemen"));// Test Case 6
		
		
		int lastPostion=0;	
		lastPostion=recipe.getIncludedMeteryals().size()-1;
		assertEquals(testFood,recipe.addMeteryal(testFood));/// These are for test case 7
		assertEquals(testFood,recipe.getMeteryal(lastPostion+1));/// These are for test case 8
		assertEquals(testFood,recipe.setIncludedMeteryals(testFood));/// These are for test case 9 
		
		ArrayList<String> inputs =myTestUnit.getInput();//Test Case 12
		assertNotNull(myTestUnit.makeRecipe(inputs)); // Test Case 11
		
		
		Recipes testRecipeObject = new Recipes();
		ArrayList<String> inputForTesting =	myTestUnit.getInput();
		testRecipeObject=myTestUnit.makeRecipe(inputForTesting);
		ArrayList<Recipes> testRecipes = new ArrayList<Recipes>();
		testRecipes.add(testRecipeObject);
		myTestUnit.displayAllrecipes(testRecipes);//Test Case 13
		/// at this step we need to see output it must be same with our input!
		// When we search the Recipe that we assigned we must find it
		assertEquals(testRecipeObject.getRecipeName(),myTestUnit.findTheRecipe(testRecipes, testRecipeObject.getRecipeName()).getRecipeName());		
		// Test case 14
		
		myTestUnit.main(null);//Test Case 15,Test Case 16,Test Case 17,Test Case 18,Test Case 19
	}
}
