package startJava;
import java.util.Scanner;
//create Guesser class
//has part is guess number
//does part is guess method
//collect the number from guesser 
class Guesser{
	int guessnum;    
	int guessnum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hey guesser enter your number");
		guessnum=sc.nextInt();
		return guessnum ;
}
}

//create a class player
//has and does part
//collect the number from players
class Player{
	int guessNum;
	int guessPlayer(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Hey players enter guessed number");
		guessNum=sc.nextInt();
	    return guessNum;
	}
}

//create a class umpire
//collect the number from guesser method
//collect the number from players
//compare the number guessed with players number
class Umpire{
	int numFrmGueser;
	int numFrmPlayer1;
	int numFrmPlayer2;
	int numFrmPlayer3;
	void collectFrmGuesser(){
		Guesser g=new Guesser();
		numFrmGueser=g.guessnum();
	}
	
	void collectFrmPlayers(){
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		 numFrmPlayer1=p1.guessPlayer();
		 numFrmPlayer2=p2.guessPlayer();
		 numFrmPlayer3=p3.guessPlayer();
	}
	
	void compare() {
         if(numFrmGueser==numFrmPlayer1) {
        	 if(numFrmGueser==numFrmPlayer2 && numFrmGueser==numFrmPlayer3) {
        		 System.out.println("All players won the game");
        	 }
        	 else if(numFrmGueser==numFrmPlayer2) {
        		 System.out.println("Player 1 and Player 2 won");
        	 }
        	 else if(numFrmGueser==numFrmPlayer3) {
        		 System.out.println("Player 1 and Player 3 won");
        	 }
        	 else {
        		 System.out.println("Player 1 won ");
        	 }
        	 
         }
         
         else if(numFrmGueser==numFrmPlayer2) 
         {
        	  if(numFrmGueser==numFrmPlayer3) {
        		 System.out.println("Player 2 and Player 3 won");
        	  }
        	  else {
        	     System.out.println("Player 2 won the game");
                   }
         }
         else if(numFrmGueser==numFrmPlayer3){
        	 System.out.println("Player 3 won the game"); 
         }
         else {
        	 System.out.println("Players not able to guess!");
         }
	}
}

//main method to do actions
public class GuesserGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Umpire u=new Umpire();
         u.collectFrmGuesser();
         u.collectFrmPlayers();
         u.compare();
	}

}
