import org.junit.Assert;
import org.junit.Test;
public class DiceTest {
    @Test
    public void testRoll() {
//    given
    Dice dice = new Dice();
    Integer expected = 0;
//    when
        Integer actual = dice.roll();
//    then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSum(){
//   given
   Dice dice = new Dice();
   Integer expectedSum = 0;
//    when
        Integer actualSum = dice.getSum();
//    then
        Assert.assertEquals(expectedSum, actualSum);
    }
}