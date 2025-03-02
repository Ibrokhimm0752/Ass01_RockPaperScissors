public class main {
    public static void main(String[] args) {
        String player1 = "Player 1";
        String player2 = "Player 2";
        String choiceA = "R";
        String choiceB = "S";
        String playAgain = "Y";
        while (playAgain.equalsIgnoreCase("Y")) {
            String result = "";
            if (choiceA.equalsIgnoreCase("R")) {
                if (choiceB.equalsIgnoreCase("S")) {
                    result = player1 + " wins! Rock breaks Scissors.";
                } else if (choiceB.equalsIgnoreCase("P")) {
                    result = player2 + " wins! Paper covers Rock.";
                } else {
                    result = "It's a tie! Both players chose Rock.";
                }
            } else if (choiceA.equalsIgnoreCase("P")) {
                if (choiceB.equalsIgnoreCase("R")) {
                    result = player1 + " wins! Paper covers Rock.";
                } else if (choiceB.equalsIgnoreCase("S")){
                    result = player2 + " wins! Scissors cuts Paper.";
                } else {
                    result = "It's a tie! Both players chose Paper.";
                }
            } else if (choiceA.equalsIgnoreCase("S")) {
                if (choiceB.equalsIgnoreCase("P")) {
                    result = player1 + " wins! Scissors cuts Paper.";
                } else if (choiceB.equalsIgnoreCase("R")) {
                    result = player2 + " wins! Rock breaks Scissors.";
                } else {
                    result = "It's a tie! Both players chose Scissors.";
                }
            } else {
                System.out.println("Invalid choice for player 1: " + choiceA);
                System.out.println("Please choose R, P, or S.");
                continue;
            }
            if (choiceB.equalsIgnoreCase("R")
                    || choiceB.equalsIgnoreCase("P")
                    || choiceB.equalsIgnoreCase("S")) {
                System.out.println(result);
                System.out.println("Do you want to play again? [Y/N]");
                playAgain = "N";
            } else {
                System.out.println("Invalid choice for player 2: " + choiceB);
                System.out.println("Please choose R, P, or S.");
            }
        }
    }
}