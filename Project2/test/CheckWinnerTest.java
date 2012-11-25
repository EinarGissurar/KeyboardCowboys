

import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

/**
 * Made to test the function checkWinner()
 *
 * Creates stubs with different end results (player 1 wins, player 2 wins, draw)
 * and checks if the result from checkWinner corresponds to those results usinng junit - assert.
 * The test is dependent on newBoard for a default setup of the board.
 *
 */

public class CheckWinnerTest extends TestCase {

    TicTacToe game = new TicTacToe();

    public void testCheckWinner()
    {
        game.newBoard();

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

        game.newBoard();
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
        game.newBoard();

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
        game.newBoard();

        //Create stub with result: Player 1 wins

        game.board[0][2]='X';
        game.board[1][2]='X';
        game.board[2][2]='X';

        Assert.assertEquals(1,game.checkWinner());




    }

}
