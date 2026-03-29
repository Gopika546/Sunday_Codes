/* 

Inverted Left Triangle Pattern
Write a program to print the inverted left triangle pattern using stars, given the number of rows in a triangle(The left triangle star pattern is a triangle with a perpendicular line at the left side of the triangle.)
Hint:
•	Outer Loop: Start from the total number of rows and decrease to 1.
•	Inner Loop: For each iteration of the outer loop, print stars equal to the current row number.
Sample Input: 5
Sample Output:
* * * * *
* * * *
* * *
* * 
* 


*/





import java.util.Scanner;
public class InvertedLeftTriangle
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        for(int i = n; i >= 1; i--)
        {
            for(int j = 1; j <= n - 1; j++)
                System.out.print(" ");
            for(int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
        
    }
}