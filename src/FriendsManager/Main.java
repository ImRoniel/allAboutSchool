package FriendsManager;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        FriendsManager myObj = new FriendsManager();





        int choice;
        do {
            System.out.println("=== FRIENDS MANAGER ===");
            System.out.println("1. Add Friends:");
            System.out.println("2. View Friends:");
            System.out.println("3. Search for Friends:");
            System.out.println("4. Remove for Friends:");
            System.out.println("5. Exit:");
            System.out.println("Choose 1 Option:");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    myObj.addFriends();
                    break;
                case 2:
                    myObj.viewFriends();
                    break;
                case 3:
                    myObj.searchFriends();
                    break;
                case 4:
                    myObj.removeFriends();
                    break;
                case 5:
                    System.out.println("Exiting... GoodBye");
                    break;
                default:
                    System.out.println("INvalid");
            }
        }while (choice != 5);


    }
}
