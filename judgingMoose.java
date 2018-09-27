/*When determining the age of a bull moose, the number of tines (sharp points), extending from the main antlers, can be used. An older
bull moose tends to have more tines than a younger moose. However, just counting the number of tines can be misleading, as a moose can
break off the tines, for example when fighting with other moose. Therefore, a point system is used when describing the antlers of a bull
moose.
The point system works like this: If the number of tines on the left side and the right side match, the moose is said to have the even
sum of the number of points. So, “an even 6-point moose”, would have three tines on each side. If the moose has a different number of tines
on the left and right side, the moose is said to have twice the highest number of tines, but it is odd. So “an odd 10-point moose” would
have 5 tines on one side, and 4 or less tines on the other side.

Can you figure out how many points a moose has, given the number of tines on the left and right side?

Input
The input contains a single line with two integers ℓ and r, where 0≤ℓ≤20 is the number of tines on the left, and 0≤r≤20 is the number of
tines on the right.

Output
Output a single line describing the moose. For even pointed moose, output “Even x” where x is the points of the moose. For odd pointed
moose, output “Odd x” where x is the points of the moose. If the moose has no tines, output “Not a moose”*/



import java.util.Scanner;

public class judgingMoose{
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        int num[] = new int[2];

        for(int i=0; i<2; i++){
            num[i] = scan.nextInt();
        }

        if(num[0]==0&&num[1]==0)
            System.out.println("Not a moose");

        else if(num[0]==num[1])
            System.out.println("Even "+num[0]*2);

        else if(num[0]<num[1])
            System.out.println("Odd "+num[1]*2);

        else
            System.out.println("Odd "+num[0]*2);
    }
}
