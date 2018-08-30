package com.company;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("You have "+groceryList.size()+" Items ");
        for (int i= 0; i<groceryList.size();i++){
            System.out.println((i+1) + "." +groceryList.get(i));
        }
    }
    public void  modifyItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if (position>=0){
            modifyItem(position,newItem);
        }
    }

    private void modifyItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Item " +(position+1) +"is modified.");

    }
    public void removeItem(String  theItem){
        int position = findItem(theItem);
        removeItem(position);
    }

    private void  removeItem(int position)
    {
        String theItem = groceryList.get(position);
        groceryList.remove(theItem);
    }
    public   String searchItem(String item){
        int position = groceryList.indexOf(item);
        if (position>=0){
            return groceryList.get(position);

        }
        return null;
    }
    public int findItem(String item){
        int position = groceryList.indexOf(item);
        return position;
    }
}
