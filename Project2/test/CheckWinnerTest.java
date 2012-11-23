/**
 * Created with IntelliJ IDEA.
 * User: Lenvoo
 * Date: 23.11.2012
 * Time: 21:19
 * To change this template use File | Settings | File Templates.
 */

import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;


public class CheckWinnerTest extends TestCase {

    TicTacToe game = new TicTacToe();

    public void testCheckWinner()
    {
        game.setMark(1,'X');
        game.setMark(2,'X');
        game.setMark(3,'X');

        Assert.assertEquals(1,game.checkWinner());

        game.newBoard();

        game.setMark(1,'O');
        game.setMark(5,'O');
        game.setMark(9,'O');

        game.newBoard();

        game.setMark(2,'X');
        game.setMark(5,'X');
        game.setMark(8,'X');


    }



}
