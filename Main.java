import java.util.Scanner;
import java.util.Random;

public class Main{
    static Random random = new Random();
    String name;
    int percentage;
    static int total = 0;
    static int rare = 0, common = 0, epic = 0; //will use later to show how many did the item shows to see if things are working


    static Main [] storage_of_items = {
        new Main("RARE", 15),
        new Main("COMMON",50),
        new Main("EPIC", 5)
    }; 


    //constructor
    Main (String name, int percentage){
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
        //code for adding up all items
        total = 0;
        for(Main item  : storage_of_items){
        total += item.percentage;
        }
        

        int randomize_item_base_total = random.nextInt(total);

        int checking_the_item = 0;
        for(Main item : storage_of_items){
            checking_the_item += item.percentage;
            System.out.println(checking_the_item + " this is checking the item total");
            System.out.println(randomize_item_base_total + " this si the random");
            if (randomize_item_base_total < checking_the_item) {
                System.out.println(item.name+" ANSWER BECAUSE "+randomize_item_base_total+" < "+checking_the_item);
                
                if(item.name.equalsIgnoreCase("common")){
                    common ++; // if user gets common it will add +1 to common to show it alrdy shows
                    }else if(item.name.equalsIgnoreCase("rare")){
                    rare ++;
                    }else{
                    epic ++;
                    }
                
                break;
                    
            }   
        }


        // this method i called and it spin a random item in storage and return the item but
        /*Main item;
        item = storage_of_items[random.nextInt(storage_of_items.length)];
        */
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
        }else if(num == 2){
            System.out.println("-[ITEMS]-  |  -[TOTAL]-");
            System.out.println(Main.storage_of_items[0].name+"       |  "+ epic);
            System.out.println(Main.storage_of_items[1].name+"     |  "+ epic);
            System.out.println(Main.storage_of_items[2].name+"       |  "+ epic);
        }
        
    }
}