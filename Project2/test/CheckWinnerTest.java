

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

        game.printBoard();

        game.newBoard();

        game.printBoard();

        game.setMark(1,'O');
        game.setMark(5,'O');
        game.setMark(9,'O');

        game.newBoard();

        game.setMark(2,'X');
        game.setMark(5,'X');
        game.setMark(8,'X');

        game.newBoard();

        game.setMark(1,'X');
        game.setMark(2,'O');
        game.setMark(3,'X');

        game.setMark(4,'O');
        game.setMark(5,'X');
        game.setMark(6,'O');

        game.setMark(7,'X');
        game.setMark(8,'X');
        game.setMark(9,'O');

        game.printBoard();

        game.checkWinner();
        Assert.assertEquals(1,game.checkWinner());

        game.newBoard();

        game.setMark(1,'X');
        game.setMark(2,'O');
        game.setMark(3,'X');

        game.setMark(4,'O');
        game.setMark(5,'X');
        game.setMark(6,'O');

        game.setMark(7,'O');
        game.setMark(8,'X');
        game.setMark(9,'O');

        game.checkWinner();
        game.printBoard();




    }



}
