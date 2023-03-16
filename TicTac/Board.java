public class Board extends TicTac {

  public static void printBoard(char[][] gameBoard) {
    for (char[] row : gameBoard) {
      for (char c : row) {
        System.out.print(c);
      }
      System.out.println();
    }
  }

  public static void updateBoard(int position, int player, char[][] gameBoard) {
    char character = (player == 1) ? 'X' : 'O';

    switch (position) {
      case 1:
        gameBoard[0][0] = character;
        printBoard(gameBoard);
        break;
      case 2:
        gameBoard[0][2] = character;
        printBoard(gameBoard);
        break;
      case 3:
        gameBoard[0][4] = character;
        printBoard(gameBoard);
        break;
      case 4:
        gameBoard[1][0] = character;
        printBoard(gameBoard);
        break;
      case 5:
        gameBoard[1][2] = character;
        printBoard(gameBoard);
        break;
      case 6:
        gameBoard[1][4] = character;
        printBoard(gameBoard);
        break;
      case 7:
        gameBoard[2][0] = character;
        printBoard(gameBoard);
        break;
      case 8:
        gameBoard[2][2] = character;
        printBoard(gameBoard);
        break;
      case 9:
        gameBoard[2][4] = character;
        printBoard(gameBoard);
        break;
      default:
        break;
    }
  }

  public static void resetBoard(char[][] gameBoard) {
    for (int row = 0; row < gameBoard.length; row++) {
      for (int col = 0; col < gameBoard[row].length; col++) {
        if ((row == 2) && (col % 2 == 0)) {
          gameBoard[row][col] = ' ';
        } else {
          gameBoard[row][col] = '_';
        }
      }
    }
  }
}
