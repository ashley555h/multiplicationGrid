import static java.lang.System.out;
import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        int tableSize;
        System.out.print("How big would you like the table? ");
        tableSize = keyboard.nextInt();
        if (tableSize > 20) {
            System.out.println("Invalid");
        } else {
            printMultiplicationTable(tableSize);
        }
    }

    public static void printMultiplicationTable(int tableSize) {
        System.out.format("    ");
        for(int i = 0; i<=tableSize; i++) {
            System.out.format("%4d",i);
        }
        System.out.println();
        for(int i = 0; i <= tableSize; i++) {
            System.out.format("%4d",i);
            for(int j = 0;j <= tableSize; j++) {
                System.out.format("%4d",i*j);
            }
            System.out.println(); 
        }
    }
}
