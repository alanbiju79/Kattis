/*You are attempting to climb up the roof to fix some leaks, and have to go buy a ladder. The ladder needs to reach to the top of the wall,
which is h centimeters high, and in order to be steady enough for you to climb it, the ladder can be at an angle of at most v degrees from
the ground. How long does the ladder have to be?

Input
The input consists of a single line containing two integers h and v, with meanings as described above. You may assume that 1≤h≤10000 and
that 1≤v≤89.

Output
Write a single line containing the minimum possible length of the ladder in centimeters, rounded up to the nearest integer.*/



import java.util.Scanner;

public class ladder{
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int v = scan.nextInt();

        int ladder = (int)Math.ceil((h*Math.sin(Math.toRadians(90)))/(Math.sin(Math.toRadians(v))));
        System.out.println(ladder);
    }
}
