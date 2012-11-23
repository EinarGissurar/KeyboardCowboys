
import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;



public class DefaultConstructorTest extends TestCase{

    TicTacToe game = new TicTacToe();

    public void testMatrix()
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


        Assert.assertEquals(game.arr[1][1],'5');
        Assert.assertEquals(game.arr[2][0],'7');
    }

}
