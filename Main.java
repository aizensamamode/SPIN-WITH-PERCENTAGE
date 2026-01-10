import java.util.Scanner;
import java.util.Random;

public class Main{
    static Random random = new Random();
    String name;
    String percentage;


    static Main [] storage_of_items = {
        new Main("RARE", "30%"),
        new Main("COMMON", "20%"),
        new Main("EPIC", "50%")
    }; 


    //constructor
    Main (String name, String percentage){
    this.name = name;
    this.percentage = percentage;
    }  



    //menu player see when the game starts
    //this is  a method
    static int menu(Scanner scan){
        System.out.println("PERCENTAGE SPIN");
        System.out.println("1.) SPIN ");
        System.out.println("2.) STORAGE");
        int menu_number_picked_by_player = scan.nextInt();
        return menu_number_picked_by_player;

    }

    //This is SPIN. this called when player choose 1
    //this is a method
    static void Spin(){
        // this method i called and it spin a random item in storage and return the item but
        Main item;
        item = storage_of_items[random.nextInt(storage_of_items.length)];
        System.out.println(item.name+" "+item.percentage);
    }

     

    


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // declaring objects
        
        //menu starting point of the game 
        System.out.println("WELCOME TO THE PERCENTAGE SPIN");
        System.out.println("THIS IS A TEXT CONSOLE GAME FOR TEST");
        System.out.println("PRESS [ENTER TO START]");
        scan.nextLine();

        int num = menu(scan);
        if(num == 1){  // if player choose 1
        Spin();

        }else{
            System.out.println("try again!!"); // wrong input
        }
        
    }
}