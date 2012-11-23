import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

public class MarkTest extends TestCase
{
    TicTacToe game = new TicTacToe();

    public void testGetMark()
    {
        game.arr[2][2] = 'O';   //Field 9
        game.arr[1][1] = 'O';   //Field 5
        game.arr[1][2] = 'X';   //Field 6
        game.arr[0][0] = 'X';   //Field 1

        Assert.assertEquals('O',game.GetMark(9));
        Assert.assertEquals('O',game.GetMark(5));
        Assert.assertEquals('X',game.GetMark(6));
        Assert.assertEquals('X',game.GetMark(1));
    }
}
