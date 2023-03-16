public class Player extends Board {

  public static void playerMove(char[][] gameBoard) {
    System.out.println("Please make a move. (1-9)");

    int move = input.nextInt();

    boolean result = isValidMove(move, gameBoard);

    while (!result) {
      System.out.println("Sorry! Invalid Move. Try again");
      move = input.nextInt();
      result = isValidMove(move, gameBoard);
    }

    System.out.println("Player moved at position " + move);
    updateBoard(move, 1, gameBoard);
  }
}
