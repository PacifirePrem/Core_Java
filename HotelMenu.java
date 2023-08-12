package com.company;
import java.util.Scanner;

public class HotelMenu {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Recktonbuds.com");
		while(true){
			System.out.println("To order South Indian Dish, Enter 1");
			System.out.println("To order North Indian Dish, Enter 2");
			System.out.println("To order Rajasthani Dish, Enter 3");
			System.out.println("To order Desserts, Enter 4");
			System.out.println("To Exit, Enter 5");

			System.out.println("Enter your choice::");
			int choice = scan.nextInt();

			switch(choice){
			case 1: System.out.println("Welcome to South Indian Food Court");
			southIndianFood();
			break;
			case 2: System.out.println("Welcome to North Indian Food Court");
			northIndianFood();
			break;
			case 3: System.out.println("Welcome to Rajasthani Food Court");
			rajasthaniFood();
			break;
			case 4: System.out.println("Welcome to Desserts Food Court");
			desserts();
			break;
			case 5: System.out.println("Thanks for ordering from our App. Visit again");
			System.exit(0);
			break;
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
		}

	}

	public static void southIndianFood(){
		System.out.println("You get:");
		System.out.println("Idli : 2 Pieces:");
		System.out.println("Butter Cheese Dosa : 1 Pieces:");
		System.out.println("Vada : 2 Pieces:");

	}

	public static void northIndianFood(){
		System.out.println("You get:");
		System.out.println("Chole Bhature : 2 Pieces:");
		System.out.println("Litti Chokha : 4 Pieces:");
	}

	public static void rajasthaniFood(){
		System.out.println("You get:");
		System.out.println("Dal Baati Churma");
		System.out.println("Laal maas");
		System.out.println("Methi Bajra puri");

	}

	public static void desserts(){
		System.out.println("You get:");
		System.out.println("Rasmalai");
		System.out.println("Rasgulla : 2 Pieces");
		System.out.println("Emarti : 2 Pieces");
		System.out.println("Gajar ka halwa");

	}

}
  

