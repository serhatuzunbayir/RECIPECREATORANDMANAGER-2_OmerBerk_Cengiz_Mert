package test;
import java.util.ArrayList;

public class Recipes {
	public String RecipeName; // we make it public to allow test 
	public ArrayList<Food> includedMeteryals; // we make it public to allow test  
	public String getRecipeName() {
		return RecipeName;
	}
	public String setRecipeName(String recipeName) {
		return RecipeName = recipeName;
		
	}
	public Food addMeteryal(Food meteryal){ // add a food object to the includedMeteryals which is a ArrayList that holds all objects.
		includedMeteryals.add(meteryal);
		return meteryal;
	}
	public Food getMeteryal(int i){return includedMeteryals.get(i);}// return a meterial at given position 
	public ArrayList<Food> getIncludedMeteryals() {
		return includedMeteryals;
	}
	public ArrayList<Food> setIncludedMeteryals(ArrayList<Food> includedMeteryals) { // return types for testing (Default return type was void)
		this.includedMeteryals=includedMeteryals;
		return includedMeteryals;
	}
	public Recipes() {
		RecipeName = "Unknown";
		includedMeteryals = new ArrayList<Food>();
		System.out.println("Recipe name  assigned as "+RecipeName);
	}
}
