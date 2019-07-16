import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class MathTests {

    @Test
    public void add_two_plus_two_returns_four(){
        //given
        final int expected = 4;

        //when
        final int actual = Math.add(2,2);

        //then
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void substract_ten_minus_5_returns_five(){
        //given
        final int expected = 5;

        //when
        final int actual = Math.substraction(10,5);

        //then
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void multiply_ten_by_ten(){
        //given
        final int expected = 50;

        //when
        final int actual = Math.multiply(10,5);

        //then
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void divide_ten_by_five_returns_two(){
        //given
        final double expected = 2.0;

        //when
        final double actual = Math.divide(10,5);

        //then
        Assert.assertEquals(actual,expected);
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void divide_ten_by_zero_throws_illegal_argument_exception(){
        Math.divide(10,0);

    }
}
