/*Mirko has found an old chessboard and a set of pieces in his attic. Unfortunately, the set contains only white pieces, and apparently an
incorrect number of them. A set of pieces should contain:

One king
One queen
Two rooks
Two bishops
Two knights
Eight pawns

Mirko would like to know how many pieces of each type he should add or remove to make a valid set.

Input
The input consists of 6 integers on a single line, each between 0 and 10 (inclusive). The numbers are, in order, the numbers of kings,
queens, rooks, bishops, knights and pawns in the set Mirko found.

Output
Output should consist of 6 integers on a single line; the number of pieces of each type Mirko should add or remove. If a number is
positive, Mirko needs to add that many pieces. If a number is negative, Mirko needs to remove pieces.*/



import java.util.Scanner;

public class bijele{
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        int num[] = new int[6];

        for(int i=0; i<6; i++){
            num[i] = scan.nextInt();
        }

        int kings = 1-num[0];
        int queens = 1-num[1];
        int rooks = 2-num[2];
        int bishops = 2-num[3];
        int knights = 2-num[4];
        int pawns = 8-num[5];

        System.out.println(kings+" "+queens+" "+rooks+" "+bishops+" "+knights+" "+pawns);
    }
}
