/*Mirko has a younger brother, Filip, who just started going to school and is having trouble with numbers. To help him get the hang for
number scale, his teacher writes two three-digit numbers. She asks Filip to compare those numbers, but instead of interpreting them with
the leftmost most significant digit, he needs to interpret them the other way around, with the most significant digit being the rightmost
one. He than has to tell the teacher the larger of the two numbers.

Write a program that will check Filip’s answers.

Input
The first and only line of input contains two three-digit numbers, A and B. A and B will not be equal and will not contain any zeroes.

Output
The first and only line of output should contain the larger of the numbers in the input, compared as described in the task. The number
should be written reversed, to display to Filip how he should read it.*/



import java.util.Scanner;

public class filip{
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String rev1 = "";
        String rev2 = "";

        String c = Integer.toString(a);
        String d = Integer.toString(b);

        for(int i=c.length()-1;i>=0;i--){
            rev1 += c.charAt(i);
        }

        for(int i=d.length()-1;i>=0;i--){
            rev2 += d.charAt(i);
        }

        a = Integer.parseInt(rev1);
        b = Integer.parseInt(rev2);

        if(a<b)
            System.out.println(b);

        else
            System.out.print(a);
    }
}
