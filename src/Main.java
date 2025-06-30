import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String playA = "";
    String playB = "";
    String trash = "";
    String playAgain = "";
    boolean done = false;
    do {
        do {
            System.out.print("Enter a move for player A [RPS]: ");
            playA = in.nextLine();
            System.out.print("Enter a move for player B [RPS]: ");
            playB = in.nextLine();
            if(playA.equalsIgnoreCase("R"))
            {
                if(playB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock vs Rock, it's a Tie!");
                    done = true;
                }
                else if(playB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers Rock, Player B wins.");
                    done = true;
                }
                else if(playB.equalsIgnoreCase("S"))
                {
                    System.out.println("Rock breaks Scissors, Player A wins.");
                    done = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println(trash + " is not a valid move. Please try again.");
                }
            }
            else if(playA.equalsIgnoreCase("P"))
            {
                    if(playB.equalsIgnoreCase("R"))
                    {
                        System.out.println("Paper covers Rock, Player A wins.");
                        done = true;
                    }
                    else if(playB.equalsIgnoreCase("P"))
                    {
                        System.out.println("Paper vs Paper, it's a Tie!");
                        done = true;
                    }
                    else if(playB.equalsIgnoreCase("S"))
                    {
                        System.out.println("Scissors cuts Paper, Player B wins.");
                        done = true;
                    }
                    else
                    {
                        trash = in.nextLine();
                        System.out.println(trash + " is not a valid move. Please try again.");
                    }
            }
            else if(playA.equalsIgnoreCase("S")) //playA is Scissors
            {
                    if(playB.equalsIgnoreCase("R"))
                    {
                        System.out.println("Rock breaks Scissors, Player B wins.");
                        done = true;
                    }
                    else if(playB.equalsIgnoreCase("P"))
                    {
                        System.out.println("Scissors cuts Paper, Player A wins.");
                        done = true;
                    }
                    else if(playB.equalsIgnoreCase("S"))
                    {
                        System.out.println("Scissors vs Scissors, it's a Tie!");
                        done = true;
                    }
                    else
                    {
                        trash = in.nextLine();
                        System.out.println(trash + " is not a valid move. Please try again.");
                    }
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid move. Please try again.");
            }
        }while(!done);
        done = false;
        System.out.print("Do you want to play again? [YN] ");
        if(playAgain.equalsIgnoreCase("Y"))
        {
            done = false;
        }
        else if(playAgain.equalsIgnoreCase("N"))
        {
            done = true;
        }
        else
        {

        }
    }while(!done);
    }

