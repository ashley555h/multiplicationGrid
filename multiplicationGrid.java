import static java.lang.System.out;
import java.util.Scanner;

public class multiplicationGrid
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int sizeOfTable;

        out.println("Welcome to Multiplication Tables");
        out.println("");
        out.println("How large would you like to see them?");
        sizeOfTable = keyboard.nextInt();

        for (int a = 0; a <= sizeOfTable; a++)
        {
            for (int b = 0; b <= sizeOfTable; b++)
            {
                System.out.print((a*b) + "\t");
            }
            System.out.println();
        }
    }


}