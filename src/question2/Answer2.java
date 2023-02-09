package question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Answer2 {
    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<Item>();
        itemList.add(new Item("Fruit","Orange"));
        itemList.add(new Item("Fruit", "Apple"));
        itemList.add(new Item("Fruit", "Banana"));
        itemList.add(new Item("Animal","Tiger"));
        itemList.add(new Item("Animal","Dog"));
        itemList.add(new Item("Vehicle","Car"));
        itemList.add(new Item("Vehicle","Boat"));
        itemList.add(new Item("Vehicle","Plane"));
        new Answer2().process(itemList);
    }

    public void process(List<Item> itemList) {
        // Sort the item list with type and name
        Collections.sort(itemList,(item1,item2)->{
            int typeComp = item1.getType().compareTo(item2.getType()); // get the different of item1 and item2 type
            if (typeComp != 0) { // if both types are not equal, sort with asec order
                return typeComp;
            }
            return item1.getName().compareTo(item2.getName()); // if both types are equal, sort by name with asec order
        });

        String oldType = "";
        for(Item i:itemList) {
            if (!i.getType().equals(oldType)) {
                System.out.println("-Type="+i.getType());
                System.out.println("\t-Name="+i.getName());
                oldType = i.getType();
            } else {
                System.out.println("\t-Name="+i.getName());
            }
        }
    }
}
