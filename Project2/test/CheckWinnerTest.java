

import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

/**
 * Tests the function checkWinner()
 *
 * Creates stubs with different end results (player 1 wins, player 2 wins, draw)
 * and checks if the result from checkWinner corresponds to those results usinng junit - assert.
 * Dependent on function: does not depend on other functions from TicTacToe
 *
 */

public class CheckWinnerTest extends TestCase {

    TicTacToe game = new TicTacToe();

    public void testDraw()
    {

        //Create a stub with result: DRAW
        game.board[0][0]='X';
        game.board[0][1]='O';
        game.board[0][2]='X';

        game.board[1][0]='X';
        game.board[1][1]='O';
        game.board[1][2]='X';

        game.board[2][0]='O';
        game.board[2][1]='X';
        game.board[2][2]='O';

        Assert.assertEquals(0,game.checkWinner());

    }
    public void testPlayer2Wins()
    {
        //Create a stub with result: Player 2 wins

        game.board[0][0]='O';
        game.board[0][1]='X';
        game.board[0][2]='X';

        game.board[1][0]='X';
        game.board[1][1]='O';
        game.board[1][2]='X';

        game.board[2][0]='X';
        game.board[2][1]='X';
        game.board[2][2]='O';

        Assert.assertEquals(2,game.checkWinner());

    }
    public void testPlayer1Wins()
    {
        //create a stub with result: Player 1 wins

        game.board[0][0]='O';
        game.board[0][1]='X';
        game.board[0][2]='X';

        game.board[1][0]='X';
        game.board[1][1]='O';
        game.board[1][2]='X';

        game.board[2][0]='X';
        game.board[2][1]='O';
        game.board[2][2]='X';

        Assert.assertEquals(1,game.checkWinner());


        //Create stub with result: Player 1 wins

        game.board[0][0]='O';
        game.board[0][1]='O';
        game.board[0][2]='X';

        game.board[1][0]='X';
        game.board[1][1]='X';
        game.board[1][2]='X';

        game.board[2][0]='O';
        game.board[2][1]='O';
        game.board[2][2]='X';

        Assert.assertEquals(1,game.checkWinner());


    }

}
