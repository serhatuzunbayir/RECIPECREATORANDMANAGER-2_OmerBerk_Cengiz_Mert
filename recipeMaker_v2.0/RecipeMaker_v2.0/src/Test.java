import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static Recipes makeRecipe(ArrayList<String> inputs)
	{
		Recipes tempObject = new Recipes();
		tempObject.setRecipeName(inputs.get(0));
		for(int i=1;i<inputs.size();i++)
		{
			Food tempFood = new Food();
			tempFood.setUniqeID(i);
			tempFood.setFoodName(inputs.get(i));
			tempObject.setIncludedMeteryals(tempFood);
		}
		return tempObject;
	}
	public static ArrayList<String> getInput()
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
		return tempArrayList;
		
	}
	public static void displayAllrecipes(ArrayList<Recipes> myRecipe){
		for(int i=0;i<myRecipe.size();i++)
		{	
				System.out.println("\nYou need to use these items to make ready " + myRecipe.get(i).getRecipeName() + " ; ");
				for(int j=0;j< myRecipe.get(i).getIncludedMeteryals().size();j++)
				{
					System.out.print(myRecipe.get(i).getMeteryal(j).getFoodName());
					if(!(j==myRecipe.get(i).getIncludedMeteryals().size()-1)){System.out.print(",");}
				}
		}	
	}
	public static void findTheRecipe(ArrayList<Recipes> myRecipe,String SearchedFood){
		for(int i=0;i<myRecipe.size();i++)
		{
			if(SearchedFood.compareTo(myRecipe.get(i).getRecipeName())==0)
			{	
				System.out.println("\nYou need to use these items to make ready your food;\n");
				for(int j=0;j< myRecipe.get(i).getIncludedMeteryals().size();j++)
				{
					System.out.print(myRecipe.get(i).getMeteryal(j).getFoodName());
					if(!(j==myRecipe.get(i).getIncludedMeteryals().size()-1)){System.out.print(",");}
				}
				System.out.println("\n");
			}	
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello");
		ArrayList<Recipes> recipList = new ArrayList<Recipes>();
		//recipList.add(makeRecipe(getInput()));
		
		Scanner scanner = new Scanner(System.in);
		String selectedChoice = "0";
		do
		{
			System.out.println("Please input your choice...\n\t[1]---> for input new recipe\n\t[2]---> for search a recipe\n\t[3]---> for display all recipes\n\t[31]---> to EXIT\n...");
			selectedChoice=scanner.nextLine();
			if(selectedChoice.compareTo("31")==0)
			{
				break;
			}
			else if(selectedChoice.compareTo("1")==0)
			{
				recipList.add(makeRecipe(getInput()));
			}
			else if(selectedChoice.compareTo("2")==0)
			{
				System.out.println("Please input the name of recipe that you want to show details of it\n...");
				findTheRecipe(recipList,scanner.nextLine());
			}
			else if(selectedChoice.compareTo("3")==0)
			{
				displayAllrecipes(recipList);
			}
			else
			{
				System.out.println("Please input your choice between 1-3 you beach. GO FUCK AWAY!\n");
			}
		}
		while(selectedChoice.compareTo("31")!=0);
		
		System.out.println("\n\nSystem shut down!....\n\n");
		
		
	}

}
