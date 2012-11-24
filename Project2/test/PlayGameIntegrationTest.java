import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

public class PlayGameIntegrationTest extends TestCase {
    TicTacToe game = new TicTacToe();


    //Focus integration test
    public void testFunctional()
    {
        //Player 1 WINS (X)
        game.setMark(1);
        game.setMark(2);
        game.setMark(3);

        Assert.assertEquals(1,game.checkWinner());

        game.printBoard();

        game.newBoard();

        game.printBoard();

        //Player 1 wins, (X)

        game.setMark(1);
        game.setMark(5);
        game.setMark(9);

        Assert.assertEquals(1,game.checkWinner());

        //Player 1 wins, (X)

        game.newBoard();

        game.setMark(2);
        game.setMark(5);
        game.setMark(8);

        Assert.assertEquals(1,game.checkWinner());

        game.newBoard();

        //Player 1 wins (X)
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

        game.switchPlayer();  //Return to default
        game.printBoard();

        Assert.assertEquals(1,game.checkWinner());

        game.newBoard();

        //DRAW
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


        game.printBoard();
        Assert.assertEquals(game.checkWinner(),0);

        game.newBoard();
        //Player 2 wins (O)
        game.setMark(3);
        game.setMark(6);
        game.setMark(9);

        game.printBoard();
        Assert.assertEquals(2,game.checkWinner());
    }
}
