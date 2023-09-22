package m1;

import java.util.Objects;

public class FoodItem implements Comparable<FoodItem>
{
private  String item;
private int cost;
private String category;


public FoodItem(String item, int cost, String category) {
	super();
	this.item = item;
	this.cost = cost;
	this.category = category;
}


public String getItem() {
	return item;
}


public void setItem(String item) {
	this.item = item;
}


public int getCost() {
	return cost;
}


public void setCost(int cost) {
	this.cost = cost;
}


public String getCategory() {
	return category;
}


public void setCategory(String category) {
	this.category = category;
}


@Override
public int compareTo(FoodItem foodItem) {
	// TODO Auto-generated method stub
	return this.getItem().compareTo(foodItem.getItem());

}

@Override
public int hashCode() {
	return Objects.hash(category, cost, item);
}


@Override
public boolean equals(Object obj) {
if(obj instanceof FoodItem)
{
	FoodItem foodItem = (FoodItem)obj;
	boolean a = foodItem.equals(this.getItem());
	boolean b = foodItem.cost==this.cost;
	boolean c = foodItem.category==this.category;
	
	
	return a && b && c;
	
}
else {
	return false;
}

}
@Override
public String toString() {
	return "FoodItem [item=" + item + ", cost=" + cost + ", category=" + category + "]";
}
	
}

