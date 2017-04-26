import java.util.ArrayList;

public class Recipes {
	private String RecipeName;
	private ArrayList<Food> includedMaterials;
	public String getRecipeName() {
		return RecipeName;
	}
	public void setRecipeName(String recipeName) {
		RecipeName = recipeName;
	}
	public void addMaterial(Food meteryal){
		includedMeteryals.add(meteryal);
	}
	public Food getMaterial(int i){return includedMaterials.get(i);}
	public ArrayList<Food> getIncludedMeteryals() {
		return includedMaterials;
	}
	public void setIncludedMaterials(Food includedMaterials) {
		this.includedMaterials.add(includedMaterials);
	}
	public Recipes() {
		RecipeName = "Unknown";
		includedMaterials = new ArrayList<Food>();
	}
}
