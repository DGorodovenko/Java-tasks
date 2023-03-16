import java.util.Random;

public class Computer extends Board {

  public static void computerMove(char[][] gameBoard) {
    Random rand = new Random();
    int move = rand.nextInt(9) + 1;

    boolean result = isValidMove(move, gameBoard);

    while (!result) {
      move = rand.nextInt(9) + 1;
      result = isValidMove(move, gameBoard);
    }

    System.out.println("Computer moved at position " + move);
    updateBoard(move, 2, gameBoard);
  }
}
