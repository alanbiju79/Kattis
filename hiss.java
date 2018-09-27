/*A known problem with some microphones is the “hissing s”. That is, sometimes the sound of the letter s is particularly pronounced;
it stands out from the rest of the word in an unpleasant way.

Of particular annoyance are words that contain the letter s twice in a row. Words like amiss, kiss, mississippi and even hiss itself.

Input
The input contains a single string on a single line. This string consists of only lowercase letters (no spaces) and has between 1 and 30
characters.

Output
Output a single line. If the input string contains two consecutive occurrences of the letter s, then output hiss. Otherwise, output no
hiss.*/



import java.util.Scanner;

public class hiss{
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        boolean hiss = false;

        for(int i=0;i<in.length()-1;i++){
            if(in.charAt(i)=='s'&&in.charAt(i+1)=='s')
                hiss = true;
        }

        if(hiss==true)
            System.out.println("hiss");
        else
            System.out.println("no hiss");
    }
}
