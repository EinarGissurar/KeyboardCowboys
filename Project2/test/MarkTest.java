import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;


/**
 * Tests getMark() and setMark().
 *
 * Creates the instance game of TicTacToe to be able to access its variables and functions.
 * TestGetMark hard-codes symbols into game's variable board and then uses assert to compare
 * the value from getMark to the true value.
 * Dependent on function: does not depend on other functions from TicTacToe
 *
 * TestSetMark uses setMark to insert symbols into game's board and then applies assert to
 * compare the inserted values to the true values. It also checks to see if setMark overwrites
 * (which it shouldn't) a already marked field. The test depends on the functions newBoard() and switchPlayer()
 * Dependent on function: newBoard
 */

public class MarkTest extends TestCase
{
    TicTacToe game = new TicTacToe();

    public void testGetMark()
    {

        game.board[2][2] = 'O';   //Field 9
        game.board[1][1] = 'O';   //Field 5
        game.board[1][2] = 'X';   //Field 6
        game.board[0][0] = 'X';   //Field 1

        Assert.assertEquals('O',game.getMark(9));
        Assert.assertEquals('O',game.getMark(5));
        Assert.assertEquals('X',game.getMark(6));
        Assert.assertEquals('X',game.getMark(1));
    }

    public void testSetMark()
    {
        game.newBoard();

        game.setMark(5);
        game.setMark(8);

        //Switch the players
        game.player1=false;
        game.player2=true;

        game.setMark(9);
        //Test to see if it accidentally overwrites
        game.setMark(5);
        game.setMark(8);

        Assert.assertEquals('X', game.board[1][1]);
        Assert.assertEquals('X',game.board[2][1]);
        Assert.assertEquals('O',game.board[2][2]);

        game.printBoard();


    }
}
