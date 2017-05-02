import java.util.ArrayList;

public class Recipes {
	private String RecipeName;
	private ArrayList<Food> includedMeteryals;
	public String getRecipeName() {
		return RecipeName;
	}
	public void setRecipeName(String recipeName) {
		RecipeName = recipeName;
	}
	public void addMeteryal(Food meteryal){
		includedMeteryals.add(meteryal);
	}
	public Food getMeteryal(int i){return includedMeteryals.get(i);}
	public ArrayList<Food> getIncludedMeteryals() {
		return includedMeteryals;
	}
	public void setIncludedMeteryals(Food includedMeteryals) {
		this.includedMeteryals.add(includedMeteryals);
	}
	public Recipes() {
		RecipeName = "Unknown";
		includedMeteryals = new ArrayList<Food>();
	}
}
