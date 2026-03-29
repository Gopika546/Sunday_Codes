/* 
Square Pattern with specific Arrangement - I
Write a program to print a square pattern made of asterisks (∗) of size n with a specific arrangement. The pattern should consist of asterisks in the first two columns and the first and last rows, while the remaining positions in the square should be filled with spaces.
Sample Input: n = 4
Sample Output: 
* * * *
* *    
* *    
* * * *	

*/


import java.util.Scanner;
public class SquarePattern 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(j == 0 || j == 1 || i == 0 || i == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }    
}
