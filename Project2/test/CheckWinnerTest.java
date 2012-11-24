

import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;


public class CheckWinnerTest extends TestCase {

    TicTacToe game = new TicTacToe();

    public void testCheckWinner()
    {
        //X
        game.setMark(1);
        game.setMark(2);
        game.setMark(3);

        Assert.assertEquals(1,game.checkWinner());

        game.printBoard();

        game.newBoard();

        game.printBoard();

        game.setMark(1);
        game.setMark(5);
        game.setMark(9);

        Assert.assertEquals(1,game.checkWinner());

        game.newBoard();

        game.setMark(2);
        game.setMark(5);
        game.setMark(8);

        game.newBoard();

        //1,3,5,7,8 vs. 2,4,6,9
        game.setMark(1);
        game.setMark(3);
        game.setMark(5);
        game.setMark(7);
        game.setMark(8);

        game.switchPlayer();

        game.setMark(2);
        game.setMark(4);
        game.setMark(6);
        game.setMark(9);

        game.printBoard();

        game.checkWinner();
        Assert.assertEquals(1,game.checkWinner());

        game.newBoard();

        // 1,3,5,8 vs. 2,4,6,7,9
        game.setMark(1);
        game.setMark(3);
        game.setMark(5);
        game.setMark(8);

        game.switchPlayer();

        game.setMark(2);
        game.setMark(4);
        game.setMark(6);
        game.setMark(7);
        game.setMark(9);

        game.checkWinner();
        game.printBoard();




    }

}
