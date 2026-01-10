import java.util.Scanner;
import java.util.Random;

public class Main{
    

    //menu player see when the game starts
    static int menu(Scanner scan){
        System.out.println("PERCENTAGE SPIN");
        System.out.println("1.) SPIN ");
        System.out.println("2.) STORAGE");
        int menu_number_picked_by_player = scan.nextInt();
        return menu_number_picked_by_player;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = menu(scan);
        System.out.println(num);
    }
}