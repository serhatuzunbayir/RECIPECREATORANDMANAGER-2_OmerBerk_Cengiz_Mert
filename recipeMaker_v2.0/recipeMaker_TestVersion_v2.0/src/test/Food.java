package test;

public class Food {
	private String FoodName;
	private int uniqeID;
	public String getFoodName() {
		return FoodName;
	}
	public String setFoodName(String foodName) {// return types for testing (Default return type was void)
		return FoodName = foodName;
	}
	public int getUniqeID() {
		return uniqeID;
	}
	public int setUniqeID(int uniqeID) {// return types for testing (Default return type was void)
		System.out.println("Unique ID has been sent!");
		return this.uniqeID = uniqeID;
	}
	public Food(){FoodName="unknown";uniqeID=0;System.out.println("Food name is " + FoodName + " and uniqueid is " + uniqeID);}
}
