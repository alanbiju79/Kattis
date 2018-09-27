/*There once was a champion of WoW
Arthasdk the name he was bestowed
He Death Gripped you to his side
His Chains of Ice stopped your stride
And Obliterates made you say “OWW!”

But one day our hero got puzzled
His Death Grip totally fizzled
In his darkest despair
He could barely hear
“OMG NOOB u Chains of Iced than u Death Gripped”

Input
You are given a recording of the abilities our hero used in his battles.

The first line of input will contain a single integer n (1≤n≤100), the number of battles our hero played.

Then follow n lines each with a sequence of ki (1≤ki≤1000) characters, each of which are either ’C’, ’D’ or ’O’. These denote the sequence
of abilities used by our hero in the i-th battle. ’C’ is Chains of Ice, ’D’ is Death Grip and ’O’ is Obliterate.

Output
Output the number of battles our hero won, assuming he won each battle where he did not use Chains of Ice immediately followed by Death
Grip.*/



import java.util.Scanner;

public class deathKnightHero{
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String arr[] = new String[n];
        boolean win = true;
        int count =0;

        for(int i=0;i<n;i++){
            arr[i] = scan.next();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length()-1;j++){
                if(arr[i].charAt(j)=='C'&&arr[i].charAt(j+1)=='D'){
                    win=false;
                    count++;
                }
            }
        }
        System.out.println(n-count);
    }
}
