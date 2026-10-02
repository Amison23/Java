import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_Lab {
    

    public static void main(String[] args) {
        Queue<Integer> player = new LinkedList();
        Scanner nextPlayer = new Scanner(System.in);
        System.out.println("Enter 11 players age: ");

        int n = 11;

        for (int i = 0; i < n; i++) {
            if(n <= 11 ){
                Integer p = nextPlayer.nextInt();
                player.add(p);
            }
        }
        System.out.println("Players are: " + player);
    }
}
