import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinsTest {
    Bins bin;
    @Before
    public void init(){
        bin = new Bins(1,5);
    }

    @Test
    public void numberOfResults() {
//        given
        Integer expected = 0;
//        when
        Integer actual = bin.numberOfResults(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void incrementBin() {
//        given
        Integer expected = 1;
        Integer rollResult = 2;
//        when
        bin.incrementBin(rollResult);
        Integer actual =  bin.numberOfResults(rollResult);
//        then
        Assert.assertEquals(expected, actual);
    }

}