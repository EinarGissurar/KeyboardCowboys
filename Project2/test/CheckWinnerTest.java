

import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;


public class CheckWinnerTest extends TestCase {

    TicTacToe game = new TicTacToe();

    public void testCheckWinner()
    {
        //Create a stub with result: DRAW
        game.arr[0][0]='X';
        game.arr[0][1]='O';
        game.arr[0][2]='X';

        game.arr[1][0]='X';
        game.arr[1][1]='O';
        game.arr[1][2]='X';

        game.arr[2][0]='O';
        game.arr[2][1]='X';
        game.arr[2][2]='O';

        Assert.assertEquals(0,game.checkWinner());

        game.newBoard();
        //Create a stub with result: Player 2 wins

        game.arr[0][0]='O';
        game.arr[0][1]='X';
        game.arr[0][2]='X';

        game.arr[1][0]='X';
        game.arr[1][1]='O';
        game.arr[1][2]='X';

        game.arr[2][0]='X';
        game.arr[2][1]='X';
        game.arr[2][2]='O';

        Assert.assertEquals(2,game.checkWinner());
        game.newBoard();

        //create a stub with result: Player 1 wins

        game.arr[0][0]='O';
        game.arr[0][1]='X';
        game.arr[0][2]='X';

        game.arr[1][0]='X';
        game.arr[1][1]='O';
        game.arr[1][2]='X';

        game.arr[2][0]='X';
        game.arr[2][1]='O';
        game.arr[2][2]='X';

        Assert.assertEquals(1,game.checkWinner());
        game.newBoard();

        //Create stub with result: Player 1 wins

        game.arr[0][2]='X';
        game.arr[1][2]='X';
        game.arr[2][2]='X';

        Assert.assertEquals(1,game.checkWinner());




    }

}
