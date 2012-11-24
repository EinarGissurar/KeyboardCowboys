
import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

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


