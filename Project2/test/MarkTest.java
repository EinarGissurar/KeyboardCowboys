import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

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
}
