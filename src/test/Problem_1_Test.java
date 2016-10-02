import org.junit.Assert;
import org.junit.Test;

public class Problem_1_Test {

    @Test
    public void sumOfMultiplesWithRange2to5andMultiplesof3and5Returns8() {
        int[] multiples = {3,5};
        int result = Problem_1.sumOfMultiples(2,5,multiples);
        Assert.assertEquals(8,result);
    }

    @Test
    public void sumOfMultiplesWithRange2to10andMultiplesof3Returns18() {
        int[] multiples = {3};
        int result = Problem_1.sumOfMultiples(2,10,multiples);
        Assert.assertEquals(18,result);
    }

    @Test
    public void sumOfMultiplesWithRange0to15andMultiplesof3and5Returns60() {
        int[] multiples = {3,5};
        int result = Problem_1.sumOfMultiples(0,15,multiples);
        Assert.assertEquals(60,result);
    }

    @Test
    public void sumOfMultiplesWithRange0to999andMultiplesof3and5Returns60() {
        int[] multiples = {3,5};
        int result = Problem_1.sumOfMultiples(0,999,multiples);
        Assert.assertEquals(233168,result);
    }

    @Test
    public void sumOfMultiplesWithRange0to9andMultiplesof3and5Returns23() {
        int[] multiples = {3,5};
        int result = Problem_1.sumOfMultiples(0,9,multiples);
        Assert.assertEquals(23,result);
    }
}
