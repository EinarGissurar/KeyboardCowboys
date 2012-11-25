
import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

public class SetMarkTest extends TestCase {
    TicTacToe game = new TicTacToe();
    public void testSetMark()
    {
        game.newBoard();

        game.setMark(5);
        game.switchPlayer();
        game.setMark(8);
        game.switchPlayer();

        //Test to see if it accidentally overwrites
        game.setMark(5);
        game.setMark(8);

        Assert.assertEquals('X', game.board[1][1]);
        Assert.assertEquals('O',game.board[2][1]);

        game.printBoard();

        game.newBoard();
        game.printBoard();
    }


}
