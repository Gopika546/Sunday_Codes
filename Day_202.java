/*
Left Triangle Pattern
Write a program to print the left triangle pattern using stars, given the number of rows in a triangle (The left triangle star pattern is a triangle with a perpendicular line at the left side of the triangle.)
Hint:
•	Use a loop to iterate through each row from 1 to the number of rows.
•	In each iteration of the outer loop, use an inner loop to print stars. The inner loop should run as many times as the current row number.
Sample Input: 5
Sample Output:
*
* *
* * *
* * * *
* * * * *
*/


import java.util.Scanner;
public class Day_202 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        s.close();
    }    
}
