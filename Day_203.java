/*
Right Triangle Pattern
Write a program to print the right triangle pattern using stars, given the number of rows in a triangle (The left triangle star 
pattern is a triangle with a perpendicular line at the left side of the triangle.)
Hint:
•	Outer Loop: Loop from 1 to the number of rows for each row of the triangle.
•	Space Printing: Before printing stars, loop to print spaces. The number of spaces should decrease with each row.
•	Star Printing: After the spaces, print stars equal to the current row number.
Sample Input: 5
Sample Output:
            *
         * *
      * * *
   * * * *
* * * * *

*/


import java.util.Scanner;
public class Day_203 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
