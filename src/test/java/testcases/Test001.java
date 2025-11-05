package testcases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import Samples.FloorSquareRoot;

public class Test001 {
    // 测试用例1：验证11的floor平方根为3
    @Test
    public void testA() {
        assertEquals(3, FloorSquareRoot.floorSqrt(11));
    }

    // 测试用例2：验证20的floor平方根为4
    @Test
    public void testB() {
        assertEquals(4, FloorSquareRoot.floorSqrt(20));
    }
}