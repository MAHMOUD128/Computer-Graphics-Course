import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
/**
 * isPrime - this function to check if the number is Prime number or not and return true or false.
 * main - to make user enter start and the end number.
 * @{Scanner}: sc object from it, it makes user to input.
 * Return: all Prime Numbers.
 * */
public class PrimeNumbers
{
    //function to return bool result if number is prime or not
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Start Number: ");
        int start = sc.nextInt();

        System.out.println("Please Enter End Number: ");
        int end = sc.nextInt();

        for (int i = start ; i <= end ; i++)
        {
            if (isPrime(i))
            {
                System.out.println(i+" ");
            }
        }



    }

}
