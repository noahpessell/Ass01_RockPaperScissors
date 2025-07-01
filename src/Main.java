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
                System.out.print("Enter a move for Player A [RPS]: ");
                playA = in.nextLine();
                if (playA.equalsIgnoreCase("R")) {
                    do {
                        System.out.print("Enter a move for Player B [RPS]: ");
                        playB = in.nextLine();
                        if (playB.equalsIgnoreCase("R")) {
                            System.out.println("Rock vs Rock, it's a Tie!");
                            done = true;
                        } else if (playB.equalsIgnoreCase("P")) {
                            System.out.println("Paper covers Rock, Player B wins.");
                            done = true;
                        } else if (playB.equalsIgnoreCase("S")) {
                            System.out.println("Rock breaks Scissors, Player A wins.");
                            done = true;
                        } else {
                            trash = playB;
                            System.out.println(trash + " is not a valid move. Please try again.");
                        }
                    } while(!done);
                } else if (playA.equalsIgnoreCase("P")) {
                    do {
                        System.out.print("Enter a move for Player B [RPS]: ");
                        playB = in.nextLine();
                        if (playB.equalsIgnoreCase("R")) {
                            System.out.println("Paper covers Rock, Player A wins.");
                            done = true;
                        } else if (playB.equalsIgnoreCase("P")) {
                            System.out.println("Paper vs Paper, it's a Tie!");
                            done = true;
                        } else if (playB.equalsIgnoreCase("S")) {
                            System.out.println("Scissors cuts Paper, Player B wins.");
                            done = true;
                        } else {
                            trash = playB;
                            System.out.println(trash + " is not a valid move. Please try again.");
                        }
                    } while(!done);
                } else if (playA.equalsIgnoreCase("S")) //playA is Scissors
                {
                    do {
                        System.out.print("Enter a move for Player B [RPS]: ");
                        playB = in.nextLine();
                        if (playB.equalsIgnoreCase("R")) {
                            System.out.println("Rock breaks Scissors, Player B wins.");
                            done = true;
                        } else if (playB.equalsIgnoreCase("P")) {
                            System.out.println("Scissors cuts Paper, Player A wins.");
                            done = true;
                        } else if (playB.equalsIgnoreCase("S")) {
                            System.out.println("Scissors vs Scissors, it's a Tie!");
                            done = true;
                        } else {
                            trash = playB;
                            System.out.println(trash + " is not a valid move. Please try again.");
                        }
                } while(!done);
                }
                else {
                    trash = playA;
                    System.out.println(trash + " is not a valid move. Please try again.");
                }
            } while(!done);
            System.out.print("Do you want to play again? [YN] ");
            playAgain = in.nextLine();
            if (playAgain.equalsIgnoreCase("Y")) {
                done = false;
            } else if (playAgain.equalsIgnoreCase("N")) {
                System.out.println("Thanks for playing!");
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid response.");
            }
        } while(!done);
    }
}

