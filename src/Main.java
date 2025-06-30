import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String playA = "";
    String playB = "";
    String trash = "";
    boolean done = false;
    do {
        if(playA.equalsIgnoreCase("R"))
        {
            if(playB.equalsIgnoreCase("R"))
            {
                System.out.println("Its a tie R X R");
            }
            else if(playB.equalsIgnoreCase("P"))
            {
                System.out.println("Paper covers Rock Player B wins");
            }
            else //playB is Scissors
            {
                System.out.println("Rock breaks Scissors Player A wins");
            }
        }
        else if(playA.equalsIgnoreCase("P"))
        {

        }
        else //playA is Scissors
        {

        }
    }while(!done);

    }
    }

