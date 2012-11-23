/**
 * Created with IntelliJ IDEA.
 * User: Lenvoo
 * Date: 23.11.2012
 * Time: 22:56
 * To change this template use File | Settings | File Templates.
 */

import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

public class NewBoardTest extends TestCase {

    TicTacToe game = new TicTacToe();

    public void testNewBoard()
    {
        char cntr='1';
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                Assert.assertEquals(game.arr[i][j],cntr);
                cntr++;
            }

        }


        //random tests
        Assert.assertEquals(game.arr[1][2],'6');
        Assert.assertEquals(game.arr[2][1],'8');

    }


}
