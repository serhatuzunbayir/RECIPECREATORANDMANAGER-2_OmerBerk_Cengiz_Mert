package test;
import java.util.ArrayList;

public class Recipes {
	private String RecipeName;
	private ArrayList<Food> includedMeteryals;
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
	public Food setIncludedMeteryals(Food includedMeteryals) { // return types for testing (Default return type was void)
		this.includedMeteryals.add(includedMeteryals);
		return includedMeteryals;
	}
	public Recipes() {
		RecipeName = "Unknown";
		includedMeteryals = new ArrayList<Food>();
		System.out.println("Recipe name  assigned as "+RecipeName);
	}
}
