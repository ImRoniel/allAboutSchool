package FriendsManager;

import com.sun.source.doctree.EscapeTree;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Scanner;
public class FriendsManager {
//    initialize private arraylist for storing name.
    private ArrayList<String> friendsName = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);


//    a method for adding friends
    public void addFriends(){
        System.out.println("How many Friends to add?");
        int ma = sc.nextInt();
        for (int i = 0; i < ma; i++){
            System.out.println((i + 1) + ". Enter a Friends:");
            friendsName.add(sc.nextLine().trim());
        }
    }
// amethod for viewing friends
    public void viewFriends(){
        for (String each: friendsName){
            System.out.println( "\uD83D\uDC4B" + each);
        }
        System.out.println("Friends View...");
    }

//    a method for searching friends
    public void searchFriends(){
        System.out.println("Enter a Namee to Search:");
        String search = sc.nextLine().trim();
        if (friendsName.contains(search)){
            System.out.println(search + "Is your Friends:");
        }else {
            System.out.println(search + "is not Your Friends");
        }
    }

//    a method for removing friends
    public void removeFriends(){
        System.out.println("Enter a Name to Remove:");
        String remove = sc.nextLine().trim();

        if (friendsName.contains(remove)){
            friendsName.remove(remove);
            System.out.println(remove + "Fake Friends is Remove:");
        } else {
            System.out.println(remove + "This isn't on the List you Dumbasss");
        }
    }
}
