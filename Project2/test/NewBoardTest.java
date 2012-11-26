
import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

/**
 * Tests the function newBoard()
 *
 * Creates the instance game of TicTacToe to be able to access its variables and functions.
 * Goes through each symbol in board[][] and compares it to a calculated value in char.
 * So board[3][3] should look like this :
 *  [1][2][3]
 *  [4][5][6]
 *  [7][8][9]
 */


public class NewBoardTest extends TestCase {
    TicTacToe game = new TicTacToe();

    public void testNewBoard()
    {
        game.newBoard();
        char cvalue;
        int value;

        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                value=(j+1)+(i*3);                      //Calculate the corresponding value
                cvalue = Character.forDigit(value, 10);
                Assert.assertEquals(game.board[i][j],cvalue);
            }

        }

        //random tests

        Assert.assertEquals(game.board[1][1],'5');
        Assert.assertEquals(game.board[2][0],'7');
    }

}


