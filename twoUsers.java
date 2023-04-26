package game;
import java.util.Scanner;
public class twoUsers {
    //Needed data types:
    private int firstUserScore;
    private int secondUserScore;
    private String firstUserChoice;
    private String secondUserChoice;
    private String firstUsername;
    private String secondUsername;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Constructor that automatically runs the game:
    public twoUsers(){
        firstUserScore = 0;
        secondUserScore = 0;
        twoUsersPlay();
    }//end of constructor
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void twoUsersPlay(){
        Scanner input = new Scanner(System.in);
        System.out.println("HELLO AND WELCOME TO THE GAME!");
        System.out.print("Enter first player's name: ");
        firstUsername = input.next();
        System.out.print("Enter second player's name: ");
        secondUsername = input.next();
        System.out.printf("%s and %s, are you ready? [yes/no]%n",firstUsername,secondUsername);
        String answer = input.next();
        if((answer.toLowerCase()).equals("yes")){
            System.out.println();
            while(true){
                System.out.print(firstUsername+"'s turn --> ");
                String firstChoice = input.next();
                firstUserChoice = firstChoice.toLowerCase();
                if(!(firstUserChoice.equals("rock")) & !(firstUserChoice.equals("paper")) & !(firstUserChoice.equals("scissors"))){
                    System.out.println("Wrong answer.");
                }else{
                    System.out.print(secondUsername+"'s turn --> ");
                    String secondChoice = input.next();
                    secondUserChoice = secondChoice.toLowerCase();
                    if(!(secondUserChoice.equals("rock")) & !(secondUserChoice.equals("paper")) & !(secondUserChoice.equals("scissors"))){
                        System.out.println("Wrong answer.");
                    }else {
                        System.out.println(firstUsername+"'s choice: "+firstUserChoice+"\t"+secondUsername+"'s choice: "+secondUserChoice);
                        twoUsersCheck(firstUserChoice,secondUserChoice);
                    }
                }
                if(firstUserScore == 5){
                    System.err.println("\n\n---------------------------------\n"+firstUsername+" won!\n---------------------------------");
                    break;
                } else if (secondUserScore == 5) {
                    System.err.println("\n\n---------------------------------\n"+secondUsername+" won!\n---------------------------------");
                    break;
                }
                System.out.println("---------------------------------");
            }
        }else {
            System.out.println("...GOODBYE...");
        }
    }// end of twoUsersPlay
    private void twoUsersCheck(String firstChoice, String secondChoice){
        if(firstChoice.equals("rock") && secondChoice.equals("paper")){
            secondUserScore++;
            System.out.printf("%s's Score: %d\t%s's Score: %d%n",firstUsername,firstUserScore,secondUsername,secondUserScore);
        }else if(firstChoice.equals("rock") && secondChoice.equals("scissors")){
            firstUserScore++;
            System.out.printf("%s's Score: %d\t%s's Score: %d%n",firstUsername,firstUserScore,secondUsername,secondUserScore);
        }if(firstChoice.equals("paper") && secondChoice.equals("rock")){
            firstUserScore++;
            System.out.printf("%s's Score: %d\t%s's Score: %d%n",firstUsername,firstUserScore,secondUsername,secondUserScore);
        }if(firstChoice.equals("paper") && secondChoice.equals("scissors")){
            secondUserScore++;
            System.out.printf("%s's Score: %d\t%s's Score: %d%n",firstUsername,firstUserScore,secondUsername,secondUserScore);
        }if(firstChoice.equals("scissors") && secondChoice.equals("rock")){
            secondUserScore++;
            System.out.printf("%s's Score: %d\t%s's Score: %d%n",firstUsername,firstUserScore,secondUsername,secondUserScore);
        }if(firstChoice.equals("scissors") && secondChoice.equals("paper")){
            firstUserScore++;
            System.out.printf("%s's Score: %d\t%s's Score: %d%n",firstUsername,firstUserScore,secondUsername,secondUserScore);
        }if(firstChoice.equals(secondChoice)){
            System.out.printf("Equal...%n%s's Score: %d\t%s's Score:%d%n",firstUsername,firstUserScore,secondUsername,secondUserScore);
        }
    }//end of twoUsersCheck
}