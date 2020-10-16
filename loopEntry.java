/**
 * loopEntry
 */

import java.util.ArrayList;
import java.util.Scanner;

public class loopEntry {

    public ArrayList<Integer> list;
    public Scanner scanner;

    public loopEntry(){
        this.scanner = new Scanner(System.in);
        this.list = new ArrayList<Integer>();
    }

    public void fillList(){
        for (int i = 0; i < 5; i ++){
            System.out.println("Enter a number");
            this.list.add(scanner.nextInt());
        }
    }

    public void calculations(){
        int total = 0;
        for (int i = 0; i < 5; i ++){
            total += list.get(i);
        }
        System.out.printf("Sum of numbers is: %d\n", total);
        total = 1;
        for (int i = 0; i < 5; i ++){
            total = total * list.get(i);
        }
        System.out.printf("Product of numbers is: %d\n", total);

        int largest = 0;
        int smallest = 10000000;

        for (int i = 0; i < 5; i++){
            if (list.get(i) > largest){
                largest = list.get(i);
            }
            if (list.get(i) < smallest){
                smallest = list.get(i);
            }
        }
        System.out.printf("Largest number is: %d\nSmallest number is: %d\n", largest, smallest);
    }

    public static void main(String[] args) {
        loopEntry myloop = new loopEntry();
        myloop.fillList();
        myloop.calculations();
    }

    
}