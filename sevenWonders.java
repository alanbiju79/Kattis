/*Seven Wonders is a card drafting game in which players build structures to earn points. The player who ends with the most points wins.
One winning strategy is to focus on building scientific structures. There are three types of scientific structure cards: Tablet (‘T’),
Compass (‘C’), and Gear (‘G’). For each type of cards, a player earns a number of points that is equal to the squared number of that type
of cards played. Additionally, for each set of three different scientific cards, a player scores 7 points.
For example, if a player plays 3 Tablet cards, 2 Compass cards and 1 Gear card, she gets 32+22+12+7=21 points.

It might be tedious to calculate how many scientific points a player gets by the end of each game. Therefore, you are here to help write
a program for the calculation to save everyone’s time.

Input
The input has a single string with no more than 50 characters. The string contains only letters ‘T’, ‘C’ or ‘G’, which denote the
scientific cards a player has played in a Seven Wonders game.

Output
Output the number of scientific points the player earns.*/



import java.util.Scanner;

public class sevenWonders{
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        int t = 0;
        int g = 0;
        int c = 0;
        int set = 0;
        int ans = 0;

        for(int i=0;i<in.length();i++){
            if(in.charAt(i)=='T')
                t++;

            if(in.charAt(i)=='G')
                g++;

            if(in.charAt(i)=='C')
                c++;
        }

        for(int i=0;i<t;i++){
            if(t>i&&g>i&&c>i){
                set++;
            }
        }

        ans = (int)Math.pow(t,2)+(int)Math.pow(g,2)+(int)Math.pow(c,2)+(7*set);
        System.out.println(ans);
    }
}
