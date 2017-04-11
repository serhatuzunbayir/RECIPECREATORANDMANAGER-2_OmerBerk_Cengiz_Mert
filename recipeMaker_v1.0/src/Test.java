import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
		ArrayList<Recipes> tarifDefteri = new ArrayList<Recipes>();
		Food tempFood = new Food();
		Food tempFood2 = new Food();
		Food tempFood3 = new Food();
		tempFood.setFoodName("Yumurta");
		tempFood.setUniqeID(1);
		
		Recipes tempObject = new Recipes();
		
		tempObject.setRecipeName("menemen");
		
		tempObject.setIncludedMeteryals(tempFood);
		
		tempFood2.setFoodName("Sucuk");
		tempFood2.setUniqeID(2);
		
		tempObject.setIncludedMeteryals(tempFood2);
		
		tempFood3.setFoodName("domates");
		tempFood3.setUniqeID(3);
		
		tempObject.setIncludedMeteryals(tempFood3);
		tarifDefteri.add(tempObject);
		
		for(int i=0;i<tarifDefteri.size();i++)
		{
			for(int j=0;j< tarifDefteri.get(i).getIncludedMeteryals().size();j++)
			{
				System.out.println("\n"+tarifDefteri.get(i).getMeteryal(j).getFoodName());
			}
		}
		
		
	}

}
