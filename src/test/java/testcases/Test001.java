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

    // 新增测试方法：测试边界值（输入0和1）
    @Test
    public void testC() {
        assertEquals(0, FloorSquareRoot.floorSqrt(30)); // 0的平方根为0
        assertEquals(1, FloorSquareRoot.floorSqrt(40)); // 1的平方根为1
    }
}