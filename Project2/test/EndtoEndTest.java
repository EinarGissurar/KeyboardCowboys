import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

/**
 *Tests several different functions together
 *
 * Creates the instance game of TicTacToe to be able to access its variables and functions.
 * Simulates a game of TicTacToe by using its most important functions (see dependent functions below),
 * by running setMark, switchPlayer, checkWinner in a loop until --> Winner or draw.
 * It covers the following scenarios; player1 wins, player2 wins, a player wins with the board not full,
 * player wins with a full board (in last move). The victories are of three kinds vertical,
 * horizontal and diagonal.
 * Dependent on function: newBoard, setMark, switchPlayer, checkWinner
 *
 */

public class EndtoEndTest extends TestCase {
    TicTacToe game = new TicTacToe();


    //Extended test
    public void testPlayer1Wins()
    {
        game.newBoard();
        //horizontal, board not full
        game.setMark(1);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(4);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(2);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(5);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(3);

        Assert.assertEquals(1,game.checkWinner());

        game.printBoard();

        game.newBoard();     //start a new game

        //diagonal, board not full
        game.setMark(1);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(2);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(5);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(3);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(9);

        Assert.assertEquals(1,game.checkWinner());

        //Player 1 wins, (X)

        game.newBoard();       //start a new game

        //vertical, board not full
        game.setMark(2);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(9);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(7);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(5);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(1);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(8);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(4);

        game.printBoard();
        Assert.assertEquals(1,game.checkWinner());

        game.newBoard();       //start a new game

        //Diagonal    WINS in last move
        //1,3,5,7,8 vs. 2,4,6,9
        game.setMark(1);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(2);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(3);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(4);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(5);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(6);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(8);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(9);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(7);

        Assert.assertEquals(1,game.checkWinner());
    }

    public void testDraw()
    {
        game.newBoard();

        //DRAW
        //2,4,6,7,9  vs. 1,3,5,8
        game.setMark(2);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(1);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(4);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(3);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(6);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(5);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(7);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(8);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(9);



        game.printBoard();
        Assert.assertEquals(game.checkWinner(),0);

    }
    public void testPlayer2Wins()
    {
        game.newBoard();
         //player 2 wins with board not full
        game.setMark(4);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(3);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(5);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(6);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(8);
        Assert.assertEquals(-1,game.checkWinner());
        game.switchPlayer();
        game.setMark(9);

        game.printBoard();
        Assert.assertEquals(2,game.checkWinner());
    }
}
