import org.junit.Test;

public class DiceTest {

    @Test
    public void testTossAndSum() {
        Dice dice = new Dice(2);

        Integer output = dice.tossAndSum();

        System.out.println(output);

    }

}