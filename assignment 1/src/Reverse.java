import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

/**
 * main - Reverse Numbers when user enter it.
 * @{Scanner}: sc object from it, it makes user to input.
 * Return: Reverse array.
 * */
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter n: ");
        int n = sc.nextInt();
        int numbers [] = new int[n];

        for (int i = 0; i < n ; i++)
        {
            System.out.println("Please Enter number "+(i+1));
            numbers[i] = sc.nextInt();
        }
        // Reverse array
        for (int j = n ; j > 0 ;j--)
        {
            System.out.println(" "+numbers[j-1]);
        }

    }

}
