package test;
import java.util.ArrayList;
import java.util.Scanner;

public class mainTestClass {
	public Recipes makeRecipe(ArrayList<String> inputs)	// Get inputs from the String ArrayList and full fill the Recipe Object
	// here inputs works like Params, first one for RecipeName and the rest for ingredients
	{
		Recipes tempObject = new Recipes();	
		tempObject.setRecipeName(inputs.get(0));
		for(int i=1;i<inputs.size();i++)
		{
			Food tempFood = new Food();
			tempFood.setUniqeID(i);
			tempFood.setFoodName(inputs.get(i));
			tempObject.addMeteryal(tempFood);
		}
		return tempObject;
	}
	public ArrayList<String> getInput()	// Get inputs from the user until he/she input 0 to exit.
	{
		Scanner scanner = new Scanner(System.in);
		String recipe = "";
		ArrayList<String> tempArrayList = new ArrayList<String>();
		System.out.println("Please input the name of the recipe...(to Exit please input 0)");
		recipe=scanner.nextLine();
		tempArrayList.add(recipe);		
		recipe="";
		do{
			System.out.println("Please input the ingredients of the recipe...(to Exit please input 0)");
			recipe=scanner.nextLine();
			if(recipe.compareTo("0")!=0)tempArrayList.add(recipe);	
		}while(recipe.compareTo("0")!=0);
		System.out.println("Recipe name has been saved succesfully!");// Test Case 12 
		return tempArrayList;	
	}
	public boolean displayAllrecipes(ArrayList<Recipes> myRecipe){ // Display method , It displays all members in the ArrayList<Recipes> object
		for(int i=0;i<myRecipe.size();i++)
		{	
				System.out.println("\nYou need to use these items to make ready " + myRecipe.get(i).getRecipeName() + " ; ");
				for(int j=0;j< myRecipe.get(i).getIncludedMeteryals().size();j++)
				{
					System.out.print(myRecipe.get(i).getMeteryal(j).getFoodName());
					if(!(j==myRecipe.get(i).getIncludedMeteryals().size()-1)){System.out.print(",");}
				}
		}
		return true;
	}
	public  Recipes findTheRecipe(ArrayList<Recipes> myRecipe,String SearchedFood){ // This method to search a recipe in the list.
		Recipes searchedRecipe=null;
		for(int i=0;i<myRecipe.size();i++)
		{
			if(SearchedFood.compareTo(myRecipe.get(i).getRecipeName())==0)
			{	
				searchedRecipe=myRecipe.get(i);
				System.out.println("\nYou need to use these items to make ready your food;\n");
				for(int j=0;j< myRecipe.get(i).getIncludedMeteryals().size();j++)
				{
					System.out.print(myRecipe.get(i).getMeteryal(j).getFoodName());
					if(!(j==myRecipe.get(i).getIncludedMeteryals().size()-1)){System.out.print(",");}
				}
				System.out.println("\n");
			}	
		}
		return searchedRecipe;	
	}
	public int main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Recipes> recipList = new ArrayList<Recipes>(); // recipList holds our all recipes.
		Scanner scanner = new Scanner(System.in);
		String selectedChoice = "0"; // user choice
		do
		{
			System.out.println("\nPlease input your choice...\n\t[1]---> for input new recipe\n\t[2]---> for search a recipe\n\t[3]---> for display all recipes\n\t[31]---> to EXIT\n...");
			selectedChoice=scanner.nextLine();
			if(selectedChoice.compareTo("31")==0)
			{
				break;
			}
			else if(selectedChoice.compareTo("1")==0)
			{
				Recipes comingValue = makeRecipe(getInput());
				// FOR TEST CASE 15
				if(comingValue != null )
				{
					System.out.println("\nSytem provide a new recipe to be saved. Successfully\n");
				}
				recipList.add(comingValue);
			}
			else if(selectedChoice.compareTo("2")==0)
			{
				// FOR TEST CASE 16
				System.out.println("Please input the name of recipe that you want to show details of it\n...");
				String searchedRecipeName = scanner.nextLine();
				if(searchedRecipeName.compareTo(findTheRecipe(recipList,scanner.nextLine()).getRecipeName())==0)
				{
					System.out.println("\nSystem found the recipe that user wanted to find out Successfully\n");
				}
			}
			else if(selectedChoice.compareTo("3")==0)
			{
				displayAllrecipes(recipList);
			}
			else
			{
				//FOR TEST CASE 18
				System.out.println("Please input your choice between 1-3 you beach. GO AWAY!\n");
			}
		}
		while(selectedChoice.compareTo("31")!=0);
		// FOR TEST CASE 17
		System.out.println("\n\nProgram is terminated!....\n\n");
		return 0;
	}

}
