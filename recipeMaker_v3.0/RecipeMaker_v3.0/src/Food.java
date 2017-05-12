
public class Food {
	private String FoodName;
	private int uniqeID;
	public String getFoodName() {
		return FoodName;
	}
	public void setFoodName(String foodName) {
		FoodName = foodName;
	}
	public int getUniqeID() {
		return uniqeID;
	}
	public void setUniqeID(int uniqeID) {
		this.uniqeID = uniqeID;
	}
	public Food(){FoodName="Unknown";uniqeID=0;}
}
