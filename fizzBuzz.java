/*According to Wikipedia, FizzBuzz is a group word game for children to teach them about division. This may or may not be true, but this
question is generally used to torture screen young computer science graduates during programming interviews.
Basically, this is how it works: you print the integers from 1 to N, replacing any of them divisible by X with Fizz or, if they are
divisible by Y, with Buzz. If the number is divisible by both X and Y, you print FizzBuzz instead.

Check the samples for further clarification.

Input
Input file will contain a single test case. Each test case will contain three integers on a single line, X, Y and N (1≤X<Y≤N≤100).

Output
Print integers from 1 to N in order, each on its own line, replacing the ones divisible by X with Fizz, the ones divisible by Y with Buzz
and ones divisible by both X and Y with FizzBuzz.*/



import java.util.Scanner;

public class fizzBuzz{
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int n = scan.nextInt();

        for(int i=1;i<=n;i++){
            if(i%x==0&&i%y==0)
                System.out.println("FizzBuzz");

            else if(i%x==0)
                System.out.println("Fizz");

            else if(i%y==0)
                System.out.println("Buzz");

            else
                System.out.println(i);
        }
    }
}
