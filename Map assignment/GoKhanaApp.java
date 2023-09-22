package m1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;


	public class GoKhanaApp {
		public static void main(String[] args) {
			Map<FoodItem,List<Review>> map = new HashMap<>();
			TreeSet<FoodItem>allFoodItems = new TreeSet<>();
			FoodItem f1= new FoodItem("Dal",60,"Veg");
			FoodItem f2= new FoodItem("Chicken",100,"Non Veg");
			FoodItem f3= new FoodItem("naan",45,"veg");
			
			
			allFoodItems.add(f1);
			allFoodItems.add(f2);
			allFoodItems.add(f3);
			
			for (FoodItem foodItem : allFoodItems) {
				System.out.println(foodItem);
			}
			System.out.println("---  Items (Low to High)  ----------");
			getFoodItemsBasedOnPriceLowToHigh(allFoodItems);
			
			System.out.println("---  Items (High to Low)  ----------");
			getFoodItemsBasedOnPriceHighToLow(allFoodItems);

			System.out.println("---  Items (Category Wise)  ----------");
			getFoodItemsBasedOnCategory(allFoodItems);
		
			List<Review> revList = new ArrayList<>();

			Review r1A = new Review("A", 3, "Satisfied");
			Review r1B = new Review("B", 4, "Very Good");
			Review r1C = new Review("C", 2, "Not Good ");

			revList.add(r1A);
			revList.add(r1B);
			revList.add(r1C);
			map.put(f1, revList);


			List<Review> revList1 = new ArrayList<>();
			List<Review> revList2 = new ArrayList<>();
			List<Review> revList3 = new ArrayList<>();
			



			Review r1 = new Review("Vikas", 4, "Very Good	");
			Review r2 = new Review("Ashwin", 2, "Not Good ");
			Review r3 = new Review("Sai", 4, "Very Good");
			


			revList1.add(r1);
			revList2.add(r2);
			revList3.add(r3);
			


			map.put(f1, revList1);
			map.put(f2, revList2);
			map.put(f3, revList3);
			

			for(Map.Entry<FoodItem,List<Review>> entry : map.entrySet())
			{
				  FoodItem key = entry.getKey();
				  List<Review> value = entry.getValue();
                
				 System.out.println("---- "+key.getItem()+"-------");
				 System.out.println("Price rs. "+key.getCost());
				 System.out.println("Category "+key.getCategory());

				 System.out.println(" --- Reviews ---");
				 
				 for (Review review : value) {
					 System.out.println("UserName: "+review.getUserName());
					for(int i=0;i<review.getPoint();i++)
					{
						System.out.print("*");
					}

					 System.out.print(review.getComments()+"\n");
				}
				 System.out.println("\n\n");
			}

		}
		private static void getFoodItemsBasedOnCategory(TreeSet<FoodItem> allFoodItems) {
			// TODO Auto-generated method stub
			// Step1 -> convert set to List
			List<FoodItem> tempList = new ArrayList<>();// or pass as constructor argument
			tempList.addAll(allFoodItems);
			
			// Step 2-> create Comparator class Object
			SortFoodItemBasedOnCategory sortCode = new SortFoodItemBasedOnCategory();
			
			Collections.sort(tempList, sortCode);
			
			for (FoodItem foodItem : tempList) {
				System.out.println(foodItem);
			
			}
		}
		private static void getFoodItemsBasedOnPriceLowToHigh(TreeSet<FoodItem> allFoodItems) {
			// TODO Auto-generated method stub
			// Step1 -> convert set to List
			List<FoodItem> tempList = new ArrayList<>();// or pass as constructor argument
			tempList.addAll(allFoodItems);
			
			// Step 2-> create Comparator class Object
			SortFoodItemBasedOnCostLowToHigh sortCode = new SortFoodItemBasedOnCostLowToHigh();
			
			Collections.sort(tempList, sortCode);
			
			for (FoodItem foodItem : tempList) {
				System.out.println(foodItem);
			}
			 
		
		}

		private static void getFoodItemsBasedOnPriceHighToLow(TreeSet<FoodItem> allFoodItems) {
			// TODO Auto-generated method stub
			// Step1 -> convert set to List
			List<FoodItem> tempList = new ArrayList<>();// or pass as constructor argument
			tempList.addAll(allFoodItems);
			
			// Step 2-> create Comprator class Object
			SortFoodItemBasedOnCostHighToLow sortCode = new SortFoodItemBasedOnCostHighToLow();
			
			Collections.sort(tempList, sortCode);
			
			for (FoodItem foodItem : tempList) {
				System.out.println(foodItem);
			}
			
			
		}
		
		
}
