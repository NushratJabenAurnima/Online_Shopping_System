package basicjava.pro;
import java.util.*;
public class Item_Add_Drop{
     public void addItem(List<Item> ilist){
         for(Item i : ilist)
         System.out.println("The item you have selected is: "+i.ides+"\tPrice: "+i.price); 
    }
     public void removeItem(List<Item> ilist){
         for(Item r : ilist)
         System.out.println("Your item "+r.ides+" has been removed.");
    }   
}
