package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printOptions();
        while (!quit) {
            System.out.println("Enter your option");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printOptions();
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }
public static void  printOptions(){

            System.out.print("\nPress");
            System.out.print("\t 0- To print the options");
            System.out.print("\t 1- To print the grocery list");
            System.out.print("\t 2- To add an item to the grocery list");
            System.out.print("\t 3- To modify an item");
            System.out.print("\t 4- To remove an item");
            System.out.print("\t 5- To search for an item");
            System.out.print("\t 6- To quit");
        }

        public static void addItem(){
            System.out.println("Enter the item");
            groceryList.addItem(scanner.nextLine());
        }

    public static void modifyItem(){
        System.out.println("Enter the item name");
        String itemname = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter the replacing item");
        String newItem = scanner.nextLine();
        groceryList.modifyItem(itemname,newItem);

    }
    public static void removeItem(){
        System.out.println("Enter the item number");
        String itemname = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeItem(itemname);
    }
    public static void searchItem(){
        System.out.println("Enter the item to search");
        String item = scanner.nextLine();
       if (groceryList.searchItem(item)!=null)
       {
           System.out.println("Found the Item "+item);
       }
       else {
           System.out.println(item+" is not in the shopping list");
       }
    }



    }

